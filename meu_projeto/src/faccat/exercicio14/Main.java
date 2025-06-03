package faccat.exercicio14;

import java.util.Scanner;

public class Main {
//verifica se o valor de entrada do cliente é ou não maior do que 10
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);//instancia scanner
		
		//Solicita e recebe valor do cliente
		System.out.println("Digite um INTEIRO e te direi se é maior do que dez ou não.");
		int valor = read.nextInt();
		
		//verifica com ternário se é maior que 10
		String mensagem = valor > 10 ? "É maior que 10" : "Não é maior que 10";
		
		//exibe mensagem personalizada
		System.out.println(mensagem);
		read.close();
	}

}
