package model;

public class CarLogic {
	
	/**
	 * @param car to be calculated
	 * @return miles until car is empty
	 */
	public static double milesToEmpty(Car c) {
		return c.getMpg() * c.getFuel();
	}
	
	/**
	 * @param car to be calculated
	 * @return hours until car is empty
	 */
	public static double timeToEmpty(Car c) {
		return milesToEmpty(c) / c.getSpeed();
	}
	
	

}
