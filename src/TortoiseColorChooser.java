// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class TortoiseColorChooser {
	public static void main(String[] args) {
		
		new Tortoise();
		//3. ask the user what color they would like the tortoise to draw
		String choice = JOptionPane.showInputDialog("What's you favorite primary color?");
String shape = JOptionPane.showInputDialog("Choose a shape, too!");
		
		//4. use an if/else statement to set the pen color that the user requested
		
		
if(choice.equals("red"))
	
{
	Tortoise.setPenColor(Color.red);
}
else if(choice.equals("blue"))
{
	Tortoise.setPenColor(Color.blue);
}
else if(choice.equals("yellow"))
{
	Tortoise.setPenColor(Color.yellow);
}
else
{
	JOptionPane.showMessageDialog(null, "That's not a primary color... Here's a random color!");
	Tortoise.setPenColor(Colors.getRandomColor());
}
//5. if the user doesn’t enter anything, choose a random color

//6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		Tortoise.setPenWidth(10);
		Tortoise.setSpeed(10);
	//1. make the tortoise draw a shape (this will take more than one line of code)
 
 Tortoise.show();
 Tortoise.penDown();
 if(shape.equalsIgnoreCase("triangle"))
 {
	 for(int i = 0; i<3; i++)
	 {
		 Tortoise.move(100);
		 Tortoise.turn(120);
	 }
 }
 else if(shape.equalsIgnoreCase("square")){
 for(int i=0;i<4;i++)
 {
	 Tortoise.move(100);
	 Tortoise.turn(90);
 }
 }

	}
}

