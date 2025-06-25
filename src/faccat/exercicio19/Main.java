package faccat.exercicio19;

import java.util.Scanner;

//Lê dois valores considerando que são diferentes e exibe o maior deles.
public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int primeiro = read.nextInt();
		System.out.println("Digite seu segundo: ");
		int segundo = read.nextInt();
		
		int maior = primeiro > segundo? primeiro : segundo;
	
		
		System.out.println(maior);
		read.close();

	}

}
