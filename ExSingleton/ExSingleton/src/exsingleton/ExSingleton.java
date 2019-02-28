/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exsingleton;

/**
 *
 * @author aparcerozas
 */
public class ExSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Singleton s1 = Singleton.instanciar();
        s1.setId(15);
        s1.setNombre("Pedro");
        s1.setDni(123);
        System.out.println(s1.toString());
        Singleton s2 = Singleton.instanciar();
        s2.setId(16);
        s2.setNombre("Marta");
        s2.setDni(456);
        System.out.println(s2.toString());
        System.out.println(s1.toString());
    }
    
}
