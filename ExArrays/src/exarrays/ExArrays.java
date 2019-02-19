/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exarrays;


/**
 *
 * @author aparcerozas
 */
public class ExArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Metodos perita = new Metodos();
        perita.crearArray();
        perita.amosar();
//        perita.ordenarDirecto();
//        perita.amosar();
        perita.eliminarElemento(3);
        perita.amosar();
        
    }
    
}
