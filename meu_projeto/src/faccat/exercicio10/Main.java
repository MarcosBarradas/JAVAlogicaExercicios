package faccat.exercicio10;

import java.util.Scanner;

/*calcular preço final de um carro novo para o consumidor, considerando custo de fábrica, percentual do distribuidor
 * (28% custo de fábrica) e impostos (45% sobre custo de fábrica)
 * O cálculo soma o custo de fábrica com as porcentagens do distribuidor e impostos*/
public class Main {

	public static void main(String[] args) {
		double custoFabrica, custoFinal, distribuidor, impostos; //declara variáveis
		
		Scanner read = new Scanner(System.in);//abre scanner
		
		System.out.println("CALCULADORA DE PREÇO TOTAL (PERCENTUAL IMPOSTO/DISTRIBUIDOR) ");
		System.out.println("Digite o custo de fábrica do carro: ");
		custoFabrica = read.nextDouble(); // lê o custo de fábrica
		
		distribuidor = custoFabrica * 0.28; // 28% do custo de fábrica -> distribuidor
		impostos = custoFabrica * 0.45;     // 45% do custo de fábrica -> imposto
		
		custoFinal = custoFabrica + distribuidor + impostos;
		
		System.out.println("");
		System.out.printf("custo de fábrica: R$%.2f %n", custoFabrica);
		System.out.printf("Margem distribuidor: R$%.2f %n", distribuidor);
		System.out.printf("Margem Leão: R$%.2f %n", impostos);
		System.out.println("");
		System.out.printf("Custo final ao coitado do consumidor: R$%.2f %n", custoFinal);
		System.out.println("");
		read.close();
	}

}
