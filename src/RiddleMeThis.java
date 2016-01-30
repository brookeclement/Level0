import javax.swing.JOptionPane;

public class RiddleMeThis {

	public static void main(String[] args) {

		int i = 0;

		String ans1 = JOptionPane.showInputDialog("What goes up when rain comes down?");

		if (ans1.equals("umbrella"))

		{
			JOptionPane.showMessageDialog(null, "Correct!");
			//i++;
			JOptionPane.showMessageDialog(null, "Your score is " + ++i);

		} else {
			JOptionPane.showMessageDialog(null, "Incorrect. The answer is umbrella.");
			JOptionPane.showMessageDialog(null, "Your score is " + i);

		}
		String ans2 = JOptionPane.showInputDialog("What gets bigger the more you take from it?");

		if (ans2.equals("hole"))

		{
			JOptionPane.showMessageDialog(null, "Correct!");
			//i++;
			JOptionPane.showMessageDialog(null, "Your score is " + ++i);

		} else {
			JOptionPane.showMessageDialog(null, "Incorrect. The answer is hole.");
			JOptionPane.showMessageDialog(null, "Your score is " + i);

		}

	}
}
