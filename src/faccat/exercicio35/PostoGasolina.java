package faccat.exercicio35;

import javax.swing.*;

/**
 * *  recebe 1 valor caractere que pode ser ou G (gasolina) ou A (Alcool)
 * depois lê quantos litros o usuario quer abastecer.
 * depois multiplica por precoGasolina se ler G
 * ou por precoAlcool se ler a opcao A para descobrir o total sem desconto.
 * Se for gasolina da 4% de desconto até 20L e 6% acima de 20L
 * Se for Álcool da 3% de desconto até 20L e 5% acima de 20L
 */

public class PostoGasolina {
    public static void main(String[] args) {
        float precoGasolina = 3.30f;
        float precoAlcool = 2.90f;
        float totalSemDesconto = 0f;
        float desconto = 0f;
        float totalComDesconto = 0f;

        char tipoCombustivel = Character
                .toUpperCase(JOptionPane.showInputDialog("Digite G para Gasolina ou A para Alcool").charAt(0));
        JOptionPane.showMessageDialog(null, "Você escolheu: " + tipoCombustivel);
        float litros = Float.parseFloat(JOptionPane.showInputDialog("Quantos litros você quer abastecer?"));

        if (tipoCombustivel == 'G') {
            if (litros <= 20) {
                totalSemDesconto = precoGasolina * litros;
                desconto = (float) (totalSemDesconto * 0.04);//4% de desconto
                totalComDesconto = totalSemDesconto - desconto;
            } else {
                totalSemDesconto = precoGasolina * litros;
                desconto = (float) (totalSemDesconto * 0.06); //6% de desconto
                totalComDesconto = totalSemDesconto - desconto;
            }
        } else if (tipoCombustivel == 'A') {

            if (litros <= 20) {
                totalSemDesconto = precoAlcool * litros;
                desconto = (float) (totalSemDesconto * 0.03); // 3% de desconto
                totalComDesconto = totalSemDesconto - desconto;
            } else {
                totalSemDesconto = precoAlcool * litros;
                desconto = (float) (totalSemDesconto * 0.5);// 5% de desconto
                totalComDesconto = totalSemDesconto - desconto;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Opção inválida");
        }
        String mensagem = "Você abasteceu " + litros + "L de " + tipoCombustivel +
                "\nO total sem desconto foi de R$" + totalSemDesconto +
                "\nO desconto foi de R$" + desconto +
                "\nO total com desconto é R$" + totalComDesconto;

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
