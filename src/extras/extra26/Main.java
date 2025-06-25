package extras.extra26;

public class Main {
    public static int sum2(int min, int i) {
        if (min < i) {
            return i + sum2(min, i-1);
        } else {
            return i;
        }
    }
    public static int sum(int i){
        if (i > 0) {
            return i + sum(i-1);
        } else //quando for 0 cai no else
        {
            return 0;
        }
    }
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
        int r = sum2(5, 10);
        System.out.println(r);
    }
}
