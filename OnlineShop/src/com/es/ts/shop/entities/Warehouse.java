/**
 * 
 */
package com.es.ts.shop.entities;

/**
 * @author uriel
 *
 */
public class Warehouse {

	// Properties
	private Article[] articles;

	// Setters and Getters
	public Article[] getArticles() {
		return articles;
	}
	public void setArticles(Article[] articles) {
		this.articles = articles;
	}

	// Constructor
	public Warehouse(int size) {
		this.articles = new Article[size];
	}
	
	// Methods
	/**
	 * Returns the Article with the desired code (null if not found)
	 * @param code
	 * @return article
	 */
	public Article getArticle(Integer code) {
		return articles[code];
	}
	
}
