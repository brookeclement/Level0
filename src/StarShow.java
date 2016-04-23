import org.jointheleague.graphical.robot.Robot;

public class StarShow {
	public static void main(String[] args) {
	Robot robot = new Robot();
robot.show();
robot.penDown();
robot.setSpeed(10);
for(int i=0; i<5; i++)
{
robot.move(200);
robot.turn(144);
}
	}

}
