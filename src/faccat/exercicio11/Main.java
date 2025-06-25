package faccat.exercicio11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//declaração de variáveis
		double salarioFixo, comissaoPorCarro, carrosVendidos, faturamentoTotal, comissaoPercentual, totalFixoPorCarro, salarioTotal;
		
		//abertura do Scanner
		Scanner leia = new Scanner(System.in);
		
		//Leitura das informações necessárias: 
		//1 - salário, 
		//2 - comissao por carro vendido, 
		//3 - quantos carros vendidos, 
		//4 - faturamento total
		System.out.println("SEJA BEM-VINDO À NOSSA CALCULADORA DE SALÁRIO/COMISSÃO");
		System.out.println("------------------------------------------------------");
		System.out.println("Para começarmos, digite o salário fixo do vendedor: ");
		salarioFixo = leia.nextDouble();
		System.out.println("------------------------------------------------------");
		System.out.println("Agora digite quanto ele ganha a carro vendido: ");
		comissaoPorCarro = leia.nextDouble();
		System.out.println("------------------------------------------------------");
		System.out.println("Digite quantos carros ele vendeu: ");
		carrosVendidos = leia.nextDouble();
		System.out.println("------------------------------------------------------");
		System.out.println("Muito bem, por último digite o faturamento total que esse vendedor gerou: ");
		faturamentoTotal = leia.nextDouble();
		leia.close();
		
		totalFixoPorCarro = comissaoPorCarro * carrosVendidos; // comissão fixa
		
		comissaoPercentual = faturamentoTotal * 0.05; // comissão percentual
		
		salarioTotal = salarioFixo +  totalFixoPorCarro + comissaoPercentual; 
		System.out.println("------------------------------------------------------");
		System.out.printf("Valor fixo por carro: R$%.2f%n", comissaoPorCarro);
		System.out.printf("Carros vendidos: %.0f%n", carrosVendidos);
		System.out.printf("Faturamento Total: R$%.2f%n", faturamentoTotal);
		System.out.println("------------------------------------------------------");
		System.out.printf("Salário fixo: R$%.2f%n", salarioFixo);
		System.out.printf("Total de todos os carros multiplicado por %.2f:  R$%.2f%n", comissaoPorCarro, totalFixoPorCarro);
		System.out.printf("Total da comissao percentual calculada com base no faturamento de %.2f: R$%.2f%n",faturamentoTotal, comissaoPercentual);
		System.out.printf("Total a receber:  R$%.2f%n", salarioTotal);
	}

}
