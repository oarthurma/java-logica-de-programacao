import java.util.Scanner;

public class BeeCrowd1115 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();	
		
		while(x != 0 && y != 0) {
			String quadrante;
			
			if (x > 0) {
				if (y > 0) {
					quadrante = "primeiro";					
				} else {
					quadrante = "quarto";
				}
			} else {
				if (y < 0) {
					quadrante = "terceiro";
				} else {
					quadrante = "segundo";
				}
			}
		
			System.out.println(quadrante);
			
			x = sc.nextInt();
			y = sc.nextInt();
			
		}
		sc.close();
	}
}
