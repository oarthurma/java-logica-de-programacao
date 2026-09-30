import java.util.Scanner;

public class BeeCrowd1049 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String palavra1 = sc.next();
		String palavra2 = sc.next();
		String palavra3 = sc.next();
		
		String resultado = "";
		
		if (palavra1.equals("vertebrado")) {
			if (palavra2.equals("ave")) {
				if (palavra3.equals("carnivoro")) {
					resultado = "aguia";
				}
				if (palavra3.equals("onivoro")) {
					resultado = "pomba";
				}
			}
			if (palavra2.equals("mamifero")) {
				if (palavra3.equals("onivoro")) {
					resultado = "homem";
				}
				if (palavra3.equals("herbivoro")) {
					resultado = "vaca";
				}
			}
		} 
		
		if (palavra1.equals("invertebrado")) {
			if (palavra2.equals("inseto")) {
				if (palavra3.equals("hematofago")) {
					resultado = "pulga";
				}
				
				if (palavra3.equals("herbivoro")) {
					resultado = "lagarta";
				}
			}
			if (palavra2.equals("anelideo")) {
				if (palavra3.equals("hematofago")) {
					resultado = "sanguessuga";
				}
				
				if (palavra3.equals("onivoro")) {
					resultado = "minhoca";
				}
			}
		}
		
		
		System.out.println(resultado);
		
		sc.close();

	}

}
