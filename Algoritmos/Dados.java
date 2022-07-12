package com.java.algoritmos;

public class Dados {

	public static void main(String[] args) {

		int dado;
		int suma = 0;
   		#Generamos la tirada de 3 dados 
		System.out.println("La tirada de 3 dados es: ");
		for (int i = 0; i < 3; i++) { 
			dado = (int) (Math.random() * 6) + 1; #Invocamos Math random para que nos genere un numero random 
			System.out.println(dado + " "); 
			suma += dado; #la variable suma va sumando los numeros generados 
		}
		System.out.println("Suma total: " + suma);
	}
}
