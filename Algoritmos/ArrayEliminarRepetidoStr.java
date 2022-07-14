package com.java.algoritmos;

public class ArrayEliminarRepetidoStr {

	public static void main(String[] args) {

		String[] arr = { "España", "Portugal", "Argentina", "Alemania", "Argentina", "España", "Colombia", "EEUU",
				"Francia", "Portugal" };
		// Mostramos el array original
		System.out.println("Original array: ");
		for (int i = 0; i < arr.length; i++) { 
			System.out.println("[" + arr[i] + "]");
		}
		  /* i = 0 Primero se ejecuta el for de fuera (i) pero se ejecuta entero
			(j) y hasta que no termine (j) no se incrementa (i)
		 	j = 0, j = 1, j = 2....
		 */
		for (int i = 0; i < arr.length; i++) { 
			for (int j = 0; j < arr.length - 1; j++) { 
				if (i != j) {
					//Aquí si son iguales arr[i] y arr[j], vaciamos arr[j] 
					if (arr[i] == arr[j]) {
						arr[j] = " ";
					}
				}
			}
		}// Mostramos el array final
		System.out.println("-------------------------------------");
		System.out.println("Elementos repetidos eliminados: ");
		for (int i = 0; i < arr.length; i++) { 
			System.out.println("[" + arr[i] + "]");
		}
	}
}
