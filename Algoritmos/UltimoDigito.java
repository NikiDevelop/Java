package com.java.algoritmos;

import java.util.Scanner;

public class UltimoDigito {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int num1;

		System.out.println("Introduce un n�mero: ");
		num1 = teclado.nextInt();

		int num2 = num1 % 10;

		System.out.println("El �ltimo d�gito de " + num1 + " es: " + num2);
	}
}
