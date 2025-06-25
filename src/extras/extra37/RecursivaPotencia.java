package extras.extra37;

class Fatorial{
    int fatorial(int n){
        int result;

        if(n==1)return 1;
        result = fatorial(n-1) * n;
        return result;
    }
}

public class RecursivaPotencia {
    public static void main(String[] args) {
        Fatorial f = new Fatorial();
        System.out.println(f.fatorial(5));
    }
}
