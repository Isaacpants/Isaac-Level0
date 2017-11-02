import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class CheckPoint {
public static void main(String[] args) {
	
	String color = JOptionPane.showInputDialog("What is your favorite color");
	
	JOptionPane.showMessageDialog(null, "I also like"+" "+color);
	
	Robot r2d2 = new Robot();
	r2d2.setSpeed(100);
	r2d2.hide();
	r2d2.penDown();
	
		
	for (int i = 0; i < 3; i++) {
		
	
	r2d2.move(20);
	r2d2.turn(120);	
	}
	
	
	
	
	
	
}
}
