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
public class CoreTest extends BaseTest {

    @Test
    public void testNewInvoice() {
        Invoice invoice = Core.newInvoice(bikes.subList(0, 2), Rental.Type.HOUR, 2);
        Assert.assertEquals("Total should be $20", 20.0, invoice.getTotal(), getDoubleErrorTolerance());
    }
    @Test
    public void testPromotions() {
        Invoice invoice = Core.newInvoice(bikes.subList(0, 3), Rental.Type.WEEK, 2);
        Assert.assertEquals("Total should be $252", 252.0, invoice.getTotal(), getDoubleErrorTolerance());
    }
}
