package com.java.algoritmos;

import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce un n�mero del 1 al 100: ");

		int ale = 0;
		int intentos = 0;
		int num = 0;
		//Creamos un bucle for para que nos genere un número aleatorio
		for (int i = 0; i < 1; i++) {
			ale = (int) (Math.random() * 100 + 1);

		}
		//El bucle while se va a estar repitiendo hasta que no sea igual el número que hemos introducido al aleatorio
		while (num != ale) {
			num = teclado.nextInt();
			//Creamos una condición en el que nos dice si nuestro número es mayor que aleatorio entonces nos dice que aleatorio es menor
			if (num > ale) {
				System.out.println("El n�mero es menor:");
				intentos++;
			} else if (num < ale) { //Aquí es al contrario
				System.out.println("El n�mero es mayor:");
				intentos++;
			} else { //Por último imprimimos si has acertado y los intentos que has necesitado.
				System.out.println("�Has acertado!\nHas necesitado " + intentos + " intentos.");
			}
		}

	}
}
