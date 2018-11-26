package com.ipartek.formacion.ejercicos.iniciales;

import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class EjerciciosCondicionales {

	public static void main(String[] args) throws IOException{
//		1. Programa Java que lea un n�mero entero por teclado y calcule si es par o impar.
//
//		Podemos saber si un n�mero es par si el resto de dividir el n�mero entre 2 es igual a cero. En caso contrario el n�mero es impar
//
//		El operador Java que calcula el resto de la divisi�n entre dos n�meros enteros o no es el operador %
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Introduce un n�mero entero: ");
//		int numero;
//		numero = sc.nextInt();
//		if(numero%2==0) {
//			
//		System.out.println("El n�mero " + numero + " es par.");			
//		}else {
//			System.out.println("El n�mero " + numero + " es impar.");
//		}
//		sc.close();
		
//		3. Programa que lea un car�cter por teclado y compruebe si es una letra may�scula
		
//		Scanner sc = new Scanner(System.in);
//		char car;
//		System.out.println("Introduce una letra: ");
//		car = (char)System.in.read();
//		 if(Character.isUpperCase(car)) //utilizamos el m�todo isUpperCase de la clase Character
//             System.out.println("Es una letra may�scula");    
//          else
//              System.out.println("No es una letra may�scula");  
//		sc.close();
		
//		Ejercicio 4: Programa que lea dos caracteres y compruebe si son iguales.
//		char car1, car2;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Introduzca primer car�cter: ");
//		car1 = (char)System.in.read(); //lee un car�cter
//		sc.nextLine(); //saltar el intro que ha quedado en el buffer
//		System.out.print("Introduzca segundo car�cter: ");
//		car2 = (char)System.in.read(); //lee el segundo car�cter
//
//		if(car1 == car2)
//		System.out.println("Son iguales"); 
//		else
//		System.out.println("No son iguales"); 
//		sc.close();
		
		
		
//		Ejercicios b�sicos que utilizan la estructura repetitiva. 

		
//		1. Ejemplo de uso de while: Programa Java que muestre los n�meros del 1 al 100 utilizando la instrucci�n while.
//		System.out.println("Numeros del 1 al 100: ");
//        int i=1;
//        while(i<=100) {
//                  System.out.println(i);
//                  i++;
//        }
		 
//		Ejercicio 6: Programa java que lea un car�cter por teclado y compruebe si es un d�gito num�rico (cifra entre 0 y 9).
//
//		Vamos a escribir dos soluciones a este ejercicio. 
//
//		La primera consiste en comprobar si el car�cter es un d�gito mediante el m�todo isDigit de la clase Character. Este m�todo devuelve true si el car�cter que se le pasa como par�metro es una cifra entre 0 y 9:
		
//		 char car1;
//	        System.out.print("Introduzca car�cter: ");
//	        car1 = (char)System.in.read(); //lee un car�cter
//	        if(Character.isDigit(car1)) //utilizamos el m�todo isDigit de la clase Character
//	           System.out.println("Es un n�mero");
//	        else
//	           System.out.println("No es un n�mero");
		
//		Ejercicio 7: Programa que lea dos n�meros por teclado y muestre el resultado de la divisi�n del primer n�mero por el segundo. Se debe comprobar que el divisor no puede ser cero.
		
//		Scanner sc = new Scanner(System.in);
//        double dividendo, divisor;
//        System.out.print("Introduzca el dividendo: ");
//        dividendo = sc.nextDouble();
//        System.out.print("Introduzca el divisor: ");
//        divisor = sc.nextDouble();
//        if(divisor == 0) {
//        	System.out.println("No se puede dividir");
//        }else {
//        	//System.out.println(dividendo/divisor);
//        	System.out.println(dividendo + " / " + divisor + " = " + dividendo/divisor);   
//            System.out.printf("%.2f / %.2f = %.2f %n" , dividendo, divisor , dividendo/divisor);
//        }
//        sc.close();
		
//		Ejercicio 9:
//
//			Programa que lea por teclado tres n�meros enteros H, M, S correspondientes a hora, minutos y segundos respectivamente, y comprueba si la hora que indican es una hora v�lida. 
//
//			Supondremos que se leemos una hora en modo 24 Horas, es decir, el valor v�lido para las horas ser� mayor o igual que cero y menor que 24.
//
//			El valor v�lido para los minutos y segundos estar� comprendido entre 0 y 59 ambos incluidos
//		
//       Scanner sc = new Scanner(System.in);
//       int H, M, S;
//       System.out.println("Introduzca la hora: ");
//       H = sc.nextInt();
//       System.out.println("Introduzca los minutos: ");
//       M = sc.nextInt();
//       System.out.println("Introduzca los segundos: ");
//       S = sc.nextInt();
//       if(H>=0 && H<24 && M>=0 && M<60 && S>=0 && S<60) {
//    	   System.out.println(H + ":" + M + "." + S );
//       }else if(H<0 || H>24) {
//    	   System.out.println("Hora no v�lida");
//       }else if(M<0 || M>59) {
//    	   System.out.println("Minutos no v�lidos");
//       }else {
//    	   System.out.println("Segundos no v�lidos");
//       }
//       sc.close();
		
//		Ejercicio 10:

//			Programa que lea una variable entera mes y compruebe si el valor corresponde a un mes de 30 d�as, de 31 o de 28. Supondremos que febrero tiene 28 d�as. Se mostrar� adem�s el nombre del mes. Se debe comprobar que el valor introducido est� comprendido entre 1 y 12.
		Scanner sc = new Scanner(System.in);
        int mes;
        System.out.print("Introduzca n�mero de mes: ");
        mes =  sc.nextInt();
        if(mes<1 || mes>12)
        	System.out.println("Mes incorrecto.");
        else {
        	switch (mes) {
    case 1: System.out.print("Enero");
            break;
    case 2: System.out.print("Febrero");
            break;
    case 3: System.out.print("Marzo");
            break;
    case 4: System.out.print("Abril");
            break;
    case 5: System.out.print("Mayo");
            break;
    case 6: System.out.print("Junio");
            break;
    case 7: System.out.print("Julio");
            break;
    case 8: System.out.print("Agosto");
            break;
    case 9: System.out.print("Septiembre");
            break;
    case 10: System.out.print("Octubre");
            break;
    case 11: System.out.print("Noviembre");
            break;
    case 12: System.out.print("Diciembre");
            break;
			
			}
        	if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
        		System.out.println(" tiene 30 d�as.");
        	}else if (mes == 2) {
        		System.out.println(" tiene 28 d�as.");
        	}else
        		System.out.println(" tiene 31 d�as");        	
        }
        sc.close();
	}

}
