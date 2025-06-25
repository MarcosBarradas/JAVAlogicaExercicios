package faccat.exercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);//instancia scanner
		
		//Solicita e recebe valor do cliente
		System.out.println("Digite um INTEIRO e te direi é positivo ou negativo ");
		int quantidadeMacas = read.nextInt();
		
		float totalAPagar = quantidadeMacas < 12 ? 
				1.30f * quantidadeMacas: //calcula preço total (sem desconto)
					1f * quantidadeMacas;//calcula preço total (com desconto)
		
		System.out.println("Total a pagar: " + totalAPagar);
		read.close();

	}

}
