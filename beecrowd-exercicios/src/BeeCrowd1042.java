import java.util.Scanner;

public class BeeCrowd1042 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int menor;
		int meio;
		int maior;
		
		if (num1 < num2 && num1 < num3) {
			menor = num1;
			if (num2 < num3) {
				meio = num2;
				maior = num3;
			} else {
				meio = num3;
				maior = num2;
			}
		} else if (num2 < num1 && num2 < num3) {
			menor = num2;
			if (num1 < num3) {
				meio = num1;
				maior = num3;
			} else {
				meio = num3;
				maior = num1;
			}
		} else {
			menor = num3;
			if (num1 < num2) {
				meio = num1;
				maior = num2;
			} else {
				meio = num2;
				maior = num1;
			}
		}
		
		System.out.println(menor);
		System.out.println(meio);
		System.out.println(maior);
		System.out.println();
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		
		sc.close();

	}

}
