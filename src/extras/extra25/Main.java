package extras.extra25;
//overloading com tipos diferentes
public class Main {
    static int plusMethod(int a, int b) {
        return a + b;
    }
    static double plusMethod(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(plusMethod(1, 2));
        System.out.println(plusMethod(1.0, 2.0));
    }
}
