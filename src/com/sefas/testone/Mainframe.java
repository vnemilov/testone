package com.sefas.testone;

import java.awt.HeadlessException;

import javax.swing.JFrame;

public class Mainframe extends JFrame {


	public Mainframe() throws HeadlessException {
		super();
		setBounds(100, 100, 400, 300);
		setTitle("TestOne v.0.0.1");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mainframe mainframe = new Mainframe();
		mainframe.setVisible(true);
	}

}
