package com.java.algoritmos;

import java.util.Scanner;

public class ArrayEliminarRepetido {

	public static void main(String[] args) {
		//Eliminar elementos repetidos de un array
				
		char[] arr = {'1', '2', '1', '5', '0', '2', '4'};
		
		System.out.println("Original array: ");
		for(int i = 0; i < arr.length;i++) { //Mostramos el array
			System.out.println("["+arr[i]+"]");
		}
		
		for(int i = 0; i < arr.length; i++) { //i = 0 Primero se ejecuta el for de fuera (i) pero se ejecuta entero (j) y hasta que no termine (j) no se incrementa (i)
			for(int j = 0; j < arr.length-1;j++) { // j = 0, j = 1, j = 2.... 
				if(i != j) {
					if(arr[i] == arr[j]) { //aqui hacemos la comparacion, si arr[i] es igual a arr[j]...  
						arr[j] =' '; //... lo eliminamos o en este caso vaciamos el elemento encontrado que este repetido
					}
				}
			}
		}
		System.out.println("-------------------------------------");
		System.out.println("Elementos repetidos eliminados: ");
		for(int i = 0; i < arr.length;i++) { //Mostramos el array final
			System.out.println("["+arr[i]+"]");
		}
	}
}
