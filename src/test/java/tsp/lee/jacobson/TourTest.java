package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {

	City city1 = new City(4,3);
	City city2 = new City(4,4);
	City city3 = new City(4,5);
	@Test
	/**
	 * Given getDistance
	 * When no cities
	 * Then distance is 0
	 */
	public void getDistance_noCities_0() {
		
		Tour tour = new Tour();
		tour.setCity(0, city1); 

		double actual = tour.getDistance();
		double expected = 0;

		assertEquals(expected, actual, 0);
	}
	@Test
	/**
	 * Given getDistance
	 * When only one city
	 * Then distance is 0
	 */
	public void getDistance_OnlyOneCity_0() {

		
		TourManager.addCity(city1);
		
		Tour tour = new Tour();
		tour.setCity(0, city1); 

		double actual = tour.getDistance();
		double expected = 0;

		assertEquals(expected, actual, 0);
	}
	
	@Test
	/**
	 * Given getDistance
	 * When multiple cities
	 * Then sum of the distances between each two consecutive cities
	 */
	public void getDistance_MultipleCities() {


		TourManager.addCity(city2);
		TourManager.addCity(city3);
		
		Tour tour = new Tour();
		tour.setCity(0, city1); 
		tour.setCity(1, city2); 
		tour.setCity(2, city3); 

		double actual_distance = tour.getDistance();
		double expected_distance = 4;

		assertEquals(expected_distance, actual_distance, 0);
	}

}
	
