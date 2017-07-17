import org.jointheleague.graphical.robot.Robot;

public class Grafitti {
	public static void main(String[] args) {
		Robot r2d2 = new Robot();
		r2d2.penDown();
		r2d2.setSpeed(10);
		r2d2.move(500);
		r2d2.turn(90);
		r2d2.move(250);
		r2d2.turn(180);
		r2d2.move(500);
		r2d2.turn(180);
		r2d2.move(250);
		r2d2.turn(90);
		r2d2.move(500);
		r2d2.turn(90);
		r2d2.move(250);
		r2d2.turn(180);
		r2d2.move(500);
	}
}
