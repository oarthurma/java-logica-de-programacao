import java.util.Scanner;
import java.util.Locale;

public class BeeCrowd1008 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int horasTrabalhadas = sc.nextInt();
		double valor = sc.nextDouble();
		
		double salario = valor * horasTrabalhadas;
		
		System.out.println("NUMBER = " + num);
		System.out.printf("SALARY = U$ %.2f", salario);
		
		sc.close();

	}

}
