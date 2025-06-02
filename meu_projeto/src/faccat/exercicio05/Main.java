package faccat.exercicio05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //abrindo scanner
		
		System.out.println("Digite um número inteiro e te devolverei o antecessor");
		
		int valor = scanner.nextInt(); // entrada: 2
		
		//valor--; <--> valor = valor - 1;
		valor = valor - 1; // resultado: 1
		
		System.out.println("Antecessor é: " + valor); // exibe: "Antecessor é: 1"
		scanner.close();//fechando scanner
	}

}
