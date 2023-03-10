package problemaLanchonete;
import java.util.Scanner;

public class ProblemaLanchonete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int item;
		double quantidade;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Codigo do produto comprado");
		item = input.nextInt();
		System.out.println("Quantidade comprada");
		quantidade = input.nextDouble();
		
		switch (item) {
		
		case (1):
			System.out.print("Valor a pagar: ");
			System.out.print(quantidade * 5f);
			break;
			
		case (2):
			System.out.print("Valor a pagar: ");
			System.out.print(quantidade * 3.5f);
			break;
			
		case (3):
			System.out.print("Valor a pagar: ");
			System.out.print(quantidade * 4.8f);
			break;
			
		case (4):
			System.out.print("Valor a pagar: ");
			System.out.print(quantidade * 8.9f);
			break;
			
		case (5):
			System.out.print("Valor a pagar: ");
			System.out.print(quantidade * 7.32f);	
			break;
			
		default:
			System.out.print("Voce não escolheu uma opção válida");
			break;		
		}
		
	}

}
