package view;

import java.awt.Dimension;

import javax.swing.JFrame;

public class UI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static UI mainFrame = new UI();
	
	/**
	 * default cnstructor with 500, 500 dimensions and "Welcome to GoSecuri" as
	 * title
	 */
	public UI() {
		this(new Dimension(500, 500), "Welcome to GoSecuri");
	}

	/**
	 * 
	 * @param dimension
	 * @param title
	 */
	public UI(Dimension dimension, String title) {
		this.setTitle(title);
		this.setSize(dimension);
	}

	/**
	 * set new dimension and title
	 */
	public void set(Dimension dimension, String title) {
		this.setTitle(title);
		this.setSize(dimension);
	}

}
