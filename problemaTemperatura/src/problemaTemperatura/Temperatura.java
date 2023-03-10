package problemaTemperatura;
import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		
		double celsius, farh;
		String escolha;
		Scanner input = new Scanner (System.in);
		
		System.out.println("Digite em qual temperatura você irá inserir dados. (C/F)");
		escolha = input.nextLine();
		
		
		switch (escolha) {
		
		case "F":
			System.out.println("Digite a temperatura em Fahrenheit:");
			farh = input.nextDouble();
			
			celsius = (farh-32)*(5/9f);
			
			System.out.print("A temperatura em Celsius é: ");
			System.out.print(celsius);
		break;
		
		case "C":
			System.out.println("Digite a temperatura em Celsius:");
			celsius = input.nextDouble();
			
			farh = (celsius*(9/5f)) + 32;
			
			System.out.print("A temperatura em Farhenheit é: ");
			System.out.print(farh);
		break;
		
		default:
			System.out.println("Você não escolheu nenhuma das opções.");
		break;
		
		}
		
	}

}
