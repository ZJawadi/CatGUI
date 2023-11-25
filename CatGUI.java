import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
/**
 * Random Cat Generator
 * Author: Zorah Jawadi
 * All images found online, none of them are mine nor do I claim copyright
 * Completed January 12, 2023
 */

public class CatGUI {
	
	/** main method */
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		makeGUI();
	}
	
	/**
	 * ButtonListener class
	 */
	static class ButtonListener implements ActionListener {
		
		/**
		 * changes the cat image to a randomly chosen one
		 * @param e the event to be performed
		 * */
		public void actionPerformed(final ActionEvent e) {
			int random = (int)(Math.random() * 14) +1;
			
			Image image = null;
		    try {
		    	if(random==1) {
		    		URL url = new URL("https://qph.cf2.quoracdn.net/main-qimg-18e9043a3d34b53b454d82aa43e3004f-lq");
		    		image = ImageIO.read(url);
		    	}
		    	else if(random==2) {
		    		URL url = new URL("https://i.chzbgr.com/full/9591568640/h988B4FAE/animal");
		    		image = ImageIO.read(url);
		    	}
		    	else if (random==3) {
		    		URL url = new URL("https://1.bp.blogspot.com/-DpjDG_NLzt0/VsTgS5fR_AI/AAAAAAAA-tM/IO4-hsNOyZY/s1600/ScreenShot6077.jpg");
		    		image = ImageIO.read(url);
		    	}
		    	else if (random==4) {
		    		URL url = new URL("http://s3.amazonaws.com/photography.prod.demandstudios.com/a71ee8e8-b556-4306-8c54-656d8cf5acc4.jpg");
		    		image = ImageIO.read(url);
		    	}
		    	else if(random==5) {
		    		URL url = new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQU0M4JVd2cSSMmaMLst1FcYNCbvK3P5g6WSw&usqp=CAU");
		    		image = ImageIO.read(url);
		    	}
		    	else if(random==6) {
		    		URL url = new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSjAsZ0j8m-DljaatTR6T2JHnKUbMAF3IXSDQ&usqp=CAU");
		    		image = ImageIO.read(url);
		    	}
		    	else if(random==7) {
		    		URL url = new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRudOSc5_l5f5bTRMwZResEvMhsuhTorgLylg&usqp=CAU");
		    		image = ImageIO.read(url);
		    	}
		    	else if(random==8) {
		    		URL url = new URL("https://img-9gag-fun.9cache.com/photo/apgQ1vE_460s.jpg");
		    		image = ImageIO.read(url);
		    	}
		    	else if(random==9) {
		    		URL url = new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS1RtTEA0-sYgaC8gsIuTdtisGrF84_SghPWmQtxehmHPfDNMPQlNTqun8nCqrIVhISw_M&usqp=CAU");
		    		image = ImageIO.read(url);
		    	}
		    	else if(random==10) {
		    		URL url = new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRJk5x16nnGWOmDM-6DYQD-aUQChyEKERr-aA&usqp=CAU");
		    		image = ImageIO.read(url);
		    	}
		    	else if(random==11) {
		    		URL url = new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSjVOT6s01sCR2RI0OO-su9Yb0RxmUAkU5y-A&usqp=CAU");
		    		image = ImageIO.read(url);
		    	}
		    	else if(random==12) {
		    		URL url = new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRm8m7daXqdYAdI4lR3bot79S0Acqoq7XKR4g&usqp=CAU");
		    		image = ImageIO.read(url);
		    	}
		    	else if(random==13) {
		    		URL url = new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTjdUMVNZlFVgi90bM5FktlD5f4yr65rl_pWw&usqp=CAU");
		    		image = ImageIO.read(url);
		    	}
		    	else if(random==14) {
		    		URL url = new URL("https://i.pinimg.com/564x/46/e3/a2/46e3a21b543e882f36b6eeb220f1a0df.jpg");
		    		image = ImageIO.read(url);
		    	}
	        } catch (IOException bruh) {
	        	bruh.printStackTrace();
	        }
		    
			JLabel catpic = new JLabel(new ImageIcon(image));
			makeGUI(catpic);
		}
	}
	
	/** Builds the GUI */
	public static void makeGUI() {
		JFrame frame = new JFrame("Random Cat Generator :3c");
	    frame.setSize(700, 570);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    
	    JPanel panel = new JPanel(); 
	    frame.add(panel);
	    panel.setBackground(Color.decode("#1E81B0"));
	    panel.setLayout(new BorderLayout());
	    panel.setBorder(new EmptyBorder(10,0,20,0));
	    
	    JPanel temp = new JPanel();
	    temp.setLayout(new FlowLayout());
	    temp.setBackground(Color.decode("#1E81B0"));
	    
	    JLabel title = new JLabel("Random Cat Generator", SwingConstants.CENTER);
	    title.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
	    title.setBorder(new EmptyBorder(0,0,10,0));
	    
	    Image image = null;
	    try {
            URL url = new URL("https://www.worldatlas.com/r/w768/upload/5d/05/9f/shutterstock-351575039.jpg");
            image = ImageIO.read(url);
        } catch (IOException e) {
        	e.printStackTrace();
        }
	    
		JLabel catpic1 = new JLabel(new ImageIcon(image));
		panel.add(catpic1, BorderLayout.CENTER);
	    
	    JButton generate = new JButton("Click to generate");
	    temp.add(generate);
	    
	    generate.addActionListener(new ButtonListener());
	    
	    panel.add(title, BorderLayout.NORTH);
	    panel.add(temp, BorderLayout.SOUTH);
	    frame.setVisible(true);
	}
	
	/**
	 * Builds the GUI with a new cat image
	 * @param catpic a JLabel with the new cat image
	 */
	public static void makeGUI(JLabel catpic) {
		JFrame frame = new JFrame("Random Cat Generator :3c");
	    frame.setSize(700, 570);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    JPanel panel = new JPanel(); 
	    frame.add(panel);
	    panel.setBackground(Color.decode("#1E81B0"));
	    panel.setLayout(new BorderLayout());
	    panel.setBorder(new EmptyBorder(10,0,20,0));
	    
	    JPanel temp = new JPanel();
	    temp.setLayout(new FlowLayout());
	    temp.setBackground(Color.decode("#1E81B0"));
	    
	    JLabel title = new JLabel("Random Cat Generator", SwingConstants.CENTER);
	    title.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
	    title.setBorder(new EmptyBorder(0,0,10,0));
	    
		panel.add(catpic, BorderLayout.CENTER);
	    
	    JButton generate = new JButton("Click to generate");
	    temp.add(generate);
	    
	    generate.addActionListener(new ButtonListener());
	    
	    panel.add(title, BorderLayout.NORTH);
	    panel.add(temp, BorderLayout.SOUTH);
	    frame.setVisible(true);
	}
}//end class CatGUI
