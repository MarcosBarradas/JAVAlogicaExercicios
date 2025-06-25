package faccat.exercicio25;
/*
Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e 
escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior 
ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'. 
*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite o número da sua conta: ");
		int numeroConta = read.nextInt();
		
		System.out.println("Digite o saldo: ");
		int saldo = read.nextInt();
		
		System.out.println("Digite o credito: ");
		int credito = read.nextInt();
		
		System.out.println("Digite o debito: ");
		int debito = read.nextInt();
		
		int saldoAtual = saldo - debito + credito;
		
		System.out.println("Número da conta: " + numeroConta);
		System.out.println("Saldo anterior: " + saldo);
		System.out.println("Credito: " + credito);
		System.out.println("Debito: " + debito);
		System.out.println("Saldo Atual: " + saldoAtual);
		
		read.close();
	}

}
