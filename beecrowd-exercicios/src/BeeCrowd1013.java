import java.util.Scanner;

public class BeeCrowd1013 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3;
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		int maiorAB = (num1 + num2 + Math.abs(num1 - num2)) / 2;
		int maiorABC = (maiorAB + num3 + Math.abs(maiorAB - num3)) / 2;
		
		System.out.println(maiorABC + " eh o maior");
		
		sc.close();

	}

}
