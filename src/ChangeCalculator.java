// Copyright The League of Amazing Programmers 2014
import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nickels = JOptionPane.showInputDialog("How many dimes do you have?");
		// Convert their answer to an int using Integer.parseInt()
int realNickels = Integer.parseInt(nickels);
		// Ask the user how many dimes they have, and convert their answer
double money = realNickels*.05;
		// Ask the user how many quarters they have, and convert their answer
String quarters = JOptionPane.showInputDialog("How many quarters do you have?");
		// Calculate how much money the user has and save it in a double variable 
int realQuarters = Integer.parseInt(quarters);
double money2 = realQuarters*.25;
double  total = money+money2;
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, "Your total amount of change is $" + total + ".");
	}
}