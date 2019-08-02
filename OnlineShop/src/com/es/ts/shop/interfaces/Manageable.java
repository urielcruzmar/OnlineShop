/**
 * 
 */
package com.es.ts.shop.interfaces;

/**
 * @author uriel
 *
 */
public interface Manageable<T> {

	public boolean create(T entity);
	public T search(Integer code);
	public boolean modify(T entity);
	public boolean delete(T entity);
	
	public T[] listAll();
	
}
