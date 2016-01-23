import javax.swing.JOptionPane;

public class RiddleMeThis {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/the-riddler
String ans1 = JOptionPane.showInputDialog("What goes up when rain comes down?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(ans1.equals("umbrella"))
		// 5. Otherwise, say "wrong" and tell them the answer
{JOptionPane.showMessageDialog(null, "Correct!");
		// 6. Add some more riddles
}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your score is " + score);
	}
}
