import javax.swing.JOptionPane;

public class MadLibsOfTheAmazon {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
JOptionPane.showMessageDialog(null, "If you find yourself having to cross a pirahna-infested river, here's how to do it...");
		// Get the user to enter an adjective
String adj1 = JOptionPane.showInputDialog("Type an adjective.");
		// Get the user to enter a type of liquid
String liquid1 = JOptionPane.showInputDialog("Type in a liquid");
		// Get the user to enter a body part
String body1 = JOptionPane.showInputDialog("Type a body part.");
		// Get the user to enter a verb
String verb1 = JOptionPane.showInputDialog("Type a verb.");
		// Get the user to enter a place
String place1 = JOptionPane.showInputDialog("Type a place.");
		// Fit the user's words into this sentence, and save it in a String:
JOptionPane.showMessageDialog(null, "Piranhas are more " +adj1+" during the day, so cross the river at night. Piranhas are attracted to fresh " +liquid1+" and will most likely take a bite out of your "+body1+" if you "+verb1+". Whatever you do, if you have an open wound, try to find another way to get back to the "+place1+". Good luck!");
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		
		// Make a pop-up for the final story. You can use \n to go to the next line.
		

	}
}