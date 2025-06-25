package extras.extra18;
//Vou usar break rotulado.para contar até o número escolhido pelo user.;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 10: ");
        int numero = read.nextInt();

        // Usando break rotulado
        outerLoop: for (int i = 1; i <= 10; i++) {
            if (i == numero) {
                System.out.println("Você escolheu o número: " + i);
                break outerLoop; // Sai do loop externo
            }
            System.out.println("Número atual: " + i);
        }

        System.out.println("Fim do programa.");
        read.close();

    }
}
