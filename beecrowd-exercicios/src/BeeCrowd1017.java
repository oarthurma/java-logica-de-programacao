import java.util.Scanner;
import java.util.Locale;

public class BeeCrowd1017 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int tempo, velocidade, consumo;

		consumo = 12;

		tempo = sc.nextInt();
		velocidade = sc.nextInt();

		double qntLitros = (double) tempo * velocidade / consumo;

		System.out.printf("%.3f%n", qntLitros);

		sc.close();
	}

}
