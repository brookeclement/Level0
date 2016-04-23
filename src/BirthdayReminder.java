 // Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "March 12th";
		String dadsBirthday = "May 11th";
		String myBirthday = "March 22nd";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String birth = JOptionPane.showInputDialog("Whose birthday do you want to be reminded of?");
		// 3. Print out what the user typed
		
		// 4. if user asked for "mom"
	if(birth.equalsIgnoreCase("mom"))
	{
		JOptionPane.showMessageDialog(null, "Oh! Her birthday is " + momsBirthday);
		
	}
			//print mom's birthday
		// 5. if user asked for "dad"
	else if(birth.equalsIgnoreCase("dad"))
	{
		JOptionPane.showMessageDialog(null, "Oh! His birthday is " + dadsBirthday);
		
	}
			// print dad's birthday
		// 6. if user asked for your name
	else if(birth.equalsIgnoreCase("Brooke"))
	{
		JOptionPane.showMessageDialog(null, "Oh! Her birthday is " + myBirthday);
		
	}
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
	else
	{
		JOptionPane.showMessageDialog(null, "Sorry... I don't remember that person's birthday!");
	}
	} 
}