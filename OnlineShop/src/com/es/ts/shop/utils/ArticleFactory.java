/**
 * 
 */
package com.es.ts.shop.utils;

import com.es.ts.shop.entities.Article;
import com.es.ts.shop.entities.Electronics;
import com.es.ts.shop.entities.Food;
import com.es.ts.shop.entities.Textile;

/**
 * @author uriel
 *
 */

public class ArticleFactory {
	
	/**
	 * Creates article knowing the category
	 * @param category
	 * @return article
	 */
	public static Article getArticle(String category) {

		Article article = null;

		switch (category) {
			case "textile":
				article = new Textile();
				article.setCategory(category);
				break;
			case "electronics":
				article = new Electronics();
				article.setCategory(category);
				break;
			case "food":
				article = new Food();
				article.setCategory(category);
				break;
			default:
				break;
		}
		
		return article;

	}

}
