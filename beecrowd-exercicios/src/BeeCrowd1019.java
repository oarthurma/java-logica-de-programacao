import java.util.Scanner;

public class BeeCrowd1019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int h = N / 3600;
		
		int resto = N % 3600;
		
		int m = resto / 60;
		
		int s = resto % 60; 
		
		System.out.println(h+":"+m+":"+s);
		
		sc.close();

	}

}
