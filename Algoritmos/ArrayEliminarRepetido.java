import java.util.Scanner;

public class ArrayEliminarRepetido {

	public static void main(String[] args) {
		//Eliminar elementos repetidos de un array
				
		char[] arr = {'1', '2', '1', '5', '0', '2', '4'};
		
		System.out.println("Original array: ");
		//Mostramos el array original
		for(int i = 0; i < arr.length;i++) { 
			System.out.println("["+arr[i]+"]");
		}
		 //Primero se ejecuta el for de fuera (i) pero se ejecuta entero (j) y hasta que no termine (j) no se incrementa (i)
		// j = 0, j = 1, j = 2.... 
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length-1;j++) { 
				if(i != j) {
					//aqui hacemos la comparacion, si arr[i] es igual a arr[j]... 
					//... lo eliminamos o en este caso vaciamos el elemento encontrado que este repetido
					if(arr[i] == arr[j]) {  
						arr[j] =' '; 
					}
				}
			}
		}
		System.out.println("-------------------------------------");
		System.out.println("Elementos repetidos eliminados: ");
		 //Mostramos el array final
		for(int i = 0; i < arr.length;i++) {
			System.out.println("["+arr[i]+"]");
		}
	}
}
