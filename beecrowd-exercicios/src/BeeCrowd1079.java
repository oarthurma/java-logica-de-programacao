import java.util.Locale;
import java.util.Scanner;

public class BeeCrowd1079 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			double num1 = sc.nextDouble();
			double num2 = sc.nextDouble();
			double num3 = sc.nextDouble();
			
			double mediaPonderada = (num1 * 2.0 + num2 * 3.0 + num3 * 5.0) / 10.0;
			
			System.out.printf("%.1f%n", mediaPonderada);
		}
		
		sc.close();
	}
}
