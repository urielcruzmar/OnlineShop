/**
 * 
 */
package com.es.ts.shop.entities;

import java.util.Date;

/**
 * @author uriel
 *
 */
public class Order {
	
	// Properties
	private String code;
	private Date date;
	private Article[] articles;
	private boolean payed;
	private User user;
	
	// Setters and Getters
	public String getCode() {
		return code;
	}
	public Date getDate() {
		return date;
	}
	public Article[] getAticles() {
		return articles;
	}
	public boolean isPayed() {
		return payed;
	}
	public void setPayed(boolean payed) {
		this.payed = payed;
	}
	public User getUser() {
		return user;
	}
	
	// Methods
	
}
