import java.util.Scanner;

public class BeeCrowd1050 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String cidade;
		
		switch (num) {
		case 61:
			cidade = "Brasilia";
			break;
		case 71:
			cidade = "Salvador";
			break;
		case 11:
			cidade = "Sao Paulo";
			break;
		case 21:
			cidade = "Rio de Janeiro";
			break;
		case 32:
			cidade = "Juiz de Fora";
			break;
		case 19:
			cidade = "Campinas";
			break;
		case 27:
			cidade = "Vitoria";
			break;
		case 31:
			cidade = "Belo Horizonte";
		default: 
			cidade = "DDD nao cadastrado";
		}
		
		System.out.println(cidade);
		sc.close();
	}

}
