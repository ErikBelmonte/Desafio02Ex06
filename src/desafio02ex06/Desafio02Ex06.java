package desafio02ex06;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Desafio02Ex06 {
    public static void main(String[] args) {
        /* Considerando que o aumento dos funcionários é de 75% do INPC e mais um percentual de
        produtividade discutido com a empresa. Construir um algoritmo que leia o número do
        funcionário, seu salário atual, o valor do INPC e o índice de produtividade e escreve o
        número do funcionário, seu aumento e o valor de seu novo salário. */
        
        String numbEmploy;
        double currentWage, Inpc, producIndex, increase, newWage;
        DecimalFormat f = new DecimalFormat("0.00");
        
        numbEmploy = JOptionPane.showInputDialog("Digite seu número de funcionário:");
        currentWage = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salário atual:"));
        producIndex = Double.parseDouble(JOptionPane.showInputDialog("Informe seu índice de produtividade:"));
        Inpc = 75/100;
        increase = Inpc + currentWage * (producIndex/100);
        newWage = currentWage + increase;
            JOptionPane.showMessageDialog(null, "Seu número de funcionário é: "+f.format(numbEmploy));
            JOptionPane.showMessageDialog(null, "Seu aumento foi de: "+f.format(increase));
            JOptionPane.showMessageDialog(null, "Seu novo salário é de: "+f.format(newWage));
            
        
        
    }
    
}
