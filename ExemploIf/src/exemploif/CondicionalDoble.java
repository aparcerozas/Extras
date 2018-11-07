/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploif;

import java.util.Scanner;

/**
 *
 * @author aparcerozas
 */
public class CondicionalDoble {
    public void maiorIdade(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca a idade:");
        int idade = teclado.nextInt();
        if(idade < 18){
           System.out.println("É menor de idade");
        }
        else{
           System.out.println("É maior de idade");

        }
    }
}
