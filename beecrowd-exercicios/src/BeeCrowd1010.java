import java.util.Scanner;
import java.util.Locale;

public class BeeCrowd1010 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod1 = sc.nextInt();
		int num1 = sc.nextInt();
		double valor1 = sc.nextDouble();

		int cod2 = sc.nextInt();
		int num2 = sc.nextInt();
		double valor2 = sc.nextDouble();
				
		double valorAPagar = num1 * valor1 + num2 * valor2; 
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorAPagar);
		
		sc.close();
	}

}
