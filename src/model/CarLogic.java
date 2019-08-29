package model;

public class CarLogic {
	
	public static double milesToEmpty(Car c) {
		return c.getMpg() * c.getFuel();
	}
	
	public static double timeToEmpty(Car c) {
		return milesToEmpty(c) / c.getSpeed();
	}
	
	

}
