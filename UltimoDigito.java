package com.java.algoritmos;

import java.util.Scanner;

public class UltimoDigito {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int num1;

		System.out.println("Introduce un número: ");
		num1 = teclado.nextInt();

		int num2 = num1 % 10;

		System.out.println("El último dígito de " + num1 + " es: " + num2);
	}
}
