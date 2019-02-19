/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exarraylist;

import java.util.ArrayList;
import java.util.Iterator;
import utilidades.PedirDatos;

/**
 *
 * @author aparcerozas
 */
public class metodos {
    public void engadir(ArrayList<Integer> lisNumeros){
        lisNumeros.add(PedirDatos.enteiro(""));
    }
    
    public void amosar(ArrayList<Integer> lisNumeros){
        for(int i=0;i<lisNumeros.size();i++){
            System.out.println(lisNumeros.get(i));
        }
    }
    
    public void amosarForEach(ArrayList<Integer> lisNumeros){
        for(Integer ele : lisNumeros){
            System.out.println(lisNumeros.get(ele));
        }
    }
    
    public void amosarIterator(ArrayList<Integer> lisNumeros){
        Iterator it = lisNumeros.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
    public int borrarPosicion(int posicion, ArrayList<Integer> lisNumeros){
        return lisNumeros.remove(posicion);
    }
    
    public void borrarElemento(int elemento, ArrayList<Integer> lisNumeros){
        lisNumeros.remove(new Integer(elemento));
    }
    
    public void actualizarValor(int posicion, Integer novo, ArrayList<Integer> lisNumeros){
        lisNumeros.set(posicion-1, novo);
    }
    
}
