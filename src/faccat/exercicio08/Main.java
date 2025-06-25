package faccat.exercicio08;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// ctrl + space na palavra Scanner e clica na primeira opção
		Scanner leia = new Scanner(System.in); // n esqueça do system.in

		System.out.println("Escreva numero de eleitores: ");
		int eleitores = leia.nextInt();

		System.out.println("Escreva numero de votos brancos: ");
		int votosBrancos = leia.nextInt();

		System.out.println("Escreva numero de votos válidos: ");
		int votosValidos = leia.nextInt();

		int votosNulos = eleitores - votosBrancos - votosValidos;

		double percentualNulos = (votosNulos * 100.0) / eleitores;
		double percentualBrancos = (votosBrancos * 100.0) / eleitores;
		double percentualValidos = (votosValidos * 100.0) / eleitores;

		System.out.println("votos nulos: " + percentualNulos + '%');
		System.out.println("votos brancos: " + percentualBrancos + '%');
		System.out.println("votos validos: " + percentualValidos + '%');
		leia.close();

	}
}
