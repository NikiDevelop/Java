package com.java.algoritmos;

import java.util.Arrays;

public class ArraysOrdenar {

	public static void main(String[] args) {
		int[] numeros1 = { 70, 55, 20, 38, 10, 33, 421, 94, 4, 15 };
		int[] numeros2 = { 70, 55, 20, 38, 10, 33, 421, 94, 4, 15 };
		int[] numeros3 = { 70, 55, 20, 38, 10, 33, 421, 94, 4, 15 };
		int[] numeros4 = { 70, 55, 20, 38, 10, 33, 421, 94, 4, 15 };
		int[] numeros5 = { 70, 55, 20, 38, 10, 33, 421, 94, 4, 15 };
		String lista_String[] = { "Pepe", "Maria", "Alex", "Lucas", "Nuria" };

		burbuja(numeros1);

		quicksort(numeros2, 0, numeros2.length - 1);

		Arrays.sort(numeros3);

		intercambio(numeros4);

		System.out.println("Burbuja");
		for (int i = 0; i < numeros1.length; i++) {
			System.out.println(numeros1[i]);
		}

		System.out.println("Quicksort");
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println(numeros2[i]);
		}

		System.out.println("Arrays.sort");
		for (int i = 0; i < numeros3.length; i++) {
			System.out.println(numeros3[i]);
		}

		System.out.println("Intercambio");
		for (int i = 0; i < numeros4.length; i++) {
			System.out.println(numeros4[i]);
		}

		System.out.println("Array de String sin ordenar");
		for (int i = 0; i < lista_String.length; i++) {
			System.out.println(lista_String[i]);
		}

		// ordenamos el array
		intercambioPalabras(lista_String);

		System.out.println("Array de String ordenado:");
		imprimirArray(lista_String);
	}

	public static void imprimirArray(String lista[]) {
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
	}

	public static void burbuja(int lista[]) {
		int cuentaIntercambios = 0;
		// Usamos un bucle anidado, saldra cuando este ordenado el array
		for (boolean ordenado = false; !ordenado;) {
			for (int i = 0; i < lista.length - 1; i++) {
				if (lista[i] > lista[i + 1]) {
					// Intercambiamos valores
					int variableAuxiliar = lista[i];
					lista[i] = lista[i + 1];
					lista[i + 1] = variableAuxiliar;
					// indicamos que hay un cambio
					cuentaIntercambios++;
				}
			}
			// Si no hay intercambios, es que esta ordenado.
			if (cuentaIntercambios == 0) {
				ordenado = true;
			}
			// Inicializamos la variable de nuevo para que empiece a contar de nuevo
			cuentaIntercambios = 0;
		}
	}

	public static void quicksort(int lista1[], int izq, int der) {
		int i = izq;
		int j = der;
		int pivote = lista1[(i + j) / 2];
		do {
			while (lista1[i] < pivote) {
				i++;
			}
			while (lista1[j] > pivote) {
				j--;
			}if (i <= j) {
				int aux = lista1[i];
				lista1[i] = lista1[j];
				lista1[j] = aux;
				i++;
				j--;			
			}
		} while (i <= j);
		if (izq < j) {
			quicksort(lista1, izq, j);
		}if (i < der) {
			quicksort(lista1, i, der);		
		}
	}

	public static void intercambio(int lista[]) {

		// Usamos un bucle anidado
		for (int i = 0; i < (lista.length - 1); i++) {
			for (int j = i + 1; j < lista.length; j++) {
				if (lista[i] > lista[j]) {
					// Intercambiamos valores
					int variableauxiliar = lista[i];
					lista[i] = lista[j];
					lista[j] = variableauxiliar;
				}
			}
		}
	}

	public static void intercambioPalabras(String lista[]) {

		// Usamos un bucle anidado
		for (int i = 0; i < (lista.length - 1); i++) {
			for (int j = i + 1; j < lista.length; j++) {
				if (lista[i].compareToIgnoreCase(lista[j]) > 0) {
					// Intercambiamos valores
					String variableauxiliar = lista[i];
					lista[i] = lista[j];
					lista[j] = variableauxiliar;
				}
			}
		}
	}
}
