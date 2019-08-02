/**
 * 
 */
package com.es.ts.shop.views;

import java.util.Scanner;

/**
 * @author uriel
 *
 */
public class Menu {
	
	static Scanner scan = null;
	
	public static void printMainMenu() {
		
		Boolean exit = false;
		while (!exit) {
			
			System.out.println("WELCOME TO THE SHOP");
			System.out.println("Select an action:");
			System.out.println("1 - BUY");
			System.out.println("2 - LIST ALL PRODUCTS");
			System.out.println("3 - MANAGE PRODUCTS");
			System.out.println("0 - EXIT");
			
			scan = new Scanner(System.in);
			int option = scan.nextInt();
			
			switch (option) {
				case 1:
					buy();
					break;
					
				case 2:
					listAll();
					break;
					
				case 3:
					manageProducts();
					break;
					
				case 0:
					exit = true;
					break;
	
				default:
					System.out.println("Invalid option.");
					break;
			}
			
		}
		System.out.println("GOOD BYE!");
		scan.close();
		
	}

	private static void buy() {
		
		System.out.print("Insert the code of the product to buy: ");
		// TODO check if product is in stock and try to buy it if so
		
	}

	private static void listAll() {
		
		
		
	}

	private static void manageProducts() {
		
		System.out.println("Select an action:");
		System.out.println("1 - CREATE Article");
		System.out.println("2 - MODIFY Article");
		System.out.println("3 - DELETE Article");
		System.out.println("4 - SEARCH Article");
		
		scan = new Scanner(System.in);
		int option = scan.nextInt();
		
		switch (option) {
		
			case 1:
				create();
				break;
				
			case 2:
				modify();
				break;
				
			case 3:
				delete();
				break;
				
			case 4:
				search();
				break;
	
			default:
				System.out.println("Invalid option.");
				break;
		}
		
	}

	private static void search() {
		// TODO Search the product requesting the code
		
	}

	private static void delete() {
		// TODO Delete the product requesting the code
		
	}

	private static void modify() {
		// TODO Modify the product requesting the code
		
	}

	private static void create() {
		
		System.out.println("Insert the following data:");
		
		System.out.print("Name: ");
		String name = scan.next();
		
		System.out.print("Description: ");
		String description = scan.next();
		
		System.out.print("IVA: ");
		Double iva = scan.nextDouble();
		
		System.out.print("Price: ");
		Double price = scan.nextDouble();
		
		System.out.print("Provider: ");
		String provider = scan.next();
		
		System.out.print("Stock: ");
		Integer stock = scan.nextInt();
		
		System.out.print("Select Category: ");
		String category = scan.next();
		
		
		
		System.out.println(name+description+iva+price+provider+stock+category);
		
	}
	
}
