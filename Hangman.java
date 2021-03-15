import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;




	public class Hangman extends JFrame {
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
               // Draw gibbet
		g.drawLine(100, 300, 100, 50);
		g.drawLine(200, 50, 100, 50);
		g.drawLine(200, 100, 200, 50);

	}
		
		public void incorrectPaint(int attempt) { 
			switch(attempt) {
				case 1:
				   
		       g.drawLine(200, 200, 150, 250);
				   break;
				case 2:
				    
		       g.drawLine(200, 200, 250, 250); 
				   break;
				case 3:
				    
		       g.drawLine(150, 150, 200, 175);
				   break;
				case 4:
				    
		       g.drawLine(250, 150, 200, 175); 
				   break;
				case 5:
				    
		       g.drawLine(200, 200, 200, 175); 
				   break;
				case 6:
				    
		       g.drawLine(200, 150, 200, 175); 
				   break;
				case 7:
				    
		       g.drawOval(175, 100, 50, 50);
				   break;
				default:
					System.out.println("internal error: incorrect input");
				    // code block
}
		}
			
    	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		while (true) {
	System.out.print("User 1, enter a word between 4 and 8 characters long: ");
	
	String input = reader.nextLine();
	if (input.length() < 3) {  
	System.out.println("Word is too short ");
        System.out.println("Please re-enter");
        continue;
      	}
      else if (input.length() > 9) {
      System.out.println("word is too long");
      System.out.println("please re-enter");
      }
	else {
	input = input.toUpperCase();
	boolean finalSolved = false;
    int attempt = 7;
    String wordsFound="";
    boolean some = true;
		
		
		
	while (!finalSolved){
	for (int i = 0; i < input.length(); i++)
        {
        some = false;
        for (int n = 0; n < wordsFound.length(); n++) {
        if (input.charAt(i) == wordsFound.charAt(n)) {
        	System.out.print(wordsFound.charAt(n));
        	some = true;
        	break;
        }
        }
        if (!some){System.out.print("_");}
        }
    System.out.println(" ");
	if (wordsFound.length() == input.length()) {
	System.out.println("congrats, you won");
	break;
	}
	else if (attempt == 0) {
	System.out.println("you lose");
	break;
	}
	System.out.println("\nAttempts left: " + attempt);

    System.out.println(' ');
    boolean aw = false;
    Scanner reader1 = new Scanner(System.in);
    System.out.print("User 2, enter a letter: ");
    String input2 = reader1.nextLine();
    input2 = input2.toUpperCase();
    for (int i=0; i < wordsFound.length(); i++) {
    if (input2.charAt(0) == wordsFound.charAt(i)) {
    System.out.println("already written");
    aw=true;
    break;
    }
    }
    if (aw==true) {continue;}
    for (int i = 0; i < input.length(); i++) {    
    if (input2.charAt(0) == input.charAt(i)) {
	wordsFound += input2;
	aw=true;
	}
	}
	if (!aw) {
	System.out.println("Incorrect guess"); 
	incorrectPaint(attempt);
	attempt--;
	}
	else {System.out.println("You have guessed correct!");}
	
	}
	}
	break;
	}
	}
	}
	
	
