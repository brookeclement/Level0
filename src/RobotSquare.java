import org.jointheleague.graphical.robot.Robot;

public class RobotSquare {
	public static void main(String[] args) throws Exception {
		// 1. Make a new Robot
		Robot brooke = new Robot();
		brooke.show();
		// 3. Put the robot's pen down
		brooke.penDown();
		// 6. Make the tortoise move as fast as possible
		brooke.setSpeed(10);
		// 5. Do everything below here 4 times
		for (int i = 0; i < 4; i++) {
			// 2. Move your robot 200 pixels
			brooke.move(200);
			// 4. Turn the robot 90 degrees to the right (90 degrees)
			brooke.turn(90);
		}
	}
}
