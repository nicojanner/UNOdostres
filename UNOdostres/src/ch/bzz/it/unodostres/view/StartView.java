package ch.bzz.it.unodostres.view;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartView extends JFrame {

	private static final long serialVersionUID = 1L;

	//JButton startButton = new JButton();
	JPanel picturePanel = new JPanel();
	picturePanel = new ImageIcon("resources/startScreen.jpg");

	public StartView() {
		getContentPane().setLayout(new BorderLayout());
		//getContentPane().add(startButton);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().add(picturePanel);
		setVisible(true);
		setSize(300, 300);
		
	}
	
	public static void main(String[] args) {
		StartView st = new StartView();
	}
	


}
