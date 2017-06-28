/**
 * 
 */
package com.intive_fdv.core;

import java.util.Date;

/**
 * We would ideally have this info stored in the DB  
 * @author Emilio Moretti
 *
 */
public class Bike {
	boolean rented;
	int id;	
	Date rentDate;
	public Bike(){
		//Mock up
		rented = false;
		id = 0;
		rentDate = null;
	}
	/**
	 * @return the rented
	 */
	public boolean isRented() {
		return rented;
	}
	/**
	 * @param rented the rented to set
	 */
	public void setRented(boolean rented) {
		this.rented = rented;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the rentDate
	 */
	public Date getRentDate() {
		return rentDate;
	}
	/**
	 * @param rentDate the rentDate to set
	 */
	public void setRentDate(Date rentDate) {
		this.rentDate = rentDate;
	}
	
	
}
