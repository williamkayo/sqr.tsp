package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class CityTest {

	@Test
	/**
	 * Given distanceTo
	 * When two cities have differents Abscissa and ordinate
	 * Then distance = sqrt((x1-x2)²+(y1-y2)²)
	 */
	public void distanceTo_DiffAbscissaAndOrdinate() {
		City c1 = new City(5,4);
		City c2 = new City(2,3);

		double actual_distance = c1.distanceTo(c2);
		double expected_distance = Math.sqrt(10);

		assertEquals(actual_distance, expected_distance,0);

	}
	
	@Test
	/**
	 * Given distanceTo
	 * When two cities have same coordinates
	 * Then distance is 0
	 */

	public void distanceTo_SameCoordinates() {
		City c1 = new City(5,5);
		City c2 = new City(5,5);

		double actual_distance = c1.distanceTo(c2);
		double expected_distance = 0;

		assertEquals(actual_distance, expected_distance,0);

	}
	
	@Test
	/**
	 * Given distanceTo
	 * When distance between the origin city(0,0) and other cities
	 * Then distance = sqrt(x²+y²)
	 */
	public void distanceTo_Origin() {
		City c1 = new City(3,2);
		City c2 = new City(0,0);

		double actual_distance = c1.distanceTo(c2);
		double expected_distance = Math.sqrt(13);

		assertEquals(actual_distance, expected_distance,0);

	}


}
