import java.util.Scanner;

public class BeeCrowd1044 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int maior, menor;
		
		if (a > b) {
			maior = a;
			menor = b;
		} else {
			maior = b;
			menor = a;
		}
		
		if (maior % menor == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");			
		}
		
		sc.close();

	}

}
