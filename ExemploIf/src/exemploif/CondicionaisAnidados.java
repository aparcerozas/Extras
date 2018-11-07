/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploif;

import javax.swing.JOptionPane;

/**
 *
 * @author aparcerozas
 */
public class CondicionaisAnidados {
    public void maiorMenor(){
        int num1, num2;
        String numero1 = JOptionPane.showInputDialog("Introduzca o primeiro número:");
        num1 = Integer.parseInt(numero1);
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca o segundo número:"));
        if(num1 > num2){
           System.out.println(num1 + " é maior que " + num2);
        }
        else{
           if(num1 < num2){
               System.out.println(num1 + " é menor que " + num2);
           }
           else{
               System.out.println(num1 + " é igual que " + num2);
           }
        }
    }
}
