package faccat.exercicio09;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		double salarioAtual, percentualAjuste, novoSalario;
		
		System.out.println("digite o salário atual: ");
		salarioAtual = escaneia.nextDouble();
		System.out.println("digite o percentual de reajuste: ");
		percentualAjuste = escaneia.nextDouble();
		escaneia.close();
		novoSalario = salarioAtual + (salarioAtual * percentualAjuste /100);
		
		System.out.printf("Salário atual: %.2f%%%n ", salarioAtual);
		System.out.printf("Reajuste: %.2f%%%n", percentualAjuste);
		System.out.printf("Salário novo: %.2f%%%n ", novoSalario);
	}

}
