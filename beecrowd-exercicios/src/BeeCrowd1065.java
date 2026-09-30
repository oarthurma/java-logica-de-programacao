import java.util.Scanner;
public class BeeCrowd1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		int valor3 = sc.nextInt();
		int valor4 = sc.nextInt();
		int valor5 = sc.nextInt();
		
		int pares = 0;
		
		if (valor1 % 2 == 0) {
			pares++;
		};
		
		if (valor2 % 2 == 0) {
			pares++;
		}
		
		if (valor3 % 2 == 0) {
			pares++;
		}
		
		if (valor4 % 2 == 0) {
			pares++;
		}
		
		if (valor5 % 2 == 0) {
			pares++;
		}
		
		System.out.println(pares + " valores pares");
		
		sc.close();
		
	}

}
