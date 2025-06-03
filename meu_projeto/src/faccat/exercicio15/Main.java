package faccat.exercicio15;

import java.util.Scanner;

//recebe valor do cliente e verifica se é positivo, neutro ou negativo
public class Main {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);//instancia scanner
		
		//Solicita e recebe valor do cliente
		System.out.println("Digite um INTEIRO e te direi é positivo ou negativo ");
		int valor = read.nextInt();
		
		//verifica se é positivo, negativo ou neutro
		String mensagem = valor < 0 ? "negativo" : valor != 0 ? "positivo" : "neutro";
		
		//exibe mensagem personalizada
		System.out.println(mensagem);
		read.close();
	}

}
