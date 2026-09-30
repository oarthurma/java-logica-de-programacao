import java.util.Scanner;

public class BeeCrowd1061 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dia, hora, minuto, segundo,totalSegInicio, totalSegTermino, resto, dias, horas, minutos, segundos;
		String data;
		char doisPontos;
		
		data = sc.next();
		dia = sc.nextInt();
		hora = sc.nextInt();
		doisPontos = sc.next().charAt(0);
		minuto = sc.nextInt();
		doisPontos = sc.next().charAt(0);
		segundo = sc.nextInt();
		
		totalSegInicio = (dia * 86400) + (hora * 3600) + (minuto * 60) + segundo;
		
		data = sc.next();
		dia = sc.nextInt();
		hora = sc.nextInt();
		doisPontos = sc.next().charAt(0);
		minuto = sc.nextInt();
		doisPontos = sc.next().charAt(0);
		segundo = sc.nextInt();
		
		totalSegTermino = (dia * 86400) + (hora * 3600) + (minuto * 60) + segundo;
		
		resto = totalSegTermino - totalSegInicio;
		
		dias = resto / 86400;
		System.out.println(dias + " dia(s)");
		resto = resto % 86400;
		
		horas = resto / 3600;
		System.out.println(horas + " hora(s)");
		resto = resto % 3600;
		
		minutos = resto / 60;
		System.out.println(minutos + " minuto(s)");
		resto = resto % 60;
		
		segundos = resto;
		System.out.println(segundos + " segundo(s)");
		
		sc.close();
	}
}
