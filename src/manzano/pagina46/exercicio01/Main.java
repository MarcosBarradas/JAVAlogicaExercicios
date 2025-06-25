package manzano.pagina46.exercicio01;

import java.util.Scanner;

public class Main {
//Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um número qualquer. 
	
	public static void main(String[] args) {
		int numero, i, multiplicacao; //declara variáveis
		
		Scanner read = new Scanner(System.in); // intancia escaneador
		
		System.out.println("digite um número e farei a tabuada dele: "); //pede entrada de dados pro cliente
		numero = read.nextInt(); //Lê entrada do cliente
		
		i = 1; //inicia a contadora
		
		while (i < 11) //condicional
		{
			
		multiplicacao = i * numero; // multiplica pela incrementadora da vez
		System.out.printf("%d x %d = %d%n", numero, i, multiplicacao); // exibe a tabuada
		
		i++; //incrementa
		
		}
		
		read.close();
	}

}
