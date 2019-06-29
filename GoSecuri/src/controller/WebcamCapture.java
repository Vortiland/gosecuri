package controller;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;

import org.opencv.core.CvType;
import org.opencv.core.Mat;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;

import view.UI;

public class WebcamCapture extends JPanel implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static WebcamCapture cam = new WebcamCapture();
	
	// panneau pour les boutons
	private JPanel panelButtons;

	// bouton qui prend la photo
	private JButton buttonPicture;

	// la webcam
	private Webcam webcam;

	// le panneau qui retransmet la webcam
	private WebcamPanel panelWebcam;

	// la photo prise
//	private BufferedImage photo;

	public WebcamCapture() {
		
		panelButtons = new JPanel();

		buttonPicture = new JButton("Prendre la photo");

		buttonPicture.addActionListener(this);

		panelButtons.add(buttonPicture);

		// take control of the webcam
		webcam = Webcam.getDefault();

		panelWebcam = new WebcamPanel(webcam);

		this.setLayout(new BorderLayout());

		this.add(panelWebcam, BorderLayout.CENTER);
		this.add(panelButtons, BorderLayout.EAST);
		
		UI.mainFrame.set(new Dimension(600, 700), "Selectionné vos équipements");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String path = "D:\\Toncourt_Robin\\imgGoSecuri.jpg";
		
		BufferedImage photo = webcam.getImage();

		File output = new File(path);

		try {
			ImageIO.write(photo, "jpg", output);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		System.out.println(path);
		
		if (faceRecognition(output)) {
			GoSecuri goSecuri = new GoSecuri();

			goSecuri.show(path);
		}

	}

	public boolean faceRecognition(File image) {
		// test the face
		return true;
	}

	public static Mat bufferedImageToMat(BufferedImage bi) {
		Mat mat = new Mat(bi.getHeight(), bi.getWidth(), CvType.CV_8UC3);
		byte[] data = ((DataBufferByte) bi.getRaster().getDataBuffer()).getData();
		mat.put(0, 0, data);
		return mat;
	}

}
