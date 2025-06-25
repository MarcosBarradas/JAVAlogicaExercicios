package extras.extra33;
//percorrendo um array bidimensional com foreach
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int nums[][] = new int[3][5];
        //adiciona uns numero aí... primeiro de um em um depois de dois em dois epor ai vai
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                nums[i][j] = (i+1)*(j+1);
                System.out.println(nums[i][j]);
            }
        }
        //repare no int[]. tem que ser assim pq cada elemento em nums é um
        //array unidimensional
        for(int[] linha : nums){
            for(int coluna : linha){
                sum += coluna;
            }
        }
        System.out.println("sum: " + sum);

    }
}
