import javax.swing.JOptionPane;

public class RUHappy {
	public static void main(String[] args) {
		String Happy = JOptionPane.showInputDialog("Are you happy");
		if (Happy.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep Doing Whatever You're Doing");
		} else {
			String mad = JOptionPane.showInputDialog("Do you want to be happy");
			if (mad.equals("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
			} else {
				JOptionPane.showMessageDialog(null, "Change something");
			}
		}
	}
}
