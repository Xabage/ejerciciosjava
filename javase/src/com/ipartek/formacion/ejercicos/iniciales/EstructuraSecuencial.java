package com.ipartek.formacion.ejercicos.iniciales;

import java.util.Scanner;

public class EstructuraSecuencial {

	public static void main(String[] args) {
//		1.      Programa Java que lea dos n�meros enteros por teclado y los muestre por pantalla.
		
		//declaraci�n de variables
        	//int n1, n2;
        //Scanner sc = new Scanner(System.in);
        //leer el primer n�mero 
			//System.out.println("Introduce un n�mero entero: "); 
        	//n1 = sc.nextInt();      //lee un entero por teclado
        //leer el segundo n�mero
        	//System.out.println("Introduce otro n�mero entero: "); 
        	//n2 = sc.nextInt();      //lee un entero por teclado
        //mostrar resultado
        	//System.out.println("Ha introducido los n�meros: " + n1 + " y " + n2);

        	//sc.close();
        
//        2.      Programa Java que lea un nombre y muestre por pantalla:
		//        Scanner sc = new Scanner(System.in);
		//        String cadena;
		//        System.out.println("Introduce una frase: ");
		//        cadena = sc.nextLine();
		//        System.out.println("Has escrito: " + cadena);
		//        
		//        sc.close();
        
//		3.      Escribe un programa Java que lee un n�mero entero por teclado y obtiene y muestra por pantalla el doble y el triple de ese n�mero.
//		int n;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Introduce una n�mero: ");
//		n = sc.nextInt();		
//		System.out.println("El n�mero es: " + n);
//		System.out.println("El doble es: " + n*2);
//		System.out.println("El triple es: " + n*3);
//		
//		sc.close();
		
//		Ejercicio 4:
//			Programa que lea una cantidad de grados cent�grados y la pase a grados Fahrenheit. 
//			La f�rmula correspondiente para pasar de grados cent�grados a fahrenheit es:
//			F = 32 + ( 9 * C / 5)
		
//		Scanner sc = new Scanner(System.in);
//	      double gradosC, gradosF;
//	      System.out.println("Introduce grados Cent�grados:");
//	      gradosC = sc.nextDouble();
//	      gradosF = 32 + (9 * gradosC / 5);
//	      System.out.println(gradosC +" �C = " + gradosF + " �F");
//	      sc.close();
		
//		Ejercicio 5. Programa que lee por teclado el valor del radio de una circunferencia y calcula y muestra por pantalla la longitud y el �rea de la circunferencia. 
//
//		Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2
		
//		Scanner sc = new Scanner(System.in);
//		double radio, longitud, area;
//		System.out.println("Introduce radio de la circunferencia:");
//		radio = sc.nextDouble();
//		longitud = 2*Math.PI*radio;
//		area = Math.PI*Math.pow(radio, 2);
//		System.out.println("El radio es: " + radio + ", " + "El area es: " + area + ", " + "La longitud es: " + longitud + "." );
//		sc.close();
		
//		Ejercicio 6. Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
//		Scanner sc = new Scanner(System.in);
//		double velocidadKm, velocidadM;
//		System.out.println("Introduce la velocidad en Km/h:");
//		velocidadKm = sc.nextDouble();
//		velocidadM = velocidadKm*1000/3600;
//		System.out.println(velocidadKm + " Km/h = " + velocidadM + " m/s");
//		sc.close();
		
//		Ejercicio 7. Programa lea la longitud de los catetos de un tri�ngulo rect�ngulo y calcule la longitud de la hipotenusa seg�n el teorema de Pit�goras.

//		Scanner sc = new Scanner(System.in);
//		double lado1, lado2, hipotenusa;
//		System.out.println("Introduce el primer lado:");
//		lado1 = sc.nextDouble();
//		System.out.println("Introduce el segundo lado:");
//		lado2 = sc.nextDouble();
//		hipotenusa = Math.sqrt(Math.pow(lado1, 2)+Math.pow(lado2, 2));
//		System.out.println("La Hipotenusa es: " + hipotenusa);
//		sc.close();
		
//		Ejercicio 10:
//		Programa Java que lea un n�mero entero de 3 cifras y muestre por separado las cifras del n�mero.
		
//		Scanner sc = new Scanner(System.in);
//        int N;
//        System.out.print("Introduzca valor de N: ");
//        N = sc.nextInt(); //supondremos que el n�mero introducido tiene 3 cifras
//        
//        System.out.println("Primera cifra de " + N + " -> " + (N/100)); 
//        System.out.println("Cifra central de " + N + " -> " + (N/10)%10);
//        System.out.println("�ltima cifra  de " + N + " -> " + (N%10));
//        
//        sc.close();
		
		//Ejercicio 12:
//		Programa Java que lea un n�mero entero N de 5 cifras y muestre sus cifras igual que en el ejemplo.
//		Por ejemplo para un n�mero N = 12345
//		 Scanner sc = new Scanner(System.in);
//	        int N;
//	        System.out.print("Introduzca valor de N: ");
//	        N = sc.nextInt();  //supondremos que el n�mero introducido tiene 5 cifras
//	        System.out.println(N%10);
//	        System.out.printf("%02d %n",N%100);
//	        System.out.printf("%03d %n",N%1000);
//	        System.out.printf("%04d %n",N%10000);
//	        System.out.printf("%05d %n",N);
//	        sc.close();
		
//		Ejercicio 13:
//		Programa que pida por teclado la fecha de nacimiento de una persona (dia, mes, a�o) y calcule su n�mero de la suerte.
//		El n�mero de la suerte se calcula sumando el d�a, mes y a�o de la fecha de nacimiento y a continuaci�n sumando las cifras obtenidas en la suma.
		
//		Scanner sc = new Scanner(System.in);
//        int dia, mes, a�o, suerte, suma, cifra1, cifra2, cifra3, cifra4;
//        System.out.println("Introduzca fecha de nacimiento");
//        System.out.print("d�a: ");
//        dia = sc.nextInt();
//        System.out.print("mes: ");
//        mes = sc.nextInt();
//        System.out.print("a�o: ");
//        a�o = sc.nextInt();
//        suma = dia + mes + a�o;
//        cifra1 = suma/1000;      //obtiene la primera cifra
//        cifra2 = suma/100%10;  //obtiene la segunda cifra
//        cifra3 = suma/10%10;   //obtiene la tercera cifra
//        cifra4 = suma%10;        //obtiene la �ltima cifra
//        suerte = cifra1 + cifra2 + cifra3 + cifra4;
//        System.out.println("Su n�mero de la suerte es: " + suerte);
//        sc.close();
		
		
		
	}

}
