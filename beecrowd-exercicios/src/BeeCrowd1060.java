import java.util.Scanner;
import java.util.Locale;

public class BeeCrowd1060 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor1 = sc.nextDouble();
		double valor2 = sc.nextDouble();
		double valor3 = sc.nextDouble();
		double valor4 = sc.nextDouble();
		double valor5 = sc.nextDouble();
		double valor6 = sc.nextDouble();
		
		int positivos = 0;
		
		if (valor1 > 0) {
			positivos++;
		}
		
		if (valor2 > 0)
			positivos++;
		
		if (valor3 > 0) positivos++;
		
		if (valor4 > 0) positivos++;
		
		if (valor5 > 0) positivos++;
		
		if (valor6 > 0) positivos++;
		
		System.out.println(positivos + " valores positivos");
			sc.close();

	}

}
