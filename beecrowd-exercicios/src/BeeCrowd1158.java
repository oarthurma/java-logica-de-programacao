import java.util.Scanner;

public class BeeCrowd1158 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int soma = 0;

			int x = sc.nextInt();
			int y = sc.nextInt();

			if (x % 2 == 0) {
				x++;
			}

			for (int j=1; j <= y; j++) {
				soma += x;
				x += 2;
			}
			System.out.println(soma);
		}

		sc.close();

	}

}
