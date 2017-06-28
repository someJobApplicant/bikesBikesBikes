package com.intive_fdv;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;

import com.intive_fdv.core.Bike;

/**
 * Base test file. Shares common test behavior
 */
public class BaseTest {
	double doubleErrorTolerance = 0.1;

	/**
	 * @return the doubleErrorTolerance
	 */
	public double getDoubleErrorTolerance() {
		return doubleErrorTolerance;
	}
	/**
	 * Store several test bikes to perform the tests in other classes
	 */
	protected static List<Bike> bikes;
	
	@BeforeClass
	public static void testBeforeClass(){
		bikes = new ArrayList<Bike>();
		for (int i=0; i<20; i++){
			bikes.add(new Bike());
		}
	}
}
