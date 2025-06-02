package faccat.exercicio04;

import java.util.Scanner;

public class Main {
	// fórmula: Area = PI * raio ^ 2
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double raio, area;
		
		System.out.println("Digite o raio do círculo");
		
		raio = leia.nextDouble();
		
		area = Math.PI * Math.pow(raio, 2); // <<<<<------- Math.pow(base, expoente)
		
		System.out.printf("Abençoado, a area é: %.2f", area);
		leia.close();
	}

}
