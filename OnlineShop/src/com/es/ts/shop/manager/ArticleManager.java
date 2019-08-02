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
	
	private Warehouse warehouse;

	@Override
	public boolean create(Article article) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean search(String code) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modify(Article article) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Article article) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Article[] listAll() {
		return warehouse.getArticles();
	}
	
}
