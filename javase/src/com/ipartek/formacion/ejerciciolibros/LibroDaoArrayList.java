package com.ipartek.formacion.ejerciciolibros;

import java.util.ArrayList;
import java.util.List;

import com.ipartek.formacion.ejerciciolibros.CrudAble;
import com.ipartek.formacion.ejerciciolibros.Libro;


public class LibroDaoArrayList implements CrudAble<Libro> {
 
		
	private ArrayList<Libro> libros = new ArrayList<>();
	
	
	public LibroDaoArrayList() {
		libros.add(new Libro(1L, 55678,"Titulo1", "Editorial1", "15€"));
		libros.add(new Libro(2L, 86757,"Titulo2", "Editorial2", "20€"));
	}
		
		@Override
		public List<Libro> getAll() {
			return libros;
		}
		
//		@Override
//		public ArrayList<Libro> getById(int id) {
//			for(Libro libro: libros) {
//				if(libro.getId() == id) {
//					return libros;
//				}
//			}
//			
//			return null;			
//		}
//		
//		@Override
//		public ArrayList<Libro> getByIsbn(int isbn) {
//			for(Libro libro: libros) {
//				if(libro.getId() == isbn) {
//					return libros;
//				}
//			}
//			
//			return null;			
//		}
//		
		
		
	}

