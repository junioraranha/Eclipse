package problemaDardo;
import java.util.Scanner;

public class ProblemaDardo {

	public static void main(String[] args) {
		
		double distA, distB, distC;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite as 3 distancias");
		distA = input.nextDouble();
		distB = input.nextDouble();
		distC = input.nextDouble();
		
		if (distA > distB || distA > distC) {
			System.out.print("MAIOR DISTANCIA: ");
			System.out.println(distA);
		} 
			else {
				if (distB > distC) {
					System.out.print("MAIOR DISTANCIA: ");
					System.out.println(distB);
				} 
					else {
						System.out.print("MAIOR DISTANCIA: ");
						System.out.println(distC);
					}
			}
			

	}

}
