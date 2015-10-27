package com.sefas.testone;

import java.awt.HeadlessException;

import javax.swing.JFrame;

public class Mainframe extends JFrame {


	public Mainframe() throws HeadlessException {
		super();
		setBounds(100, 100, 800, 600);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}


	public static void main(String[] args) {
		Mainframe mainframe = new Mainframe();
		GreetingGenerator greetingGenerator = new GreetingGenerator();
		mainframe.setTitle(greetingGenerator.generate());
		mainframe.setVisible(true);
	}

}
