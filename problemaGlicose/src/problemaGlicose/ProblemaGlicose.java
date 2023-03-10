package problemaGlicose;
import java.util.Scanner;

public class ProblemaGlicose {

	public static void main(String[] args) {
		
		double taxa;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a média da glicose:");
		taxa = input.nextDouble();
		
		if (taxa <= 100) {
			System.out.println("Classificação: Normal");
		}	
			else {
				if (taxa > 140) {
					System.out.println("Classificação: Diabetes");
				}
					else {
					System.out.println("Classificação: Elevada");
					}
					
			}
			
	}

}
