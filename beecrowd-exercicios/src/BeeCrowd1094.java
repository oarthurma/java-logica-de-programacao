import java.util.Locale;
import java.util.Scanner;

public class BeeCrowd1094 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int quantia = 0;
		
		int total = 0; 
		
		int coelhos = 0;
		int ratos = 0;
		int sapos = 0;
		
		for (int i=0; i<n;i++) {
			
			quantia = sc.nextInt();
			char tipo = sc.next().charAt(0);
			
			total += quantia;
			
			if (tipo == 'C') {
				coelhos += quantia;
			}
			
			if (tipo == 'R') {
				ratos += quantia;
			}
			
			if (tipo == 'S') {
				sapos += quantia;
			}

		}
		System.out.println("Total: " + total + " cobaias");
		System.out.println("Total de coelhos: " + coelhos);
		System.out.println("Total de ratos: " + ratos);
		System.out.println("Total de sapos: " + sapos);
		System.out.printf("Percentual de coelhos: %.2f %%%n", coelhos * 100 / (double) total);
		System.out.printf("Percentual de ratos: %.2f %%%n", ratos * 100 / (double) total);
		System.out.printf("Percentual de sapos: %.2f %%%n", sapos * 100 / (double) total);
		
		
		sc.close();
 }
}