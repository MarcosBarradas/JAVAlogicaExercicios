package faccat.exercicio26;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite a capacidade máxima: ");
		int capacidadeMaxima = read.nextInt();
		
		System.out.println("Digite a quantidade mínima: ");
		int capacidadeMinima = read.nextInt();
		
		System.out.println("Digite a quantidade de produtos: ");
		int quantidade = read.nextInt();
		
		
		int mediaEstoque = (capacidadeMaxima + capacidadeMinima) / 2;

		String mensagem = mediaEstoque > quantidade ? "Abasteça o estoque" : "Tá de boa";
		
		System.out.println(mensagem);
		System.out.println(quantidade);
		System.out.println(mediaEstoque);
		read.close();
	}	

}
