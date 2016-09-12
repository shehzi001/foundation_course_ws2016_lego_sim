package test;

import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.SensorPort;
import sensors.IPAccelerometer;
import sensors.IPGyroscope;

public class testClass {
	public static void main(String[] args) {
		IPAccelerometer acc = new IPAccelerometer(SensorPort.S1);
		IPGyroscope gyro = new IPGyroscope(SensorPort.S2);

		while (Button.ESCAPE.isUp()) {
			if (Button.ENTER.isDown()) {
				System.out.print("Calibrating accelerometer...\n");
				acc.calibrateAcc();
				System.out.print("Calibrating gyroscope...\n");
				gyro.calibrateGyro();
			}
			LCD.drawString("AccX:" + acc.getAccX(), 0, 0);
			LCD.drawString("AccY:" + acc.getAccY(), 0, 1);
			LCD.drawString("AccZ:" + acc.getAccZ(), 0, 2);
			LCD.drawString("AngVel:" + gyro.getAngVel(), 0, 3);
		}
	}
}
