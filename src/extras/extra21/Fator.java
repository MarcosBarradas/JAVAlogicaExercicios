package extras.extra21;
//crie um programa que descobri os fatores de 2 a 100

public class Fator {
    public static void main(java.lang.String[] args) {
        for(int i = 2; i <= 100; i++){
            System.out.print("Fatores de " + i + ": ");
            //só precisa de uma linha de instrução
            for(int j = 2; j <= i; j++) if(i % j == 0) System.out.print(j + ", ");
            System.out.println(" ");
        }
    }
}
