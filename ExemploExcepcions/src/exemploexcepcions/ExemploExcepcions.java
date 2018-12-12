/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploexcepcions;

/**
 *
 * @author aparcerozas
 */
public class ExemploExcepcions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operacion perita = new Operacion();
        perita.dividirLanzandoExcepcion(8, 0);
//        perita.suma(8, 2);
//        perita.resta(8, 2);
//        perita.cociente(8, 2);
//        perita.resto(8, 2);
//        perita.suma(8, 0);
//        perita.resta(8, 0);
//        perita.cociente(8, 0);
//        perita.resto(8, 0);
    }
    
}
