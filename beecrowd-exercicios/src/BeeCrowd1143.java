import java.util.Scanner;

public class BeeCrowd1143 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
				
		for (int i=1; i<=n; i++) {
			
			
			int segundo = i * i;
			int terceiro = i * segundo;
			
			System.out.printf("%d %d %d%n", i, segundo, terceiro);
		
		}
		
		sc.close();

	}

}
