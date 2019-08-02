/**
 * 
 */
package com.es.ts.shop.entities;

import com.es.ts.shop.interfaces.Prizable;

/**
 * @author uriel
 *
 */
public abstract class Article implements Prizable {
	
	// Properties
	private Integer code;
	private String name;
	private String description;
	private Double iva;
	private Double price;
	private String provider;
	private Integer stock;
	private String category;
	
	// Setters and Getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getIva() {
		return iva;
	}
	public void setIva(Double iva) {
		this.iva = iva;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	
	// Methods
	/**
	 * Calculates the price of the product with IVA
	 * @return finalPrice
	 */
	public Double calculatePrice() {
		return price * iva;
	}
		
}
