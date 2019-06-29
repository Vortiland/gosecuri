package test;

import javax.swing.JFrame;

import controller.WebcamCapture;
import view.UI;

public class TestWebcam {

	public static void main(String[] agrs) {

		UI test = new UI();

		WebcamCapture webcam = new WebcamCapture();

		test.setContentPane(webcam);

		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		test.pack();

		test.setVisible(true);

	}

}
