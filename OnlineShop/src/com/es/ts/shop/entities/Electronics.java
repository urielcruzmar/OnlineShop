/**
 * 
 */
package com.es.ts.shop.entities;

/**
 * @author uriel
 *
 */
public class Electronics extends Article {
	
	// Properties
	private String power;
	private Double guarantee;
	private static final Double ELECTRONICS_IVA = 1.21;
	
	// Setters and Getters
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public Double getGuarantee() {
		return guarantee;
	}
	public void setGuarantee(Double guarantee) {
		this.guarantee = guarantee;
	}
	public static Double getElectronicsIva() {
		return ELECTRONICS_IVA;
	}

	// Methods
	@Override
	public Double getTotalPrice() {
		return this.getPrice()*ELECTRONICS_IVA;
	}
	
}
