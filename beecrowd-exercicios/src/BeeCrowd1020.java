import java.util.Scanner;

public class BeeCrowd1020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idadeEmDias, dias,quociente, resto;
		
		idadeEmDias = sc.nextInt();
		
		resto = idadeEmDias;
		
		dias = 365; 
		quociente = resto / dias;
		System.out.println(quociente + " ano(s)");
		resto = resto % dias;
		
		dias = 30;
		quociente = resto / dias;
		System.out.println(quociente + " mes(es)");
		resto = resto % dias;
		
		dias = 1;
		quociente = resto / dias;
		System.out.println(quociente + " dia(s)");
		
		sc.close();

	}

}
