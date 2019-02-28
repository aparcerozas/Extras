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
public class MostrarList {
    public static void mostrar(ClassList l){
        System.out.println("index   value");
        for(int i=0;i<l.a.size();i++){
            System.out.println("  " + i + "      " + l.getElement(i));
        }
    }
}
