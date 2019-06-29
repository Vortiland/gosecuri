package test;

import javax.swing.JFrame;

import controller.WebcamCapture;

public class TestWebcam {

	public static void main(String[] agrs) {
		
		JFrame test = new JFrame();
		
		WebcamCapture webcam = new WebcamCapture(test);
		
		test.setContentPane(webcam);
		
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		test.pack();
		
		test.setVisible(true);
		
	}
	
}
