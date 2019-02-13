/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exhashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JOptionPane;
import utilidades.PedirDatos;

/**
 *
 * @author aparcerozas
 */
public class Secretaria {
    public static int refe = 6000;
    Alumno a1;
    
    public void crear(HashMap<String, Alumno> alum, String dni){
        if(alum.containsKey(dni))
            JOptionPane.showMessageDialog(null, "");
        else
            alum.put(dni, new Alumno(PedirDatos.palabras("nome"), PedirDatos.enteiro("nota")));
    }
    
    public void amosar(HashMap<String, Alumno> alum){
        System.out.println(alum);
        Iterator it = alum.keySet().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
    public void pasarArrayList(HashMap<String, Alumno> alum, ArrayList<Alumno> lista){
        lista.removeAll(alum.values());
        lista.addAll(alum.values());
        for(Alumno al : lista){
            System.out.println(al);
        }
    }
    
    public void eliminar(HashMap<String, Alumno> alum, String dni){
        if(!alum.containsKey(dni))
            JOptionPane.showMessageDialog(null, "Non está na lista");
        else
            alum.remove(dni);
    }
    
    public void modificarNota(HashMap<String, Alumno> alum, String dni, int nota){
        if(alum.containsKey(dni))
            alum.get(dni).setNota(nota);
        else{
            JOptionPane.showMessageDialog(null, "Non está na lista");
        }
    }
    
    public void consultar(HashMap<String, Alumno> alum, String dni){
        if(alum.containsKey(dni))
            System.out.println(alum.get(dni).toString());
        else{
            JOptionPane.showMessageDialog(null, "Non está na lista");
        }
    }
    
    
}
