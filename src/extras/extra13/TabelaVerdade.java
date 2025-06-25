package extras.extra13;

/*Exiba a tabela da verdade - Herbert Schildt - java para iniciantes.*/

public class TabelaVerdade {
    public static void main(String[] args) {
        boolean p, q;

    System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT");// P  Q  AND  OR  XOR  NOT

        p = q = true;//true       true          true            true             false          false
        System.out.print(p + "\t" + q + "\t" + (p & q)+ "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p) + "\n");

        p = true;
        q = false;   //true       false         false           true             true            false
        System.out.print(p + "\t" + q + "\t" + (p & q)+ "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p) + "\n");
        
        p = false;
        q = true;    //false      true         false            true             true            true
        System.out.print(p + "\t" + q + "\t" + (p & q)+ "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p) + "\n");
        
        p = false;
        q = false;   //false      false         false           false            false           true
        System.out.print(p + "\t" + q + "\t" + (p & q)+ "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p) + "\n");
    }
}
