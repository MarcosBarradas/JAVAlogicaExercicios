package extras.extra19;

public class Main {
    public static void main(String[] args) {
        int[][] n = {
         /*    0| 1| 2| 3*/
         /*0*/{1, 2, 3, 4},
         /*1*/{5, 6, 7}
        };
        for(int linha = 0; linha < n.length; ++linha)//percorre as linhas
        {
            for(int coluna = 0; coluna < n[linha].length /*pega o número de colunas*/; ++coluna){
                System.out.print(n[linha][coluna] + " ");
            }
            System.out.println();
        }
        //versão foreach
        for(int[] linha: n) {
            for(int column: linha) {
                System.out.print(column+ " ");
            }
            System.out.println();
        }
    }
}
