package extras.extra34;

public class BuscaBinaria {
    public static void main(String[] args) {
        int[] numeros = {2, 4, 7, 10, 23, 31, 45, 56};
        int alvo = 23;
        int inicio = 0;
        int fim = numeros.length - 1;
        boolean encontrado = false;
        while(inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if(numeros[meio] == alvo) {
                encontrado = true;
                break;
            } else if(numeros[meio] < alvo) {
                inicio = meio +1;
            } else {
                fim = meio -1;
            }
        }
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (numeros[meio] == alvo) {
                System.out.println("Encontrado na posição: " + meio);
                encontrado = true;
                break;
            } else if (numeros[meio] < alvo) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        if (!encontrado) {
            System.out.println("Valor não encontrado.");
        }
    }
}