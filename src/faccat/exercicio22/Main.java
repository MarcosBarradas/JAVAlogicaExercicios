package faccat.exercicio22;

import java.util.Scanner;

/* A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais 
de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. 
Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva 
o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas 
(considere que o mês possua 4 semanas exatas). */
public class Main {

	public static void main(String[] args) {
		double jornadaFeita, jornadaCombinada, horaExtraFeita, horaExtraAPagar, valorHora, totalAPagar, valorHoraExtra, salarioPadrao;
		
		jornadaCombinada = 160;//horas combinadas por mês
		
		Scanner read = new Scanner(System.in);
		
		//Pede horas feitas
		System.out.println("Bem-vindo ao programa de cálculo de horas extras.");
		System.out.println("Digite quantas horas o funcionário em questão trabalhou nesse mês");
		jornadaFeita = read.nextDouble();
		
		//Pede o salário do funcionário por hora
		System.out.println("Quanto esse funcionário recebe por hora?\n");
		valorHora = read.nextDouble();
		valorHoraExtra = valorHora * 1.50; // 150%
		
		//calcula hora extra
		horaExtraFeita = jornadaFeita - jornadaCombinada;
		horaExtraAPagar = horaExtraFeita * valorHoraExtra; 
		
		//calcula total
		salarioPadrao = jornadaCombinada * valorHora;
		totalAPagar = salarioPadrao + horaExtraAPagar;
		
		System.out.printf("Horas de uma jornada comum (mensal): %.0f horas%n", jornadaCombinada );
		System.out.printf("Salário hora da jornada comum: R$%.02f%n", valorHora );
		System.out.printf("Horas extras feitas: %.0f horas%n", horaExtraFeita );
		System.out.printf("Valor da hora extra: R$%.02f%n", + valorHoraExtra );
		System.out.printf("%nValor do total das horas extras feitas: R$%.02f%n", horaExtraAPagar );
		System.out.printf("Salário comum: R$%.02f%n", salarioPadrao );
		System.out.printf("total a pagar: R$%.02f%n", totalAPagar);
		read.close();

	}

}
