package com.ipartek.formacion.ejercicos.iniciales;

import java.io.IOException;
import java.util.Scanner;

public class EjerciciosGenerales {

	public static void main(String[] args) throws IOException {
		
		//Ejercicio 1
		
//		Intercambio de valores entre dos variables utilizando una variable auxiliar.
//
//		Programa para intercambiar el valor de dos variables. Los valores iniciales se leen por teclado.
//
//		Por ejemplo, suponiendo que las variables se llaman A y B, si A contiene 3 y B contiene 5, despu�s del intercambio A contendr� 5 y B 3. 
//
//		En este ejemplo, para intercambiar el valor entre dos variables utilizaremos una variable auxiliar donde guardar el valor de una de ellas. Despu�s veremos la forma de hacerlo sin usar una variable auxiliar para el intercambio. 
//
//		Las instrucciones a realizar son:
//
//		AUX = A;
//		A = B;
//		B = AUX;

//		Scanner sc = new Scanner(System.in);
//		int A, B, AUX;
//		System.out.println("Introduce el valor de A: ");
//		A = sc.nextInt();
//		System.out.println("Introduce el valor de B: ");
//		B = sc.nextInt();
//		System.out.println("Valores iniciales: A = " + A + "   B = " + B);
		
//		Intercambio
//		AUX = A;
//		A = B;
//		B = AUX;
//		System.out.println("Valores intercambiados: A = " + A + "   B = " + B);
//		
//		sc.close();
		
		
//		Intercambio de valores entre dos variables sin utilizar variable auxiliar. 
//		Tambi�n se puede intercambiar el valor de dos variables sin utilizar una variable auxiliar.
//		En ese caso se resuelve utilizando aritm�tica b�sica: 
//		A = A + B;
//		B = A - B;
//		A = A - B;
		
//		Scanner sc = new Scanner(System.in);
//		int A, B, AUX;
//		System.out.println("Introduce el valor de A: ");
//		A = sc.nextInt();
//		System.out.println("Introduce el valor de B: ");
//		B = sc.nextInt();
//		System.out.println("Valores iniciales: A = " + A + "   B = " + B);
//		Intercambio
//		A=A+B;
//		B=A-B;
//		A=A-B;
//		System.out.println("Valores intercambiados: A = " + A + "   B = " + B);
//		
//		sc.close();
		
		//Ejercico 2
		
//		Programa Java que pide un n�mero entero por teclado y calcula y muestra el n�mero de cifras que tiene.
		
//		Scanner sc = new Scanner(System.in);
//        int n, cifras;
//        char car;
//        do {
//        	System.out.print("Introduce un n�mero entero: ");
//        	n = sc.nextInt();
//        	cifras = 0;
//        	while(n!=0){
//        		n = n/10;
//        		cifras++;
//        	}
//        	System.out.println("El n�mero tiene " + cifras+ " cifras");
//            System.out.print("Continuar? ");
//            car = (char)System.in.read();	
//        }while(car!='n' && car != 'N');
//        
//        sc.close();
		
		//Ejercicio 3
		
//		Programa Java que lee una temperatura expresada en grados cent�grados y la convierte a grados kelvin. 
//
//		El proceso de leer grados cent�grados se debe repetir mientras que se responda �S� a la pregunta: Repetir proceso? (S/N)
//
//		Para hacer la conversi�n de grados Cent�grados a grados Kelvin hay que utilizar la f�rmula:
//
//		�K = �C + 273
		
//		Scanner sc = new Scanner(System.in);
//		double temperatura;
//		char car;
//        do{
//            System.out.print("Introduce temperatura en �C: ");
//            temperatura = sc.nextDouble();
//            System.out.println("Grados Kelvin ..: " + (temperatura+273));
//            System.out.print("Repetir proceso? (S/N): " );
//            car = (char)System.in.read();            
//        }while(car=='S' || car=='s');
//        
//        sc.close();
		
		//Ejercico 4
		
//		Programa Java que lea un n�mero entero N y muestre la tabla de multiplicar de ese n�mero. Por ejemplo, si se lee el valor 7 se mostrar� por pantalla:
		
//		Scanner sc = new Scanner(System.in);
//        int n;
//        System.out.print("Introduce un n�mero entero: ");
//        n = sc.nextInt();
//        System.out.println("Tabla del " + n);
//        for(int i = 1; i<=10; i++){
//             System.out.println(n + " * " + i + " = " + n*i);
//        }
//        
//        sc.close();
		

		//Ejercico 6
		
//		N�mero perfecto en java
		
//		Un n�mero es perfecto si es igual a la suma de todos sus divisores positivos sin incluir el propio n�mero.
//
//		Por ejemplo, el n�mero 6 es perfecto. 
//
//		El 6 tiene como divisores: 1, 2, 3 y 6 pero el 6 no se cuenta como divisor para comprobar si es perfecto.
//
//		Si sumamos 1 + 2 + 3 = 6 
//
//		Los siguientes n�meros perfectos despu�s del 6 son 28, 496, 8128, 33550336, 8589869056.
		
//		 int i, suma = 0, n;
//	        Scanner sc = new Scanner(System.in);
//	        System.out.println("Introduce un n�mero: ");
//	        n = sc.nextInt();
//	        for(i=1; i<n; i++) {
//	        	if(n % i == 0) {
//	        		suma = suma + i;
//	        	}	        	
//	        }
//		if(suma == n) {
//			System.out.println(n + " es un n�mero perfecto.");
//		}else
//			System.out.println(n + " NO es un n�mero perfecto.");
//		
//		sc.close();
		
//		Utilizando el algoritmo anterior vamos a escribir ahora el programa Java que muestre los n�meros perfectos entre 1 y 1000
//		int i, suma = 0, j;
//		System.out.println("N�meros perfectos entre 1 y 1000: ");
//        for(i=1;i<=1000;i++){    // i es el n�mero que vamos a comprobar
//            suma=0;
//            for(j=1;j<i;j++){  // j son los divisores. Se divide desde 1 hasta i-1 
//                 if(i%j==0){
//                    suma=suma+j;     // si es divisor se suma
//                 }
//            }
//          if(i==suma){           // si el numero es igual a la suma de sus divisores es perfecto
//                 System.out.println(i);
//              }
//        }
		
//		N�meros pares del 1 al 100
		
//		int i;
//		System.out.println("N�mero pares del 1 al 100");
//		for(i=1; i<100; i++) {
//			if(i%2==0) {
//				System.out.println(i);
//			}
//		}
		
		//Ejercico 7
		
//		N�meros amigos en Java
		
//		Dos n�meros enteros positivos A y B son n�meros amigos si la suma de los divisores propios de A es igual a B y la suma de los divisores propios de B es igual a A.
//
//		Los divisores propios de un n�mero incluyen la unidad pero no el propio n�mero.
		
//		int i,suma=0, n1, n2;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Introduce primer n�mero: ");
//        n1 = sc.nextInt();
//        System.out.print("Introduce segundo n�mero: ");
//        n2 = sc.nextInt();
//        for(i=1; i<n1; i++) { // for para sumar todos los divisores propios de n1
//        	if(n1%i==0) {
//        		suma = suma + i;
//        	}
//        }
     // si la suma de los divisores de n1 es igual a n2
        
//        if(suma == n2) {
//        	suma = 0;
//        	for(i=1; i<n2; i++) {
//        		if(n2%i==0) {
//        			suma = suma +i;
//        		}
//        	}
      // si la suma de los divisores de n2 es igual a n1
        	
//        	if(suma==n1) {
//        		System.out.println(n1 + " y " + n2 + " Son Amigos.");
//        	}else
//        		System.out.println("No son amigos.");
//        }
//	  
//        else{
//           System.out.println("No son amigos");
//        }
//        
//        sc.close();
		
		//Ejercico 8
        
//		Fibonacci en java
		
//		La serie de fibonacci la forman una serie de n�meros tales que:
//
//			El primer t�rmino de la serie es el n�mero 1
//			El segundo t�rmino de la serie es el n�mero 1
//			Los siguientes t�rminos de la serie de fibonacci se obtienen de la suma de los dos anteriores:
//
//			1, 1, 2, 3, 5, 8, 13, .....  

//		Scanner sc = new Scanner(System.in);
//        int numero,fibo1,fibo2,i;
//        do{
//            System.out.print("Introduce numero mayor que 1: ");
//            numero = sc.nextInt();
//        }while(numero<=1);
//        System.out.println("Los " + numero + " primeros t�rminos de la serie de Fibonacci son:"); 
//
//        fibo1=1;
//        fibo2=1; 
//
//        System.out.print(fibo1 + " ");
//        for(i=2;i<=numero;i++){
//             System.out.print(fibo2 + " ");
//             fibo2 = fibo1 + fibo2;
//             fibo1 = fibo2 - fibo1;
//        }
//        System.out.println();
//        sc.close();
		
		//Ejercicio 9
//		Decimal a binario en java
		
//		En esta entrada vamos a escribir el programa java para convertir un n�mero de decimal a binario.
//
//		Para escribir el programa nos vamos a basar en la forma cl�sica de pasar de decimal a binario, o sea, dividir el n�mero entre 2 y quedarnos con el resto de la divisi�n. Esta cifra, que ser� un cero o un uno, es el d�gito de menos peso (m�s a la derecha) del n�mero binario. A continuaci�n volvemos a dividir el cociente que hemos obtenido entre 2 y nos quedamos con el resto de la divisi�n. Esta cifra ser� la segunda por la derecha del n�mero binario. Esta operaci�n se repite hasta que obtengamos un cero como cociente.

//		int numero, exp, digito;
//        double binario;
//        Scanner sc = new Scanner(System.in);
//
//        do{  
//            System.out.print("Introduce un numero entero >= 0: ");
//            numero = sc.nextInt();
//        }while(numero<0);
//
//        exp=0;
//        binario=0;
//        while(numero!=0){
//                digito = numero % 2;            
//                binario = binario + digito * Math.pow(10, exp);   
//                exp++;
//                numero = numero/2;
//        }
//        System.out.printf("Binario: %.0f %n", binario);
//        sc.close();
		
		//Ejercicio 10
		
//		CONVERTIR UN N�MERO DE BINARIO A DECIMAL EN JAVA
//		El programa para pasar un n�mero expresado en binario a decimal se basa en la forma tradicional de hacerlo. Los d�gitos del n�mero binario ocupan una posici�n que se numera de derecha a izquierda empezando por cero. La posici�n del d�gito m�s a la derecha es la 0.
		
//		long numero, aux, digito, decimal;
//	     int exponente;
//	     boolean esBinario;
//	     Scanner sc = new Scanner(System.in);
//
//	    //Leer un n�mero por teclado y comprobar que es binario
//	     do {
//	          System.out.print("Introduce un numero binario: ");
//	          numero = sc.nextLong();
//	          //comprobamos que sea un n�mero binario es decir
//	          //que este formado solo por ceros y unos
//	          esBinario = true;
//	          aux = numero;
//	          while (aux != 0) {
//	                     digito = aux % 10; //�ltima cifra del n�meros
//	                     if (digito != 0 && digito != 1) { //si no es 0 � 1
//	                          esBinario = false; //no es un n�mero binario
//	                          System.out.println("No es binario");
//	                     }
//	                     aux = aux / 10; //quitamos la �ltima cifra para repetir el proceso
//	           }
//	      } while (!esBinario); //se vuelve a pedir si no es binario
//
//	      //proceso para pasar de binario a decimal
//	      exponente = 0;
//	      decimal = 0; //ser� el equivalente en base decimal
//	      while (numero != 0) {
//	                //se toma la �ltima cifra
//	                digito = numero % 10;
//	                //se multiplica por la potencia de 2 correspondiente y se suma al n�mero
//	                decimal = decimal + digito * (int) Math.pow(2, exponente);
//	                //se aumenta el exponente
//	                exponente++;
//	                //se quita la �ltima cifra para repetir el proceso
//	                numero = numero / 10;
//	      }
//	      System.out.println("Decimal: " + decimal);
//	      
//	      sc.close();
		
    }
	
}

