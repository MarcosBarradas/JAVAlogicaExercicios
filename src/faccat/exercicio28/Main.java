package faccat.exercicio28;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int valor1, valor2, valor3;
		
		Scanner read = new Scanner(System.in);
		System.out.println("Nesse sistema você digita valores e eu descubro qual é o maior");
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = read.nextInt();
		System.out.println("Digite o segundo valor: ");
		valor2 = read.nextInt();
		System.out.println("Digite o terceiro valor: ");
		valor3 = read.nextInt();
		
		System.out.print("O maior: ");
		if (valor1 > valor2 && valor1 > valor3) {
			System.out.println(valor1);
		} else if (valor2 > valor3) { //não faço and aqui porque o if acima já mostra que valor1 n é o maior
			System.out.println(valor2);
		} else {
			System.out.println(valor3);
		}
		read.close();
	}

}
