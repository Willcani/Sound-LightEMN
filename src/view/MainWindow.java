package view;

import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;

import processing.MainProcessing;
import sound.MusicFile;

public class MainWindow extends JFrame {

	private MainProcessing test;

	public MainWindow() {
		super("Sound & Light");
		this.setSize(900,900);
		//this.setSize(this.getParent().getSize());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		MainProcessing test = new MainProcessing(this);
		this.test = test;

		JPanel panel = new JPanel();

		panel.add(test);
		this.add(panel);
		test.init();
	}
	
	public MainProcessing getApplet(){
		return this.test;
	}

}
