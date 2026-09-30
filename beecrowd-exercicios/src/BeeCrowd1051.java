import java.util.Locale;
import java.util.Scanner;

public class BeeCrowd1051 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		double ir = 0.0;
		double resto = 0.0;

		if (salario <= 2000.0) {
			System.out.println("Isento");
		} else { 
			if (salario <= 3000.0) {
			ir = (salario - 2000.0) * 0.08;
		} else if (salario <= 4500.0) {
			resto = salario - 3000.0;
			ir = (salario - 2000.0 - resto) * 0.08;
			ir += (resto * 0.18);
		} else {
			resto = salario - 3000.0;
			ir = (salario - 2000.0 - resto) * 0.08;
			resto = salario - 4500.0;
			ir += ((salario - 3000.0 - resto) * 0.18);
			ir += (resto * 0.28);

			sc.close();
			}
			System.out.printf("R$ %.2f%n", ir);
		}	
	}
}
