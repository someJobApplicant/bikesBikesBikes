package com.intive_fdv.core;

import java.util.List;

import com.intive_fdv.core.Promotion.Type;

/**
 * Create new rentals and apply known promotions.
 * Again, we could handle this more efficiently if we used periods and considered charging for periods
 * of times, but we keep an invoice for each period of time, since we are keeping it simple
 */
public class Core {
    public static Invoice newInvoice(List<Bike> bikes, Rental.Type type, int amount) {
        Invoice result = new Invoice();
        for (Bike bike:bikes){
        	result.addRental(new Rental(type, bike, amount));
        }
        Core.applyPromotions(result);
        return result;
    }
    
    private static void applyPromotions(Invoice inv) {
    	//TODO: read all promotions from somewhere else and apply them here.
    	//consider promotions based on number of rentals and based on amount of money
    	int amountOfRentals = inv.getRentals().size();
    	if (amountOfRentals >= 3 && amountOfRentals <=5){
    		inv.addPromotion(new Promotion(Type.DISCOUNT, 30.0));
    	}
    			
    	
    }
}
