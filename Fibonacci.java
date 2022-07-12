package com.java.algoritmos;

public class Fibonacci {

	public static void main(String[] args) {
    #Obtenemos los 10 primeros números de Fibonacci
		int serie = 10, num1 = 0, num2 = 1, suma = 1;

		System.out.println(num1);

		for (int i = 0; i < serie; i++) { #Creamos un for que va a recorrer 10
			suma = num1 + num2; #Después vamos intercambiando los valores y se van sumando los dos últimos digitos hasta que se termine el bucle for 
			num1 = num2;
			num2 = suma;
			System.out.println(suma);
		}

	}

}
