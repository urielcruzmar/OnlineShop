/**
 * 
 */
package com.es.ts.shop;

import com.es.ts.shop.entities.Warehouse;
import com.es.ts.shop.utils.ArticleFactory;
import com.es.ts.shop.views.Menu;

/**
 * @author uriel
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Iniciando programa...");
		
		initWarehouse();
		
		Menu.printMainMenu();

	}
	
	// Warehouse with 100 spaces
	public static final Warehouse warehouse = new Warehouse(100);

	// Add articles to warehouse
	public static void initWarehouse() {

		for (int i = 0; i < 5; i++) {
			warehouse.getArticles()[i] = ArticleFactory.getArticle("textil");
		}
		for (int i = 5; i < 10; i++) {
			warehouse.getArticles()[i] = ArticleFactory.getArticle("alimentacion");
		}

	}

}
