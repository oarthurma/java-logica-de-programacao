import java.util.Locale;
import java.util.Scanner;

public class vetor9 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String[] comidas = new String[N];
		double[] precosDeCompra = new double[N];
		double[] precosDeVenda = new double[N];
		
		for (int i=0; i<N; i++) {
			comidas[i] = sc.next();
			precosDeCompra[i] = sc.nextDouble();
			precosDeVenda[i] = sc.nextDouble();
		}
		
		int quantidadeLucroMenorQue10 = 0;
		int quantidadeLucroEntre10e20 = 0;
		int quantidadeLucroMaiorQue20;
		
		
		
		for (int i=0; i<N; i++) {
			double valorLucro = precosDeVenda[i] - precosDeCompra[i];
			double porcentagemLucro = valorLucro * 100 / precosDeCompra[i];
				if(porcentagemLucro < 10.0) {
					quantidadeLucroMenorQue10++;
					System.out.printf("Lucro abaixo de 10%%: %.0f%n", quantidadeLucroMenorQue10);
				}
		}
		
		sc.close();
		

	}

}
