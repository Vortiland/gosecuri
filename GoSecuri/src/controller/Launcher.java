package controller;

import java.awt.Dimension;

import javax.swing.JFrame;

import view.UI;

public class Launcher {

	public static void main(String[] args) {
		
		UI test = UI.mainFrame;
		
		test.set(new Dimension(500, 500), "Prenez une photo");

		WebcamCapture webcam = WebcamCapture.cam;

		test.setContentPane(webcam);

		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		test.pack();

		test.setVisible(true);

	}

}
