/**
 * 
 */
package com.intive_fdv.core;

import org.junit.Test;

import com.intive_fdv.BaseTest;

import org.junit.Assert;

/**
 * @author Emilio Moretti
 *
 */
public class PromotionTest extends BaseTest{
	@Test
	public void testPercentageDiscountPromotion(){
		Promotion prom = new Promotion(Promotion.Type.DISCOUNT, 10.0);
		Assert.assertEquals("Price should be $90",90.0, prom.apply(100), getDoubleErrorTolerance());
	}
	@Test
	public void testPercentageSurchargePromotion(){
		Promotion prom = new Promotion(Promotion.Type.SURCHARGE, 10.0);
		Assert.assertEquals("Price should be $110",110.0, prom.apply(100), getDoubleErrorTolerance());
	}
	@Test
	public void testAmountDiscountPromotion(){
		Promotion prom = new Promotion(Promotion.Type.ABSOLUTE_DISCOUNT, 25.0);
		Assert.assertEquals("Price should be $75",75.0, prom.apply(100), getDoubleErrorTolerance());
	}
	@Test
	public void testAmountSurchargePromotion(){
		Promotion prom = new Promotion(Promotion.Type.ABSOLUTE_SURCHARGE, 25.0);
		Assert.assertEquals("Price should be $125",125.0, prom.apply(100), getDoubleErrorTolerance());
	}
	
	@Test
	public void testModifyPercentageDiscountPromotion(){
		Promotion prom = new Promotion(Promotion.Type.DISCOUNT, 8.0);
		prom.setPercentage(10);
		Assert.assertEquals("Price should be $90",90.0, prom.apply(100), getDoubleErrorTolerance());
	}
	@Test
	public void testModifyPercentageSurchargePromotion(){
		Promotion prom = new Promotion(Promotion.Type.SURCHARGE, 8.0);
		prom.setPercentage(10);
		Assert.assertEquals("Price should be $110",110.0, prom.apply(100), getDoubleErrorTolerance());
	}
	@Test
	public void testModifyAmountDiscountPromotion(){
		Promotion prom = new Promotion(Promotion.Type.ABSOLUTE_DISCOUNT, 23.0);
		prom.setAbsolutePromotion(25.0);
		Assert.assertEquals("Price should be $75",75.0, prom.apply(100), getDoubleErrorTolerance());
	}
	@Test
	public void testModifyAmountSurchargePromotion(){
		Promotion prom = new Promotion(Promotion.Type.ABSOLUTE_SURCHARGE, 26.0);
		prom.setAbsolutePromotion(25.0);
		Assert.assertEquals("Price should be $125",125.0, prom.apply(100), getDoubleErrorTolerance());
	}
}
