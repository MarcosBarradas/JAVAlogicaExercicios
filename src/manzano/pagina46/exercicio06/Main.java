package manzano.pagina46.exercicio06;

import java.util.Scanner;

/*Apresenta como resultado o valor de uma potência de uma base
* qualquer elevada a um expoente qualquer, ou seja, de BE, em que B é o valor
* da base e E o valor do expoente. sem utilizar o operador de exponenciação
* (^ ou ** ou math.pow).
*/
public class Main {

	public static void main(String[] args) {
		int base, expoente, resultado, contadora;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Olá, braço curto! Digite dois números e elevarei o primeiro ao segundo");
		System.out.println("\nDigite o primeiro valor, ou seja: a base.");
		base = read.nextInt();
		
		System.out.println("\nDigite o segundo valor, ou seja: o expoente.");
		expoente = read.nextInt();
		expoente--;
		
		resultado = 1;
		contadora = 0;
		
		while (contadora < expoente)//verifica se chegou no expoente desejado
		{
			resultado *= base; // cada incremento equivale à um expoente
			
			contadora++;
		}
		
		System.out.println("\nResultado: " + resultado);
		read.close();
	}

}
