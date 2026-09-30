import java.util.Scanner;

public class BeeCrowd1131 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int novo = 1;
		int grenais = 0;
		int vitoriasInter = 0;
		int vitoriasGremio = 0;
		int empates = 0;
		String resultado = "";
		
		while (novo == 1) {
			int golsInter = sc.nextInt();
			int golsGremio = sc.nextInt();
			
			grenais++;
			
			if (golsInter > golsGremio) {
				vitoriasInter++;
			} else if (golsGremio > golsInter) {
				vitoriasGremio++;
			} else {
				empates++;
			}
			
			System.out.println("Novo grenal (1-sim 2-nao)");
			novo = sc.nextInt();
			while (novo != 1 && novo != 2) {
				novo = sc.nextInt();
			}
		}
		
		System.out.println(grenais + " grenais");
		System.out.println("Inter:" + vitoriasInter);
		System.out.println("Gremio:" + vitoriasGremio);
		System.out.println("Empates:" + empates);
		
		if (vitoriasInter > vitoriasGremio) {
			resultado = "Inter venceu mais";
		} else if (vitoriasInter < vitoriasGremio) {
			resultado = "Gremio venceu mais";
		} else {
			resultado = "Nao houve vencedor";
		}
		
		System.out.println(resultado);
		
		sc.close();
	}
}
