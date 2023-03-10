package problemaCoordenadas;
import java.util.Scanner;

public class ProblemaCoordenadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double x, y;
		
		System.out.println("Valor de X: ");
		x = input.nextDouble();
		System.out.println("Valor de Y: ");
		y = input.nextDouble();
		
		if (x>0 && y>0) {
			System.out.println("Q1");
		} else {
			if (x<0 && y>0) {
				System.out.println("Q2");
			} else {
				if (x<0 && y<0) {
					System.out.println("Q3");
				} else {
					if (x>0 && y<0) {
						System.out.println("Q4");
					} else {
						if (x==0 && y==0) {
							System.out.println("Origem");
						} else {
							if (x==0) {
								System.out.println("Eixo X");
							} else {
								System.out.println("Eixo Y");
							}
						}
					}
				}
			}
		}
	}

}
