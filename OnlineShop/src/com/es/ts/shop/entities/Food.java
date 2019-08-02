/**
 * 
 */
package com.es.ts.shop.entities;

/**
 * @author uriel
 *
 */
public class Food extends Article {

	// Properties
	private String expirationDate;
	private String allergens;
	private static final Double FOOD_IVA = 1.10;

	// Setters and Getters
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	public String getAllergens() {
		return allergens;
	}
	public void setAllergens(String allergens) {
		this.allergens = allergens;
	}
	public static Double getFoodIva() {
		return FOOD_IVA;
	}

	// Methods
	@Override
	public Double getTotalPrice() {
		return this.getPrice()*FOOD_IVA;
	}
	
}
