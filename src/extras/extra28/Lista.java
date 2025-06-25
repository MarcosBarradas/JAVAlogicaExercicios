package extras.extra28;
/*crie um array bidimensional de forma dinamica do 1 até o 12
resultado esperado
1	2	3	4
5	6	7	8
9	10	11	12
*/
public class Lista {
    public static void main(String[] args) {
        int t,i; //contadoras
        //[qtde linhas][qtde colunas]
        int[][] table = new int[3][4];
        for(t=0;t<3;t++) {
            for(i=0;i<4;i++) {//multiplicamos pelo número de colunas
                table[t][i]= (t*4)+1 +i; //+1 ajusta para alinh atual logo após
                //t*4 contabilizar quantos elementos foram adicionados multiplicando
                //linha anterior pelo numero de colunas
                System.out.print(table[t][i]+"\t");
            }
            System.out.println();//pula uma linha sempre que completar 4 colunas.
        }
    }
}
