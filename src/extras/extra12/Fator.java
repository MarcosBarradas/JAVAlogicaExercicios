package extras.extra12;

import java.util.Scanner;

/*Um número é fator de outro quando, ao dividir o segundo número pelo primeiro, o resto da divisão é zero.
desenvolva um algoritmo que testa se d é um fator de n.
 */
public class Fator {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite o valor de d: ");
        double d = read.nextDouble();

        System.out.println("Agora digite o valor de n: ");
        double n = read.nextDouble();

        if(d != 0 && n % d == 0) {
            System.out.println(d + " é operando de: " + n);
        }
        read.close();
    }
}
