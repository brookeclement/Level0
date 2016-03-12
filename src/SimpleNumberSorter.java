import javax.swing.JOptionPane;

public class SimpleNumberSorter {
	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("Please type a number.");
		String num2 = JOptionPane.showInputDialog("Type in another number.");
		String num3 = JOptionPane.showInputDialog("Type in one more number.");

		int number1 = Integer.parseInt(num1);
		int number2 = Integer.parseInt(num2);
		int number3 = Integer.parseInt(num3);

		for (int i = 0; i < 3; i++) {
			int tempNum;
			if (number1 < number2) {
				tempNum = number1;
				number1 = number2;
				number2 = tempNum;
			}
			if (number2 < number3) {
				tempNum = number2;
				number2 = number3;
				number3 = tempNum;
			}
		}
		JOptionPane.showMessageDialog(null, number1 + " " + number2 + " " + number3);
	}
}
