import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGameTwo {
public static void main(String[] args) {
 int random = new Random().nextInt(100);
 for(int i = 0; i<100; i++)
 { 
 String answer = JOptionPane.showInputDialog("Guess a number between 1 and 100.");
 int guess = Integer.parseInt(answer);
 if(guess > random)
 {
	 JOptionPane.showMessageDialog(null, "Lower!");
 }
 if(guess < random)
 {
	 JOptionPane.showMessageDialog(null, "Higher!");
 }
 if(guess == random)
 {
	 JOptionPane.showMessageDialog(null,  "You win!");
	 System.exit(random);
 }
}
}
}