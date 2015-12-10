package Programs;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Encrypt extends Decrypt {

	static String state="gkdfashasldkfjhksjhfaskdjhflskdfhjlaksdhjfklasdjfhlkasdjfhgkdfashasldkfjhksjhfaskdjhflskdfhjlaksdhjfklasdjfhlkasdjfhgkdfashasldkfjhksjhfaskdjhflskdfhjlaksdhjfklasdjfhlkasdjfhgkdfashasldkfjhksjhfaskdjhflskdfhjlaksdhjfklasdjfhlkasdjfhgkdfashasldkfjhksjhfaskdjhflskdfhjlaksdhjfklasdjfhlkasdjfhgkdfashasldkfjhksjhfaskdjhflskdfhjlaksdhjfklasdjfhlkasdjfhgkdfashasldkfjhksjhfaskdjhflskdfhjlaksdhjfklasdjfhlkasdjfhgkdfashasldkfjhksjhfaskdjhflskdfhjlaksdhjfklasdjfhlkasdjfhgkdfashasldkfjhksjhfaskdjhflskdfhjlaksdhjfklasdjfhlkasdjfh";


	public static void encrypt(){
		JFrame frame=new JFrame("Encryption");

		int r;
		int g;
		int b;
		float[] extraR=new float[50];
		float[] extraG=new float[50];
		float[] extraB=new float[50];

		for(int i=0;i<50;i++){
			r= (int) (Math.random()*256);
			g= (int) (Math.random()*256);
			b= (int) (Math.random()*256);

			extraR[i]=r;
			extraG[i]=g;
			extraB[i]=b;
		}

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,600);


		frame.setLayout(null);

		/*JPanel pane = new JPanel(){
			private static final long serialVersionUID = 1L;

			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(image, 0, 0, this);

			}
		};*/
		
		JLabel background=new JLabel(new ImageIcon("/Users/Rithvik/Desktop/test.png"));
		background.setSize(600,600);
		frame.add(background);
		background.setLayout(new FlowLayout());
		
		
		
		
		frame.setVisible(true);

		try

		{
			BufferedImage image = new BufferedImage(frame.getWidth(), frame.getHeight(), BufferedImage.TYPE_INT_RGB);
			Graphics2D graphics2D = image.createGraphics();
	        frame.paint(graphics2D);
	        
			ImageIO.write(image,"png", new File("/Users/Rithvik/Desktop/pngPractice.png"));
		}
		catch(Exception exception)
		{
			
		}

	}
}
