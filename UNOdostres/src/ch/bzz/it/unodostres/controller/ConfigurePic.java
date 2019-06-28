package ch.bzz.it.unodostres.controller;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ConfigurePic {
		
		public static void main(String[] args) throws IOException {
			
		 {
			URL url = ConfigurePic.class.getResource("/Cards.jpg");
			System.out.println(url);
			BufferedImage bigImg = ImageIO.read(url);

			final int width = 79;
			final int height = 123;
			final int cols = 10;
			final int rows = 6;
			
			BufferedImage[] sprites = new BufferedImage[rows * cols];

			for (int i = 0; i < rows; i++) {
			    for (int j = 0; j < cols; j++) {
			        sprites[(i * cols) + j] = bigImg.getSubimage(j * width, i * height, width, height);
			    }
			}
			
			JFrame f = new JFrame();
			JPanel p = new JPanel() {
				@Override
	            protected void paintComponent(Graphics g) {
	                super.paintComponent(g);
	                g.drawImage(sprites[9], 0, 0, null);
	            }
			};
			f.add(p);
			f.pack();
			f.setVisible(true);
			
		}}
}
