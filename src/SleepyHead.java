
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation = false;
		int Vacation = JOptionPane.showConfirmDialog(null, "are you on vacation", "", JOptionPane.YES_NO_OPTION);
		if (Vacation == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "sleep in");
		} else {

			int Weekday = JOptionPane.showConfirmDialog(null, "Is it a weekday", "", JOptionPane.YES_NO_OPTION);
			if (Weekday == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null, "Get up you lazy bones");
			} else {
				JOptionPane.showMessageDialog(null, "sleep in");
			}
		}
		/*
		 * Ask the user for these values using JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
		 * JOptionPane.YES_NO_OPTION);
		 */

		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday, print “get up lazy bones!” If it is a
		 * weekday, and we are on vacation, print “sleep in”.
		 */
	}
}
