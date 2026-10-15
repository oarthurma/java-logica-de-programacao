import java.util.Scanner;
public class BeeCrowd1071 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		int soma = 0;
		
		int maior, menor;
		
		if (X > Y) {
			maior = X;
			menor = Y;
		} else {
			maior = Y;
			menor = X;
		} 
		
		for (int i = menor+1; i < maior; i++) {
			if (i % 2 != 0) {
				soma += i;
			}
		}
		System.out.println(soma);
		
		sc.close();
	}

}
