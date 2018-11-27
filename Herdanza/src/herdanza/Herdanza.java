/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herdanza;
import java.text.ParseException;

/**
 *
 * @author aparcerozas
 */
public class Herdanza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Empregado perita = new Empregado("Pedro", "12-07-2013", "26-11-2018", "Profesor");
        System.out.println(perita.toString());
        Secretaria perita2 = new Secretaria();
        System.out.println(perita2.toString());
    }
    
}
