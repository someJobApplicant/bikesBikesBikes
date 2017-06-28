/**
 * 
 */
package com.intive_fdv.core;

/**
 * Rental by week, days, or hours.
 * We could join all of this using a java period and charging in more detail.
 * but we only offer these options
 * @author Emilio Moretti
 *
 */
public class Rental {
	public enum Type {
		HOUR,
		DAY,
		WEEK
	}
	Type type;
	Bike bike;
	double amount; //how many weeks, or days, or hours
	
	public Rental(Type type, Bike bike, double amount){
		this.type = type;
		this.bike = bike;
		this.amount = amount;
	}
	public double getPrice(){
		double price = 0;
		switch(this.type) {
		case HOUR:
			price = 5;//rentalDatabaseManager.getHourlyPrice
			break;
		case DAY:
			price = 20;//rentalDatabaseManager.getDayPrice
			break;
		case WEEK:
			price = 60;//rentalDatabaseManager.getWeekPrice
			break;
		}
		return price*amount;
	}
}
