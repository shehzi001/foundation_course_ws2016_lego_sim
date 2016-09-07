
//SimEx1.java
//Motors
package SimRobot;

import ch.aplu.robotsim.LegoRobot;
import ch.aplu.robotsim.Motor;
import ch.aplu.robotsim.MotorPort;
import ch.aplu.robotsim.Tools;

public class SimEx1 {
	public SimEx1() {
		LegoRobot robot = new LegoRobot();
		Motor motA = new Motor(MotorPort.A);
		Motor motB = new Motor(MotorPort.B);
		robot.addPart(motA);
		robot.addPart(motB);

		motA.forward();
		motB.forward();
		Tools.delay(2000);

		motA.stop();
		Tools.delay(2000);

		motB.stop();
		Tools.delay(2000);

		motA.backward();
		motB.forward();
		Tools.delay(2000);

		motB.backward();
		Tools.delay(2000);

		robot.exit();
	}

	public static void main(String[] args) {
		new SimEx1();
	}
}
