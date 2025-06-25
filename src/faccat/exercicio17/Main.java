package faccat.exercicio17;

import java.util.Scanner;

//lê duas avaliações de um aluno e através da média responde se ele foi aprovado ou não.
public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in); //instancia escaneador
		
		//solicita e lê notas do usuário
		System.out.println("BEM-VINDO AO MEU SISTEMA DE NOTAS\n \nDIGITE DUAS NOTAS E DESCUBRA SE PASSA NOS MEUS CRITÉRIOS.");
		System.out.println("Comece digitando somente a primeira nota (de 0 a 10): ");
		float nota1 = read.nextFloat();
		System.out.println("Digite a segunda nota e logo exibirei se passou ou não");
		float nota2 = read.nextFloat();
		
		//calcula média
		float mediaAritmetica = (nota1 + nota2) / 2;
		
		//verifica aprovação do aluno
		String resultado = mediaAritmetica < 6? ", infelizmente, reprovado" : " aprovado";
		
		//exibe
		System.out.println("O aluno foi" + resultado + " com a média: " + mediaAritmetica + ".");
		read.close();
	}

}
