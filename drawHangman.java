import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JFrame;



public class drawHangman extends JFrame {

        drawHangman (String name)
        {
                super(name);
                setSize (500, 500); 
                setVisible (true);
                setDefaultCloseOperation (EXIT_ON_CLOSE);

        }

        public void paint (Graphics g)
        {
                Dimension d = getSize (); 
                g.setColor (Color.BLACK); //white board 
               g.drawLine(200, 200, 150, 250);
               g.drawLine(200, 200, 250, 250); 
               g.drawLine(150, 150, 200, 175);
               g.drawLine(250, 150, 200, 175); 
               g.drawLine(200, 200, 200, 175); 
               g.drawLine(200, 150, 200, 175); 
               g.drawOval(175, 100, 50, 50);
               // Draw gibbet
		g.drawLine(100, 300, 100, 50);
		g.drawLine(200, 50, 100, 50);
		g.drawLine(200, 100, 200, 50);

	}

		



        public static void main(String[] args) {
                drawHangman s = new drawHangman ("My First Drawing"); 


        }

}
