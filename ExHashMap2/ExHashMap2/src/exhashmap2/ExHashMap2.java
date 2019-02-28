/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exhashmap2;

/**
 *
 * @author aparcerozas
 */
public class ExHashMap2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClassHash miHash = new ClassHash();
        miHash.putValue(10, "Uno");
        miHash.putValue(11, "Dos");
        miHash.putValue(12, "Tres");
        Hash2List miHash2List = new Hash2List(miHash);
        MostrarList.mostrar(miHash2List);
    }
    
}
