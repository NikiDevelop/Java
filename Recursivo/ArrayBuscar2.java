package com.java.ejercicios;

import java.util.Scanner;

public class ArrayBuscar2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Que elemento quieres buscar?");
		int elementoBuscar = teclado.nextInt();
	
		int[] array = { 1, 2, 3, 4, 5 };

		if (elementoBuscar <= array.length) {
			int elementoEncontrado = posicionElementoRecursivo(array, elementoBuscar, 0);
			System.out.println("El elemento " + elementoBuscar + " se encuentra en el indice " + elementoEncontrado);
		} else {
			System.out.println("El numero maximo que se puede buscar es " + array.length);
		}
	}

	public static int posicionElementoRecursivo(int[] array, int elementoBuscar, int indice) {

		if (elementoBuscar > array.length) {

			elementoBuscar = array.length;
			System.out.println("El numero maximo que se puede buscar es " + elementoBuscar);

		} else if (array[indice] == elementoBuscar || indice == array.length) {

			return indice;
		} else {

			return posicionElementoRecursivo(array, elementoBuscar, indice + 1);
		}
		return indice;
	}
}
