#Queremos saber si un numero es palindrome, se tiene que leer igual en un sentido que en otro
#Por ejemplo: 2112 SI es palindromo
# 2211 NO es palindromo

import java.util.Scanner;

public class PalindromeNumero {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Es palíndrome el número?: ");
		int num = teclado.nextInt();
		
		System.out.println(EsPalindrome(num));
	}
	
	public static Boolean EsPalindrome(int x) {
		if (x < 0 || (x % 10 == 0 && x != 0)) {
			return false;
		}
		#Invertimos el numero
		int revertirNumero = 0;
		while (x > revertirNumero) {
			revertirNumero = revertirNumero * 10 + x % 10;
			x /= 10;
		}
		return x == revertirNumero || x == revertirNumero / 10;
	}
}
