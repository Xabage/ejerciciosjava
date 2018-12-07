package com.ipartek.formacion.ejerciciolibros;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.formacion.biblioteca.Consola;

public class Menu {
	
private static ArrayList<Libro> libros = new ArrayList<>();
	
	
	public static void main(String[] args) {
		
		
		//CrudAble<Libro> libros = new LibroDaoArrayList();
		
		
		
		String opcion;
		do {
			
			mostrarMenu();
			
			opcion = Consola.leerLinea("¿Qué opción quires?");
			
			switch(opcion) {
			case "0": System.out.println("Salir");break;
			case "1": listado(); break;
			case "2": alta(); break;
			case "3": modificacion(); break;
			case "4": baja(); break;
			case "5": buscarId(); break;
			case "6": burcarIsbn(); break;
			}
		}while("0".equals(opcion));
			
		
	}	
	
private static void alta() {
	System.out.println("Alta");
	libros.add(pedirDatos());
		
	}

private static void burcarIsbn() {
		// TODO Auto-generated method stub
		
	}

private static void buscarId() {
		// TODO Auto-generated method stub
		
	}

private static void baja() {
	long i, numElim = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Introducir ID a eliminar: ");
	numElim = sc.nextLong();	
	for(i=1; i<libros.size() ; i++) {
		
		
	}
		
	
		
		
	}
private static void modificacion() {
		// TODO Auto-generated method stub
		
	}


private static Libro pedirDatos() {
	Libro libros = new Libro();

	libros.setId(Consola.leerLong("ID"));
	libros.setTitulo(Consola.leerLinea("Título"));
	libros.setEditorial(Consola.leerLinea("Editorial"));
	libros.setIsbn(Consola.leerLong("ISBN"));
	libros.setPrecio(Consola.leerLinea("Precio"));
	
//	boolean errorEmail;
//
//	do {
//		errorEmail = false;
//		
//		try {
//			usuario.setEmail(Consola.leerLinea("Email"));
//		} catch (Exception e) {
//			errorEmail = true;
//			System.out.println(e.getMessage());
//		}
//	} while (errorEmail);
//	
//	boolean errorPassword;
//	
//	do {
//		errorPassword = false;
//		
//		try {
//			usuario.setPassword(Consola.leerLinea("Contraseña"));
//		} catch (Exception e) {
//			errorPassword = true;
//			System.out.println(e.getMessage());
//		}
//		
//	} while(errorPassword);
	

	return libros;
}


private static void listado() {
	
	for(Libro libro: libros) {
		System.out.println(libro);
	}
		
		
	}







//		Scanner sn = new Scanner(System.in);
//	       boolean salir = false;
//	       String opcion;
//	        
//	       while(!salir){
//	    	   mostrarMenu();
//	            
//	           try {
//	        	   
//	        	   opcion = Consola.leerLinea("Escribe una de las opciones");
//	        	   
//	        	   
////				System.out.println("Escribe una de las opciones");
////				   opcion = sn.nextInt();
//				   
//				   switch(opcion){
//				   case "1":
//				       System.out.println("Has seleccionado la opción 1");
//				       break;
//				   case "2":
//				       System.out.println("Has seleccionado la opción 2");
//				       break;
//				    case "3":
//				       System.out.println("Has seleccionado la opción 3");
//				       break;
//				    case "4":
//				        System.out.println("Has seleccionado la opción 4");
//				        break;
//				    case "5":
//				        System.out.println("Has seleccionado la opción 5");
//				        break;
//				    case "6":
//				        System.out.println("Has seleccionado la opción 6");
//				        break;
//				    case "0":
//				       salir=true;
//				       break;
//				    default:
//				       System.out.println("Solo números entre 0 y 6");
//         }
//			} catch (java.util.InputMismatchException e) {
//				System.out.println("Debes insertar un número");
//                sn.next();
//			}
//	       }
//		
//
//	}

	private static void mostrarMenu() {
		System.out.println("--- LIBROS ---");
		   System.out.println();
		   System.out.println("1. Listado");
		   System.out.println("2. Alta");
		   System.out.println("3. Modificación");
		   System.out.println("4. Baja");
		   System.out.println("5. Buscar por ID");
		   System.out.println("6. Buscar por ISBN");
		   System.out.println("0. Salir");
	}

	
}
