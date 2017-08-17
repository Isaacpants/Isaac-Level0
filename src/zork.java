import javax.swing.JOptionPane;

public class zork {
	public static void main(String[] args) {
		String place = JOptionPane.showInputDialog(null, "You are in an open field west of a big house. There is a welcome mat and a mail box");
		if (place.equalsIgnoreCase("Go to the house")) {
			String location = JOptionPane.showInputDialog(null, "You are at the house");
			if (location.equalsIgnoreCase("Open the mailbox")) {

				JOptionPane.showMessageDialog(null,
						"Congradulations you found the dog. Here is 10000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000dollars");
			} else {
				JOptionPane.showMessageDialog(null, "A LEPRECHAUN KILLED YOU!");
			}

		} else {
			JOptionPane.showMessageDialog(null, "A LEPRECHAUN KILLED YOU!");
		}

	}
}
