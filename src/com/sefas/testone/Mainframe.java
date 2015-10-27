package com.sefas.testone;

import java.awt.HeadlessException;

import javax.swing.JFrame;

public class Mainframe extends JFrame {


	public Mainframe() throws HeadlessException {
		super();
		setBounds(100, 100, 800, 600);
		setTitle("TestOne v.0.0.2");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mainframe mainframe = new Mainframe();
		mainframe.setTitle("Hello");
		mainframe.setVisible(true);
	}

}
