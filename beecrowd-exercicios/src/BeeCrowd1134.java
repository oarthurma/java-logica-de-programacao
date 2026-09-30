import java.util.Scanner;

public class BeeCrowd1134 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tipo = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel= 0;
		
		while (tipo != 4) {
			if (tipo == 1) {
				alcool++;
			}  
			
			if (tipo == 2) {
				gasolina++;
			} 
			
			if (tipo == 3) {
				diesel++;
			} 
			
			tipo = sc.nextInt();		
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
	}

}
