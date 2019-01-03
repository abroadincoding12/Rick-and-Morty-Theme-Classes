import javax.swing.JOptionPane;

public class MrMeeseeks { //Another character from Rick and Morty
	public static void main(String[] args) {
		
		String fn = JOptionPane.showInputDialog("Enter a number ");
		String sn = JOptionPane.showInputDialog("Enter another number");
		
		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);
		int sum = num1 + num2;
		
		JOptionPane.showMessageDialog(null, "Wowee, the answer is " + sum, "chief",
				JOptionPane.PLAIN_MESSAGE);
	}

}
