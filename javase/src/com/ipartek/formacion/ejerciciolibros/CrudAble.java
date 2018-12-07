package com.ipartek.formacion.ejerciciolibros;

import java.util.List;

public interface CrudAble<Libro> {
	
	public default List<Libro> getAll(){
		throw new RuntimeException("No implementado");
	}
	
	public default Libro getById(int id) {
		throw new RuntimeException("No implementado");
	}
	
	public default Libro getByIsbn(int isbn) {
		throw new RuntimeException("No implementado");
	}
	
	public default void insert(Libro libro) {
		throw new RuntimeException("No implementado");
	}
	
	public default void update(Libro libro) {
		throw new RuntimeException("No implementado");
	}
	
	public default void delete(int id) {
		throw new RuntimeException("No implementado");
	}
}
