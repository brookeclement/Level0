import java.util.Random;

import javax.swing.JOptionPane;

public class KnockKnockJoke {
	public static void main(String[] args) {
		int answer = new Random().nextInt(3);
		if (answer == 0) {
			for (int i = 0; i < 4; i++) {
				JOptionPane.showInputDialog("Knock knock!");
				if (i == 3) {
					JOptionPane.showInputDialog("Orange.");
					JOptionPane.showMessageDialog(null, "Orange you glad I didn't say banana?");
				} else
					JOptionPane.showInputDialog("Banana.");
			}
		}
		if (answer == 1) {
			JOptionPane.showInputDialog("Knock knock!");
			JOptionPane.showInputDialog("Boo.");
			JOptionPane.showMessageDialog(null, "Don't cry,it was only a joke!");
		}
		if (answer == 2) {
			JOptionPane.showInputDialog("Knock knock!");
			JOptionPane.showInputDialog("Cows go.");
			JOptionPane.showMessageDialog(null, "No, cows go moo!");
		}
	}

}
