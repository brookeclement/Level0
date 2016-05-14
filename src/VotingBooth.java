import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String candidate = JOptionPane.showInputDialog("Who would you vote for?");
	if(candidate.equalsIgnoreCase("Trump"))
	{
		JOptionPane.showMessageDialog(null, "...Are you alright? I worry about your mental health...");
		System.exit(0);
	}
	String age = JOptionPane.showInputDialog("What is your age?");
	int voteAge = Integer.parseInt(age);
	if(voteAge >= 18)
	{
		JOptionPane.showMessageDialog(null, candidate + " will become president!");
	}
	else
	{
		JOptionPane.showMessageDialog(null, "You're not old enough to vote yet...");
	}
}
}
