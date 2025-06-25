package faccat.exercicio21;

import java.util.Scanner;

// Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os 
//minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é 
//de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.
public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);//escaneia
		
		//apresentação
		System.out.println("Defina a hora de início e fim da partida de xadrez, uma partida pode durar até 24hrs!!!\n ");
		
		//solicita e lê os horários
		System.out.println("Digite o hora de início da partida: ");
		int inicio = read.nextInt();
		System.out.println("Digite a hora de encerramento da partida: ");
		int fim = read.nextInt();
		
		//calcula o tempo da partida
		int duracao = fim - inicio;
		
		//verifica e ajusta se virar o dia
		if(duracao < 0 ) {
			duracao = duracao + 24;
		} 
		
		//exibe
		System.out.println("A partida durou: " + duracao + " horas");
		read.close();
	}

}
