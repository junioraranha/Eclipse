package problemaMultiplos;
import java.util.Scanner;

public class ProblemaMultiplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a , b;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite dois numeros inteiros");
		a = input.nextInt();
		b = input.nextInt();
		
		if (a%b == 0 || b%a == 0) {
			
			System.out.println("São multiplos");		
		}
		else {
			System.out.println("Não são multiplos");
		}
	}

}
