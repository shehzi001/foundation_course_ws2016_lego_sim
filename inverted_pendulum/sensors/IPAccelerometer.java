package sensors;

import lejos.nxt.SensorPort;
import lejos.nxt.addon.AccelHTSensor;

public class IPAccelerometer {
	AccelHTSensor acc;
	double scaleFactor;
	double offsetX;
	double offsetY;
	double offsetZ;

	public IPAccelerometer(SensorPort accPort) {
		acc = new AccelHTSensor(accPort);
		scaleFactor = 200.0;
		offsetX = 0;
		offsetY = 0;
		offsetZ = 0;
	}

	public void calibrateAcc() {
		offsetX = acc.getXAccel() / scaleFactor;
		offsetY = acc.getYAccel() / scaleFactor;
	}

	public double getAccX() {
		return (acc.getXAccel() / scaleFactor) - offsetX;
	}

	public double getAccY() {
		return (acc.getYAccel() / scaleFactor) - offsetY;
	}

	public double getAccZ() {
		return acc.getZAccel() / scaleFactor;
	}

}
