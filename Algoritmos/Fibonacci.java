package com.java.algoritmos;

public class Fibonacci {

	public static void main(String[] args) {

		int serie = 10, num1 = 0, num2 = 1, suma = 1;

		System.out.println(num1);

		for (int i = 0; i < serie; i++) {
			suma = num1 + num2;
			num1 = num2;
			num2 = suma;
			System.out.println(suma);
		}

	}

}
