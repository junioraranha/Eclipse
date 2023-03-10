package problemaAumento;
import java.util.Scanner;

public class ProblemaAumento {

	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		double salario, novoSalario = 0, aumento = 0;
		String porcentagem = null;
		
		System.out.print("Digite o salario da pessoa:");
		salario = input.nextDouble();
		
		if (salario <= 1000) {
			porcentagem = "20%";
			novoSalario = salario * 1.20;
			aumento = novoSalario - salario;
		} else {
			if (salario <= 3000) {
				porcentagem = "15%";
				novoSalario = salario * 1.15;
				aumento = novoSalario - salario;	
			} else {
				if (salario <= 8000) {
					porcentagem = "10%";
					novoSalario = salario * 1.10;
					aumento = novoSalario - salario;
			    } else {
			    	if (salario > 8000) {
						porcentagem = "5%";
						novoSalario = salario * 1.05;
						aumento = novoSalario - salario;
			        }
			      }	
			   }	
		  }
		 System.out.print("Novo salario: ");
		 System.out.println(novoSalario);
		 System.out.print("Aumento: ");
		 System.out.println(aumento);
		 System.out.print("Porcentagem: ");
		 System.out.println(porcentagem);
	}
}
