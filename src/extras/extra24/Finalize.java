package extras.extra24;
//classe para testar finalize/garbage collector
class FDemo {
    int x;
    FDemo (int i) {
        x = i;
    }

    protected void finalize(){ //descontinuado
        System.out.println("Finalize: " + x);
    }
    void generador(int i) {
        FDemo o = new FDemo(i);
    }
}
public class Finalize {
    public static void main(String[] args) {
        int count;

        FDemo ob = new FDemo(0);

        for(count = 0; count < 1000000; count++) {
            ob.generador(count);
        }

    }
}
