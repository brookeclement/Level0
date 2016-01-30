import javax.swing.JOptionPane;

public class Unbirthday {

	public static void main(String[] args) {
		String day = JOptionPane.showInputDialog("When is your birthday?");
		if(day.equals("January 29"))
		{
			JOptionPane.showMessageDialog(null, "Happy birthday!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Happy Unbirthday!");
		}
	}
	
}
