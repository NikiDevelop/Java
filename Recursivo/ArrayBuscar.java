package com.java.recursivo;

public class ArrayBuscar {

	public static void main(String[] args) {

		int[] searchArray = { 1, 2, 3 };
		int toSearch = 1;
		System.out.println(arrayBuscar(searchArray, toSearch, 0));

	}

	public static String arrayBuscar(int array[], int buscar, int num) {

		if (num < array.length) {
			if (array[num] == buscar)
				return "Si, hemos encontrado el " + buscar;
			else
				return arrayBuscar(array, buscar, num + 1);
		}
		return "No hemos encontrado " + buscar;
	}
}
