/**
 * 
 */
package com.intive_fdv.core;

import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.intive_fdv.BaseTest;

/**
 * @author Emilio Moretti
 *
 */
public class BikeTest extends BaseTest {
	Bike bike;
	@Before
	public void setupTest(){
		bike = new Bike();
	}
	@Test
	public void testBikeInitialization(){
		Bike bike = new Bike();
		Assert.assertNull("Bike initial date must be null", bike.getRentDate());
		Assert.assertEquals("Bike should be initialized as not rented", false, bike.isRented());
	}
	
	@Test
	public void testSetRented() {
		bike.setRented(true);
		Assert.assertEquals("Bike should be rented", true, bike.isRented());
	}
	
	@Test
	public void testSetRentDate() {
		Date now = Calendar.getInstance().getTime();
		bike.setRentDate(now);
		Assert.assertEquals("Bike Rent date not set", now, bike.getRentDate());
	}
}
