package model;

public class Car {
	String make;
	String model;
	double mpg = 0;
	double speed = 0;
	double fuel = 0;

	public Car() {
		super();
	}
	public Car(String make, String model, double mpg, double speed, double fuel) {
		super();
		this.make = make;
		this.model = model;
		this.mpg = mpg;
		this.speed = speed;
		this.fuel = fuel;
	}

	/**
	 * Increases speed of car
	 * @param mph to add to speed
	 */
	public void accelerate(double mph) {
		speed = speed + mph;
	}
	
	/**
	 * Decreases speed of car
	 * @param mph to subtract from speed
	 */
	public void decelerate(double mph) {
		speed = speed - mph;
		if (speed < 0) {
			speed = 0;
		}
	}

	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getMpg() {
		return mpg;
	}
	public void setMpg(double mpg) {
		this.mpg = mpg;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getFuel() {
		return fuel;
	}
	public void setFuel(double fuel) {
		this.fuel = fuel;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", mpg=" + mpg + ", speed=" + speed + ", fuel=" + fuel + "]";
	}
	
}
