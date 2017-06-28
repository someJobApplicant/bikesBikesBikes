/**
 * 
 */
package com.intive_fdv.core;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Emilio Moretti
 *
 */
public class Invoice {
	List<Rental> rentals;
	List<Promotion> promotions;
	public Invoice(){
		rentals = new ArrayList<Rental>();
		promotions = new ArrayList<Promotion>();
	}
	public void addRental(Rental rental){
		this.rentals.add(rental);
	}
	public void addPromotion(Promotion promotion){
		this.promotions.add(promotion);
	}
	public List<Rental> getRentals(){
		return this.rentals;
	}
	public double getTotal(){
		double total = 0.0;
		for (Rental rental: rentals){
			total += rental.getPrice();
		}
		//apply promotions
		for (Promotion promotion:promotions){
			total = promotion.apply(total);
		}
		return total;
	}
	
}
