import java.util.Scanner;

public class BeeCrowd1072 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int quantidade = sc.nextInt();
		
		int in = 0;
		int out = 0;
		
		for (int i = 1; i <= quantidade; i++) {
			int num = sc.nextInt();
			if (num >= 10 && num <= 20) {
				in++;
			} else {
				out++;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();

	}

}
