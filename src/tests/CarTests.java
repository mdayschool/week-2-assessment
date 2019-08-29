package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Car;

public class CarTests {
	Car testCar = new Car("ford", "pinto", 18.5, 45, 10);

	@Before
	public void setUp() throws Exception {
		testCar.setSpeed(45);
	}

	@Test
	public void testAccelerate() {
		testCar.accelerate(5);
		assertEquals(50, testCar.getSpeed(), 0.0);
	}
	
	@Test
	public void testDecelerate() {
		testCar.decelerate(5);
		assertEquals(40, testCar.getSpeed(), 0.0);
	}
	
	@Test
	public void testMinSpeed() {
		testCar.decelerate(Double.MAX_VALUE);
		assertTrue(testCar.getSpeed() >= 0);
	}
	
	@Test
	public void testDefaultSpeedNotNull() {
		Car newCar = new Car();
		assertNotNull(newCar.getSpeed());
	}
	
	@Test
	public void testDefaultMakeNull() {
		Car newCar = new Car();
		assertNull(newCar.getMake());
	}

}
