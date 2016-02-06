import javax.swing.JOptionPane;

public class SpudCounter {
	public static void main(String[] args) {
		for(int i=0; i<7;i++)
		{
			JOptionPane.showMessageDialog(null, i+1);
			if(i != 3)
			{
				JOptionPane.showMessageDialog(null, "Potato");
			}
		
			}
		JOptionPane.showMessageDialog(null, "More");
	}

}
