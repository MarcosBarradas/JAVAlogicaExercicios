package extras.extra17;
//calcula potencias de 0 a 9 do valor 2
import java.io.IOException;

public class Potencia {
    public static void main(String[] args) throws IOException {
        int e, result;
        System.in.read();

        for(int i = 0; i < 10; i++) {
            result = 1;
            e = i;// o valor dessa repeticao passa para pro e poder decrementar sem o i perder o valor original
            while(e > 0) {
                result *= 2;
                e--;
            }
            System.out.println(i + "! = " + result);
        }
    }
}
