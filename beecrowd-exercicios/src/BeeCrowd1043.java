import java.util.Locale;
import java.util.Scanner;

public class BeeCrowd1043 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double maior;
		double menor1;
		double menor2;
		
		if (a > b && a > c) {
			maior = a;
			menor1 = b;
			menor2 = c;
		} else if (b > a && b > c) {
			maior = b;
			menor1 = a;
			menor2 = c;
		} else {
			maior = c;
			menor1 = a;
			menor2 = b;
		}
		
		double perimetro = maior + menor1 + menor2;
		double area = (a + b) * c / 2;
		
		if (maior < menor1 + menor2) {
			System.out.printf("Perimetro = %.1f%n", perimetro);
		} else {
			System.out.printf("Area = %.1f%n", area);
		}
		
		sc.close();

	}

}
