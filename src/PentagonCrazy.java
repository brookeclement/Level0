import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the robot will have to turn (360/5) */

public class PentagonCrazy {

	private void makePrettyThings() {
	
Robot brooke = new Robot();
		
brooke.penDown();
		
brooke.setSpeed(10);
		
		

		
int angle = 360/5;
		
for(int i=0; i< 200;i++){
		
	brooke.move(i);
			
	brooke.setPenWidth(1);
	
			
	brooke.turn(angle+1);
			
}
	}

	// Variations:
	
	
	// *14. experiment with different shapes

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}
