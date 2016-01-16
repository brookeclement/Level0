import javax.swing.JOptionPane;

public class EverythingIsAwesome {
	public static void main(String[] args) {
		String everything = JOptionPane.showInputDialog("Type something you like!");
		JOptionPane.showMessageDialog(null, everything + " is awesome!");
	}

}
