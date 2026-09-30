import java.util.Scanner;
public class BeeCrowd1047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horaInicial = sc.nextInt();
		int minutoInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		int minutoFinal = sc.nextInt();
		
		int horas = 0;
		int minutos = 0;
		
		if (minutoInicial > minutoFinal) {
			minutos = 60 - (minutoInicial - minutoFinal);
			if (horaInicial > horaFinal) {
				horas = 24 - horaInicial + horaFinal - 1;
			} else if (horaInicial < horaFinal) {
				horas = horaFinal - horaInicial - 1;
			} else {
				horas = 24 - 1;
			}
		} else if (minutoInicial < minutoFinal) {
			minutos = minutoFinal - minutoInicial;
			if (horaInicial > horaFinal) {
				horas = 24 - horaInicial + horaFinal;
			} else if (horaInicial < horaFinal) {
				horas = horaFinal - horaInicial;
			} else {
				horas = 0;
			}
		} else {
			minutos = 0;
			if (horaInicial > horaFinal) {
				horas = 24 - horaInicial + horaFinal;
			} else if (horaInicial < horaFinal) {
				horas = horaFinal - horaInicial;
			} else {
				horas = 24;
			}
		}
		
		System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");
		
		sc.close();

	}
}
