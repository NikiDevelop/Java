import java.util.Scanner;

public class PrimerDigito {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int num2 = 0;
		int num;
		System.out.println("Introduce un número: ");

		num = teclado.nextInt();

		int num3 = num;
		while (num > 9) {
			num2 = num /= 10;
		}
		System.out.println("El primer digito del numero " + num3 + " es: " + num2);
	}
}
