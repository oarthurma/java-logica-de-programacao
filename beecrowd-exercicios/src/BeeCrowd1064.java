import java.util.Locale;
import java.util.Scanner;

public class BeeCrowd1064 {

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
		double soma = 0.0;
		double media;
		
		if (valor1 > 0) {
			positivos++;
			soma += valor1;
		}
		
		if (valor2 > 0) {
			positivos++;
			soma += valor2;
		}
		
		if (valor3 > 0) {
			positivos++;
			soma += valor3;
		}
		
		if (valor4 > 0) {
			positivos++;
			soma += valor4;
		}
		
		if (valor5 > 0) {
			positivos++;
			soma += valor5;
		}
		
		if (valor6 > 0) {
			positivos++;
			soma += valor6;
		}
		
		media = soma / positivos;
		
		System.out.println(positivos + " valores positivos");
		System.out.printf("%.1f%n", media);
		sc.close();

	}

}
