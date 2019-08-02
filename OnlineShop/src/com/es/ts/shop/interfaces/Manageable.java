/**
 * 
 */
package com.es.ts.shop.interfaces;

/**
 * @author uriel
 *
 */
public interface Manageable<T> {

	public boolean create(T article);
	public boolean search(String code);
	public boolean modify(T article);
	public boolean delete(T article);
	
	public T[] listAll();
	
}
