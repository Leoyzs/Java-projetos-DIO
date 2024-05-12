package aula1;

import java.util.Locale;
import java.util.Scanner;

public class Terminal {
	public static void main (String [] args) {
		

		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Qual seu nome?");
		String Nome = scanner.next();		
		System.out.println("seu nome é " + Nome);
		
}
}
