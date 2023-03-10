package problemaTempodeJogo;
import java.util.Scanner;

public class ProblemaTempoDeJogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int horaInicio, horaFim, duracao;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hora inicial: ");
		horaInicio = input.nextInt();
		System.out.println("Hora final: ");
		horaFim = input.nextInt();
		
		if (horaFim > horaInicio) {
			duracao = horaFim-horaInicio;
		} else {
			duracao = (24-horaInicio) + horaFim;
		}
		System.out.print("O JOGO DUROU: ");
		System.out.print(duracao);
		System.out.print(" HORAS");
	}

}
