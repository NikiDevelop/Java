#Lo que queremos hacer aquí es darle la vuelta a un numero
#Por ejemplo: 2457 -> 7542 
	
import java.util.Scanner;	
public class InvertirNumero {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int num = teclado.nextInt();

		System.out.println(reverse(num));
	}
	public static int reverse(int x) {
		long out = 0;
		while (x != 0) {
			#Invertimos el numero
			out = out * 10 + x % 10;
			x = x / 10;
		}
		return (int) out;
	}
}
