/**
 * 
 */
package com.intive_fdv.core;

/**
 * @author Emilio Moretti
 *
 */
public class Promotion {
	public enum Type{
		DISCOUNT,
		SURCHARGE,
		ABSOLUTE_DISCOUNT,
		ABSOLUTE_SURCHARGE
	}
	Type type;
	double modifier;
	double absolute;
	public Promotion(Type type, double amount) {
		this.type = type;
		this.absolute = 0;
		this.modifier = 1.0;
		if (type==Type.DISCOUNT || type==Type.SURCHARGE){
			this.setPercentage(amount);
		} else {
			this.setAbsolutePromotion(amount);
		}
	}
	/**
	 * Set a percentage greater than 0 to apply the promotion
	 * @param modifier
	 */
	public void setPercentage(double percentage){
		//no negative percentage, and we don't pay clients to use our bikes
		if ((percentage < 0) || (type == Type.DISCOUNT && percentage > 100)){
			throw new RuntimeException("Percentage out of bounds");
		}

		this.modifier = percentage/100.0;
	}
	/**
	 * Set a monetary surcharge or discount
	 * @param modifier
	 */
	public void setAbsolutePromotion(double absolute){
		this.absolute = absolute;
	}
	public double apply(double amount){
		double finalModifier = 1.0; //multiplier
		double finalAmount = 0; //adder
		if (type==Type.DISCOUNT || type==Type.SURCHARGE){
			finalModifier = type==Type.DISCOUNT?1.0-modifier:1.0+modifier;
		} else {
			finalAmount = type==Type.ABSOLUTE_DISCOUNT?-this.absolute:this.absolute;
		}
		
		return amount * finalModifier + finalAmount;
	}
}
