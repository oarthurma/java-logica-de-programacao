import java.util.Locale;
import java.util.Scanner;

public class ex_05 {

	public static void main(String[] args) {
		/*
		 * Faça um programa para ler um número indeterminado de dados, contendo cada um,
		 * a idade de um indivíduo. O último dado, que não entrará nos cálculos, contém
		 * um valor de idade negativa. Calcular e imprimir a idade média deste grupo de
		 * indivíduos. Se for entrado um valor negativo na primeira vez, mostrar a
		 * mensagem "impossivel calcular". Exemplos: Entrada 31 27 46 -5 Saída 34.67
		 * Entrada -10 Saída impossivel calcular
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt();
		int soma = 0;
		int quantidade = 0;
		
		if (idade < 0) {
			System.out.println("impossivel calcular");
		} else {
			while(idade >= 0) {
				soma += idade;
				quantidade++; 
				idade = sc.nextInt();
			}			
			
			double media = (double)soma / quantidade;
			System.out.printf("%.2f%n", media);
		}
		
		
		sc.close();
		
	}

}
