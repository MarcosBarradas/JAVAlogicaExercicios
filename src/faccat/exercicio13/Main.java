package faccat.exercicio13;

import java.util.Scanner;
//fórmula: (n1 * 2) + (n2 * 3) + (n3 * 5) / 10
public class Main {
	public static void main(String[] args) {
		double nota1, nota2, nota3, mediaPonderada;
		Scanner leia = new Scanner(System.in);//instanciar scanner
		
		//saudação e informação de como funciona o programa
		System.out.println("BEM-VINDO AO MEU PROGRAMA DE CÁLCULO DE MÉDIA PONDERADA.");
		System.out.println("--------------------------------------------------------");
		System.out.println("A PRIMEIRO COISA QUE VOCÊ PRECISA SABER É O PESO DAS NOTAS \n");
		System.out.println("NOTA     | peso ");
		System.out.println("---------|------");
		System.out.println("Primeira |  2 ");
		System.out.println("Segunda  |  3 ");
		System.out.println("Terceira |  5 ");
		System.out.println("----------------\n");
		
		//recolhe as notas
		System.out.println("Dito isso, digite a primeira nota: ");
		nota1 = leia.nextDouble();
		System.out.println("Certo, agora digite a segunda nota: ");
		nota2 = leia.nextDouble();
		System.out.println("Muito bem, só falta a terceira nota: ");
		nota3 = leia.nextDouble();
		
		//calcula media
		mediaPonderada = (nota1*2 + nota2*3 + nota3*5) / 10;
		
		//saída
		System.out.println("\nMEDIA PONDERADA: " + mediaPonderada);
		leia.close();
	}

}
