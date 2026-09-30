import java.util.Locale;
import java.util.Scanner;

public class BeeCrowd1021 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int nota, quociente, resto, moeda, centavos;
		double N;
		
		N = sc.nextDouble();
		
		resto = (int)(N * 100 + 0.5);
		System.out.println("NOTAS:");
		
		nota = 100;
		centavos = nota * 100;
		quociente = resto / centavos;
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
		resto = resto % centavos;
		
		nota = 50;
		centavos = nota * 100;
		quociente = resto / centavos;
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
		resto = resto % centavos;
		
		nota = 20;
		centavos = nota * 100;
		quociente = resto / centavos;
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
		resto = resto % centavos;
		
		nota = 10;
		centavos = nota * 100;
		quociente = resto / centavos;
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
		resto = resto % centavos;
		
		nota = 5;
		centavos = nota * 100;
		quociente = resto / centavos;
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
		resto = resto % centavos;
		
		nota = 2;
		centavos = nota * 100;
		quociente = resto / centavos;
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
		resto = resto % centavos;
		
		System.out.println("MOEDAS:");
		
		moeda = 1;
		centavos = moeda * 100;
		quociente = resto / centavos;
		System.out.println(quociente + " moeda(s) de R$ " + moeda + ".00");
		resto = resto % centavos;
				
		centavos = 50;
		quociente = resto / centavos;
		System.out.println(quociente + " moeda(s) de R$ 0." + centavos);
		resto = resto % centavos;
		
		centavos = 25;
		quociente = resto / centavos;
		System.out.println(quociente + " moeda(s) de R$ 0." + centavos);
		resto = resto % centavos;
		
		centavos = 10;
		quociente = resto / centavos;
		System.out.println(quociente + " moeda(s) de R$ 0." + centavos);
		resto = resto % centavos;
	
		centavos = 5;
		quociente = resto / centavos;
		System.out.println(quociente + " moeda(s) de R$ 0.0" + centavos);
		resto = resto % centavos;
		
		centavos = 1;
		quociente = resto / centavos;
		System.out.println(quociente + " moeda(s) de R$ 0.0" + centavos);
		resto = resto % centavos;
		
		sc.close();

	}

}
