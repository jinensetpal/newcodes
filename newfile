import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;



	public class Hangman {
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
	attempt--;
	}
	else {System.out.println("You have guessed correct!");}
	
	}
	}
	break;
	}
	}
	}
	
	
