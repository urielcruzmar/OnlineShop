/**
 * 
 */
package com.es.ts.shop.entities;

/**
 * @author uriel
 *
 */
public class Textile extends Article {
	
	// Properties
	private String color;
	private String size;
	private static final Double TEXTILE_IVA = 1.21;

	// Setters and Getters
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public static Double getTextileIva() {
		return TEXTILE_IVA;
	}

	// Methods
	@Override
	public Double getTotalPrice() {
		return this.getPrice()*TEXTILE_IVA;
	}

}
