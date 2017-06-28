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
public class InvoiceTest extends BaseTest{
	@Test
	public void testInvoiceWithoutRental(){
        Invoice result = new Invoice();
        for (Bike bike:bikes.subList(0, 2)){
        	result.addRental(new Rental(Rental.Type.HOUR, bike, 2));
        }
        Assert.assertEquals("Total should be $20", 20.0, result.getTotal(), getDoubleErrorTolerance());
	}
}
