package extras.extra01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite em valor númerico um mês: ");
		int mesNumerico = read.nextInt();
		
		System.out.print("O mês é ");
		switch (mesNumerico) { //ctrl + alt + seta pra baixo
		case 1: 
			System.out.println("janeiro.");
			break;
		case 2: 
			System.out.println("fevereiro.");
			break;
		case 3: 
			System.out.println("março.");
			break;
		case 4: 
			System.out.println("abril.");
			break;
		case 5: 
			System.out.println("maio.");
			break;
		case 6: 
			System.out.println("junho.");
			break;
		case 7: 
			System.out.println("julho.");
			break;
		case 8: 
			System.out.println("agosto.");
			break;
		case 9: 
			System.out.println("setembro.");
			break;
		case 10: 
			System.out.println("outubro.");
			break;
		case 11: 
			System.out.println("novembro.");
			break;
		case 12: 
			System.out.println("dezembro.");
			break;
		default: //default é o caso escolhido quando nenhum dos outros casos não forem escolhidos.
			System.out.println("Essa opção não existe, quer inventar um mês novo?");
		}
		read.close();
	}

}
