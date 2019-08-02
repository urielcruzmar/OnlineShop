/**
 * 
 */
package com.es.ts.shop.manager;

import com.es.ts.shop.entities.Article;
import com.es.ts.shop.entities.Warehouse;
import com.es.ts.shop.interfaces.Manageable;

/**
 * @author uriel
 *
 */
public class ArticleManager implements Manageable<Article> {
	
	// Properties
	private Warehouse warehouse;

	// Constructor
	public ArticleManager(Warehouse warehouse) {
		super();
		this.warehouse = warehouse;
	}
	
	// Result boolean
	Boolean result = null;
	
	@Override
	public boolean create(Article article) {
		
		try {
			for (int i = 0; i < warehouse.getArticles().length; i++) {
				if (null == warehouse.getArticles()[i]) {
					warehouse.getArticles()[i] = article;
					warehouse.getArticles()[i].setCode(i);
				}
			}
			result = true;
		} catch (Exception e) {
			result = false;
		}
		
		return result;
	}

	@Override
	public Article search(Integer code) {
		
		Article article = null;
		try {
			// The code is the position of the article in the array
			// If the position is not empty, the article is the one wanted
			if (null != warehouse.getArticles()[code]) {
				article = warehouse.getArticle(code);
			}
		} catch (Exception e) {
			article = null;
		}
		
		return article;
	}

	@Override
	public boolean modify(Article article) {
		
		try {
			// TODO modify properties of articles
			result = true;
		} catch (Exception e) {
			result = false;
		}
		
		return result;
	}

	@Override
	public boolean delete(Article article) {
		
		try {
			for (int i = 0; i < warehouse.getArticles().length; i++) {
				if (warehouse.getArticles()[i].getCode().equals(article.getCode())) {
					warehouse.getArticles()[i] = null;
					break;
				}
			}
			result = true;
		} catch (Exception e) {
			result = false;
		}
		
		return result;
	}

	@Override
	public Article[] listAll() {
		return warehouse.getArticles();
	}
	
}
