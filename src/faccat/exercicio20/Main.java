package faccat.exercicio20;

import java.util.Scanner;

//lê dois valores que não são iguais e exibe em forma crescente
public class Main {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);//escaneia
		
		//apresentação
		System.out.println("Escreva número e colocarei em forma crescente!!!\n ");
		
		//solicita e lê os números
		System.out.println("Digite o primeiro número: ");
		int primeiro = read.nextInt();
		System.out.println("Digite seu segundo: ");
		int segundo = read.nextInt();
		
		//exibição de acordo com quem for o maior
		if (primeiro > segundo) {
			System.out.println(segundo + ", "+  primeiro);
		} else {
			System.out.println(primeiro + ", " +  segundo);			
		}
		
		read.close();
	}
}
