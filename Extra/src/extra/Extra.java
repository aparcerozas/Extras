/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra;

import java.util.Scanner;
/**
 *
 * @author aparcerozas
 */
public class Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        float radio;
        System.out.println("Introduzca el radio del círculo/esfera");
        radio = teclado.nextFloat();
        System.out.println("Perímetro del círculo: " + 2*Math.PI*radio);
        System.out.println("Área del círculo: " + Math.PI*Math.pow(radio, 2));
        System.out.println("Volumen de la esfera: " + 4/3*Math.PI*Math.pow(radio, 3));
    }
    
}
