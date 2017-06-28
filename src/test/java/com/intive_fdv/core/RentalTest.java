/**
 * 
 */
package com.intive_fdv.core;

import org.junit.Assert;
import org.junit.Test;

import com.intive_fdv.BaseTest;

/**
 * @author dc740
 *
 */
public class RentalTest extends BaseTest{
	@Test
	public void testWeeklyRental(){
		Bike bike = bikes.get(0);
		Rental rental = new Rental(Rental.Type.WEEK, bike, 3);
		Assert.assertEquals("Rental should be $180",180,rental.getPrice(), getDoubleErrorTolerance());
	}
	@Test
	public void testDailyRental(){
		Bike bike = bikes.get(0);
		Rental rental = new Rental(Rental.Type.DAY, bike, 6);
		Assert.assertEquals("Rental should be $120",120,rental.getPrice(), getDoubleErrorTolerance());
	}
	@Test
	public void testHourlyRental(){
		Bike bike = bikes.get(0);
		Rental rental = new Rental(Rental.Type.HOUR, bike, 4);
		Assert.assertEquals("Rental should be $20",20,rental.getPrice(), getDoubleErrorTolerance());
	}
}
