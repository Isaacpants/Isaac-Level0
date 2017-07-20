
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

/**
 * Airline registration
 * 
 * You are writing a program for a new airline to take their registration
 * information at the check-in counter and print their boarding pass. You need
 * to collect the following information: First name Last name Destination
 * airport Birthday (for security purposes) Male/female (for security purposes)
 * 
 * Print the boarding pass in this format: LAST NAME / FIRST NAME (BIRTHDAY,
 * M/F) Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class AirLineRegistration {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {

			String Fname = JOptionPane.showInputDialog("What is your first name");
			String Lname = JOptionPane.showInputDialog("what is your last name");
			String Bday = JOptionPane.showInputDialog("What is your birthday");
			String Gender = JOptionPane.showInputDialog("Are you male or female");
			String Destination = JOptionPane.showInputDialog("What is your destination");
			System.out.println(Fname + " " + Lname + " " + Bday + " " + Gender + " " + Destination);
			System.out.println("passanger number " + (i + 1));
		}
	}
}

/**
 * Extra Difficult Challenge: have the program repeat until plane is full (10
 * passenger plan) and print out the number of passengers after each boarding
 * pass.
 */
