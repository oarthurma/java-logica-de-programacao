import java.util.Scanner;

public class BeeCrowd1142 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n*4; i++) {
			if (i % 4 != 0) {
				System.out.printf("%d ", i);
			} else {
				System.out.println("PUM");
			}
		}	
		sc.close();
	}

}
