import java.util.Locale;
import java.util.Scanner;

public class ex_06 {
	public static void main(String[] args) {
		/*
		 Problema exemplo de uso do do while:
		 
		 Fazer um programa para ler um temperatura em Celsius e mostrar o equivalente em Fahrenheit.
		 Perguntar se o usuário deseja repetir (s/n). Caso o usuário digite "s", repetir o programa.
		 
		 Formula: F = 9c / 5 + 32
		*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char repetir = 'n';
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double c = sc.nextDouble();
			double f = 9 * c / 5 + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);
			System.out.print("Deseja repetir (s/n)? ");
			repetir = sc.next().charAt(0);
		} while (repetir == 's' || repetir == 'S');
		
		
		sc.close();
		
	}

}
