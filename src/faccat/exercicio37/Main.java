package faccat.exercicio37;

import javax.swing.*;

/*  numa fruteira vende morango por R$2.5 mas vende por R$2.2
 * acima de 5kg; maçã R$1.8, mas faz por R$1.5 o kg acima de 5kg
 * Se o cliente comprar mais de 8 Kg em frutas ou o valor total
 * da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre
 * este total. Esse algoritmo lê a quantidade (em Kg) de morangos
 * e a quantidade (em Kg) de maças adquiridas e escreve o valor a ser pago
 * pelo cliente de acordo com essas condições.
 */
public class Main {
    public static void main(String[] args) {
        float precoMorangoPromocional = 2.2f;
        float precoMorangoComum = 2.2f;
        float precoMacaPromocional = 1.5f;
        float precoMacaComum = 1.8f;
        float totalMorango;
        float totalMaca;
        float kgMorango = Float.parseFloat(JOptionPane.showInputDialog("Quantos quilos de morango?"));
        float kgMaca = Float.parseFloat(JOptionPane.showInputDialog("Quantos quilos de maçã?"));

        totalMorango = kgMorango <= 5? kgMorango * precoMorangoComum : kgMorango * precoMorangoPromocional;
        totalMaca = kgMaca <= 5? kgMaca * precoMacaComum : kgMaca * precoMacaPromocional;

        float kgTotal = kgMorango + kgMaca;
        float totalAPagar = totalMorango + totalMaca;

        if(kgTotal > 8 || totalAPagar > 8) {
            totalAPagar = (float) (totalAPagar * 0.9); //da 10% de desconto
        }
        String mensagem = "total de maçãs: " + kgMaca + "kg" +
                "\ntotal de morango: " + kgMorango + "kg" +
                "\npreço do morango: R$" + String.format("%.2f", totalMorango) +
                "\npreço da maçã: R$" + String.format("%.2f", totalMaca) + "kg" +
                "\nTotal a pagar: R$" + String.format("%.2f", totalAPagar);

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
