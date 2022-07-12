package com.java.algoritmos;

public class Dados {

	public static void main(String[] args) {

		int dado;
		int suma = 0;
    #Generamos la tirada de 3 dados 
		System.out.println("La tirada de 3 dados es: ");
		for (int i = 0; i < 3; i++) { 
			dado = (int) (Math.random() * 6) + 1; #Invocamos Math random para que nos genere un numero random y lo se lo asignamos a la variable dado y lo imprimimos...
			System.out.println(dado + " "); #...hasta que termine el bucle (3)
			suma += dado; #A la variable suma vamos sumando los numeros aleatorios que hemos generando y por ultimo los enseñamos 
		}
		System.out.println("Suma total: " + suma);
	}
}
