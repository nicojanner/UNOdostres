package ch.bzz.it.unodostres.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class StartView extends JFrame {

	private static final long serialVersionUID = 1L;

	JButton startButton = new JButton("Start"); 
	JLabel label = new JLabel(new ImageIcon("resources/startScreen.jpg"));

	public StartView() {
		setTitle("UNOdostres");
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(startButton);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().add(label);
		setVisible(true);
		setResizable(false);
		pack();
		
		startButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}
	
	public static void main(String[] args) {
		StartView st = new StartView();
	}

}
