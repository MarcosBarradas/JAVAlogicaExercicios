package extras.extra35;
//crie um algoritmo que percorre um array de valores inteiros e calcula a média da somatória
//use for ou foreach
public class ListaMedia {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,7,8,9};
        int sum = 0;

        for(int x :  nums) {
            sum += x;
        }
        System.out.println(sum/nums.length);
    }
}
