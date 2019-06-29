package view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import controller.WebcamCapture;

public class PanelDisconnection extends JPanel implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	private UI frameMain;

	private JButton buttonDisconnection;

	/**
	 * 
	 * @param mainFrame
	 */
	public PanelDisconnection() {
		this.frameMain = UI.mainFrame;

		this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));

		buttonDisconnection = new JButton("Deconnexion");
		buttonDisconnection.addActionListener(this);
		buttonDisconnection.setPreferredSize(new Dimension(150, 20));

		this.add(buttonDisconnection);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Clique sur le bouton deconnexion / depuis " + this.getClass());
		UI.mainFrame.getContentPane().removeAll();
		UI.mainFrame.revalidate();
		UI.mainFrame.repaint();
		UI.mainFrame.setContentPane(WebcamCapture.cam);
	}

}
