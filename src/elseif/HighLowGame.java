//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(101);
		// 2. Print out the random variable above
		System.out.println(random);
		
		// 11. do the following 10 times
		
			// 1. ask the user for a guess using a pop-up window, and save their response 
String t = JOptionPane.showInputDialog("gimme a guess between 1 and 100!");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			int a =Integer.parseInt(t);
			// 5. if the guess is correct
				// 6. win
			if(a==random) {
				JOptionPane.showMessageDialog(null, "ya win!");
			}
			// 7. if the guess is high
				// 8. tell them it's too high
			else if(a>random) {
				JOptionPane.showMessageDialog(null, "too high! ya lose!");
			}
			// 9. if the guess is low
				// 10. tell them it's too low
			else if(a<random) {
				JOptionPane.showMessageDialog(null, "too low! ya lose!");
			}
		// 12. tell them they lose
	}

}


