package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Car;
import model.CarLogic;

public class CarLogicTests {
	Car testCar = new Car("ford", "pinto", 18.5, 45, 10);

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMilesToEmpty() {
		double m = CarLogic.milesToEmpty(testCar);
		assertEquals(185, m, 0.0);
	}
	
	public void testTimeToEmpty() {
		double t = CarLogic.timeToEmpty(testCar);
		assertEquals(3.364, t, 0.01);
	}

}
