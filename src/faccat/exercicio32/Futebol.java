package faccat.exercicio32;
/*
 * lê nome de dois times, numeros de gols de cada um e printa o
 * vencedor
 */
import javax.swing.*;

public class Futebol {
    public static void main(String[] args) {
       String time1 = JOptionPane.showInputDialog("Digite nome do primeiro time");
       String time2 = JOptionPane.showInputDialog("Digite nome do segundo time");
       int numeroGolsTime1 = Integer.parseInt(JOptionPane.showInputDialog("Quantos gols o " + time1 + " fez?"));
       int numeroGolsTime2 = Integer.parseInt(JOptionPane.showInputDialog("Quantos gols o " + time2 + " fez?"));

       if(numeroGolsTime1 > numeroGolsTime2) {
           JOptionPane.showMessageDialog(null, "O vencedor é " + time1);
       } else if (numeroGolsTime1 < numeroGolsTime2) {
            JOptionPane.showMessageDialog(null, "O vencedor é " + time2);
        } else {
           JOptionPane.showMessageDialog(null, "empate ");
       }
    }
}
