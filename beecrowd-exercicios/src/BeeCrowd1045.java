import java.util.Locale;
import java.util.Scanner;

public class BeeCrowd1045 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double lado1 = sc.nextDouble();
		double lado2 = sc.nextDouble();
		double lado3 = sc.nextDouble();

		double a = 0.0;
		double b = 0.0;
		double c = 0.0;

		if (lado1 >= lado2 && lado1 >= lado3) {
			a = lado1;
			if (lado2 > lado3) {
				b = lado2;
				c = lado3;
			} else {
				b = lado3;
				c = lado2;
			}

		} else if (lado2 >= lado1 && lado2 >= lado3) {
			a = lado2;
			if (lado1 > lado3) {
				b = lado1;
				c = lado3;
			} else {
				b = lado3;
				c = lado1;
			}
		} else if (lado3 >= lado1 && lado3 >= lado2) {
			a = lado3;
			if (lado1 > lado2) {
				b = lado1;
				c = lado2;
			} else {
				b = lado2;
				c = lado1;
			}
		}

		if (a >= b + c) {
			System.out.println("NAO FORMA TRIANGULO");
		} else {

			if (a * a == b * b + c * c) {
				System.out.println("TRIANGULO RETANGULO");
			}
	
			if (Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
	
			if (a * a < b * b + c * c) {
				System.out.println("TRIANGULO ACUTANGULO");
			}
	
			if (a == b && a == c) {
				System.out.println("TRIANGULO EQUILATERO");
			}
	
			if (a == b && b != c || b == c && a != b ) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		}

		sc.close();

	}

}
