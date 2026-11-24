import java.util.Locale;
import java.util.Scanner;

public class vetor7 {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    String[] nomes = new String[N];
    double[] notas1 = new double[N];
    double[] notas2 = new double[N];
    double[] media = new double[N];

    for (int i = 0; i < N; i++) {
      nomes[i] = sc.next();
    }

    for (int i = 0; i < N; i++) {
      notas1[i] = sc.nextDouble();
    }

    for (int i = 0; i < N; i++) {
      notas2[i] = sc.nextDouble();
    }

    for (int i = 0; i < N; i++) {
      media[i] = (notas1[i] + notas2[i]) / 2.0;
    }

    System.out.println("Alunos aprovados:");

    for (int i = 0; i < N; i++) {
      if (media[i] >= 6.0) {
        System.out.println(nomes[i]);
      }
    }

    sc.close();

  }
}
