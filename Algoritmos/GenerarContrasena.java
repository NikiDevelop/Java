import java.util.Scanner;

public class GenerarContrasena {

	public static void main(String[] args) {

		//Creamos un array con el abecedario y los numeros.
		//Hay varias formas de hacerlo pero yo lo hice de esta forma
		String[] contrasena = { "a", "b", "c", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "n", "o",
				"p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
				"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "N", "O", "P", "Q", "R", "S", "T",
				"U", "V", "W", "X", "Y", "Z" };

		Scanner teclado = new Scanner(System.in);
		//Preguntamos de que tamaño quiere la contraseña
		System.out.println("¿De que tamaño quieres la contraseña?: "); 
		int tamanio = teclado.nextInt();

		System.out.print("Contraseña generada: ");
		int generar = 0;

		for (int i = 0; i < tamanio; i++) { 
			//Con Math random generamos letras y numeros aleatorios 
			generar = (int) (Math.random() * contrasena.length) - 1;  
			if (generar != 0) {
				System.out.print((contrasena[generar]));
			}
		}
	}
}
