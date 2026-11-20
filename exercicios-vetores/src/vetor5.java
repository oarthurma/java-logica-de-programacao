import java.util.Locale;
import java.util.Scanner;

public class vetor5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] vet = new int[N];
		
		for (int i=0; i<N; i++) {
			vet[i] = sc.nextInt();
		}
		
		int somaDosPares = 0;
		int quantidadeDePares = 0;
		for (int i=0; i<N; i++) {
			if (vet[i] % 2 == 0) {
				somaDosPares += vet[i];
				quantidadeDePares++;
			}
		}
		
		double media = somaDosPares / quantidadeDePares;
		System.out.printf("%.1f%n", media);
		
		sc.close();
	}
}
