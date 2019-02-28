/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exbuilder2;

/**
 *
 * @author aparcerozas
 */
public class ExBuilder2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pizza hawaiana;
        hawaiana = new PizzaBuilder(500,200)
                .setGrSal(200)
                .setGrPinha(320)
                .setMlAceite(400)
                .setTipoAceite("Oliva virgen extra")
                .createPizza();
        System.out.println(hawaiana.toString());
    }
    
}
