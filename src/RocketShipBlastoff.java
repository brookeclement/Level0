import javax.swing.JOptionPane;

public class RocketShipBlastoff {
	public static void main(String[] args) {
		for(int i=10; i>0; i--){
			JOptionPane.showMessageDialog(null, i);
		}
		JOptionPane.showMessageDialog(null, "Blastoff!");
	}

}
