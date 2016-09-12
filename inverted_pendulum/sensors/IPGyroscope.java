package sensors;

import lejos.nxt.SensorPort;
import lejos.nxt.addon.GyroSensor;

public class IPGyroscope {
	GyroSensor gyro;

	public IPGyroscope(SensorPort port) {
		gyro = new GyroSensor(port);
	}

	public void calibrateGyro() {
		gyro.recalibrateOffset();
	}

	public float getAngVel() {
		return gyro.getAngularVelocity();
	}

}
