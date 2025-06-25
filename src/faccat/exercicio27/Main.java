package faccat.exercicio27;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor = read.nextInt();
		
		if(valor > 0) {
			System.out.println("Positivo");
		} else if (valor < 0) {
			System.out.println("Negativo");
		} else {
			System.out.println("Neutro");
		}
		read.close();
	}

}
