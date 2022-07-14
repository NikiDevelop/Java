public class Fibonacci {

	public static void main(String[] args) {
		//Sacamos los 10 primeros numeros de Fibonacci
		int serie = 10, num1 = 0, num2 = 1, suma = 1;

		System.out.println(num1);
		/*En estas lineas lo que vamos hacer es que se vayan incrementando los valores
		 y que vayan sumando los dos ultimos digitos...
		por ejemplo: 1 + 2 = 3; 2 + 3 = 5; 3 + 5 = 8; 5 + 8 = 13... 
		asi hasta que se recorra el bucle 10 veces	
		*/
		
		for (int i = 0; i < serie; i++) {
			suma = num1 + num2;
			num1 = num2;
			num2 = suma;
			System.out.println(suma);
		}

	}

}
