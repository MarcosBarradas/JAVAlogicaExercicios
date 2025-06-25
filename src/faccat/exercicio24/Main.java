package faccat.exercicio24;

import java.util.Scanner;

/*
Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que 
ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que 
ultrapassar este valor, calcular e escrever o seu salário total. 
*/
public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Escreva o salário fixo");
		float salario = read.nextFloat();
		
		System.out.println("Escreva o valor das vendas");
		float valorDasVendas = read.nextFloat();
		
		float comissaoTotal = valorDasVendas < 1501 ? valorDasVendas * 1.03f : 1500 * 1.03f + (valorDasVendas - 1500) * 1.05f; 
		float salarioTotal = comissaoTotal + salario;
		
		System.out.println("Salário total: " + salarioTotal);
		read.close();
	}

}
