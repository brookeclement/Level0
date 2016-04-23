import javax.swing.JOptionPane;

public class IKnowWhatYouDidLastSummer {
	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("What's your name?");
		String event = JOptionPane.showInputDialog("What did you do last summer?");
		JOptionPane.showMessageDialog(null, name + ", I know what you did last summer... You " + event);
		
	}

}
