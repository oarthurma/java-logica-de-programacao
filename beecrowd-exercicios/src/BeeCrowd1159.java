import java.util.Scanner;

public class BeeCrowd1159 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		while (x != 0) {
			int soma = 0;
			
			
			if (x % 2 != 0) {
				x++;
			} 
			
			soma = x + x+2 + x+4 + x+6 + x+8;
			
			System.out.println(soma);
			
			x = sc.nextInt();
		}
		
		sc.close();

	}

}
