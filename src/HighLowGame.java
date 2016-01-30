import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100.
		int random = new Random().nextInt(100);
		// 2. Print out the random variable above
		 //JOptionPane.showMessageDialog(null, random);
		// 11. do the following 10 times

		for (int i = 0; i < 10; i++) {
			String ans1 = JOptionPane.showInputDialog("Please make a guess.");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			int ans2 = Integer.parseInt(ans1);

			// 5. if the guess is correct
			if (ans2 == random) {
				JOptionPane.showMessageDialog(null, "Correct! You win!");
				System.exit(i);
			}
			// 6. win
			// 7. if the guess is high
			if (ans2 > random) {
				JOptionPane.showMessageDialog(null, "Too high.");
			}

			// 8. tell them it's too high
			// 9. if the guess is low
			if (ans2 < random) {
				JOptionPane.showMessageDialog(null, "Too low.");
			}
		}
		// 10. tell them it's too low
JOptionPane.showMessageDialog(null, "You lose!");
		// 12. tell them they lose
	}
}