package faccat.exercicio30;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int valor1, valor2, valor3;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor");
		valor1 = read.nextInt();
		
		System.out.println("Digite o segundo valor");
		valor2 = read.nextInt();
		
		System.out.println("Digite o terceiro valor");
		valor3 = read.nextInt();
		
		
		if(valor1 < valor2 && valor1 < valor3) {
			
			if(valor2 < valor3) {
				System.out.println(valor1+ ", " + valor2+ ", " + valor3);
			} else {
				System.out.println(valor1+ ", " + valor3 + ", " + valor2);
			}
			
		} else if (valor2 < valor1 && valor2 < valor3) {
			
			if (valor1 < valor3) {
				System.out.println(valor2 + ", " + valor1 + ", " + valor3);
			} else {
				System.out.println(valor2 + ", " + valor3 + ", " + valor1);				
			}
			
		} else {
			if (valor2 < valor1) {
				System.out.println(valor3 + ", "+ valor2 + ", " + valor1);
			} else {
				System.out.println(valor3 + ", "+ valor1 + ", " + valor2);
			}
		}
		
		read.close();
	}

}
