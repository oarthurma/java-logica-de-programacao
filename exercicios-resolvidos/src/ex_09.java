import java.util.Locale;
import java.util.Scanner;

public class ex_09 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double vet[] = new double[N];
		
		for (int i=0; i<N; i++) {
			vet[i] = sc.nextDouble();
		}
		
		for (int i=0; i<N; i++) {
			System.out.printf("%.1f ", vet[i]);
		}
		
		double soma = 0;
		double media;
		
		for (int i=0; i<N; i++) {
			vet[i] += soma;
		}
		
		media = soma / N;
		
		System.out.print("%n");
		System.out.printf("%.2f%n", soma);
		System.out.printf("%.2f%n", media);
		
		sc.close();

	}

}
