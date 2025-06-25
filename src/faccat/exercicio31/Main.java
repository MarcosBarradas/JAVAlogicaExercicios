package faccat.exercicio31;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int valor1, valor2, valor3;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor");
		valor1 = read.nextInt();
		
		System.out.println("Digite o segundo valor");
		valor2 = read.nextInt();
		
		System.out.println("Digite o terceiro valor");
		valor3 = read.nextInt();
		
		if(valor1 < valor1 + valor2 && valor2 < valor3 + valor1 && valor3 < valor1 + valor2) {
			System.out.println("Forma um triângulo");
		} else {
			System.out.println("Não forma triângulo");
		}
		read.close();
	}

}
