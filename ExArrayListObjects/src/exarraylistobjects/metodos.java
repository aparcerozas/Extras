/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exarraylistobjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JOptionPane;
import utilidades.PedirDatos;

/**
 *
 * @author aparcerozas
 */
public class metodos {
    public void engadir(ArrayList<Alumno> lisAlumnos){
        Alumno a1 = crearAlumno();
        lisAlumnos.add(a1);
    }
    
    public Alumno crearAlumno(){
        String n=PedirDatos.palabras("Introduzca nome:");
        String dni=PedirDatos.palabras("Introduzca DNI:");
        int nota=PedirDatos.enteiro("Introduzca nota:");
        Alumno a1 = new Alumno(n,dni,nota);
        return a1;
    }
    
//    public void engadirTodo(ArrayList<Alumno> lisAlumnos){
//        lisAlumnos.add(Alumno a1 = new Alumno((PedirDatos.palabras("Introduzca nome:");),(PedirDatos.palabras("Introduzca DNI:");),(PedirDatos.enteiro("Introduzca nota:");)));
//    }
    
    public void verForEach(ArrayList<Alumno> lisAlumnos){
        for(Alumno ele : lisAlumnos){
            System.out.println(ele.toString());
        }
    }
    
    public void verIterator(ArrayList<Alumno> lisAlumnos){
        Iterator it = lisAlumnos.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
    public void borrarPosicion(int posicion, ArrayList<Alumno> lisAlumnos){
        lisAlumnos.remove(posicion);
    }
    
    public void borrarDNI(String dni, ArrayList<Alumno> lisAlumnos){
        for(int i=0;i<lisAlumnos.size();i++){
            if(lisAlumnos.get(i).getDni().equals(dni)){
                lisAlumnos.remove(i);
            }
        }
    }
    
    public void borrarIterator(String dni, ArrayList<Alumno> lisAlumnos){
        Iterator it = lisAlumnos.iterator();
        Alumno a = new Alumno();
        while(it.hasNext()){
            a=(Alumno)it.next();
            if(dni.equalsIgnoreCase(a.getDni())){
                lisAlumnos.remove(a);
            }
        }
    }
    
    public void ordenar(ArrayList<Alumno> lisAlumnos){
        Collections.sort(lisAlumnos);
    }
    
    public void buscar(String dni, ArrayList<Alumno> lisAlumnos){
        for(Alumno a : lisAlumnos){
            if(dni.equalsIgnoreCase(a.getDni())){
                System.out.println(a.toString());
            }
        }
    }
    
    public void modificarNota(String dni, ArrayList<Alumno> lisAlumnos){
        for(Alumno a : lisAlumnos){
            if(dni.equalsIgnoreCase(a.getDni())){
                int nota = Integer.parseInt(JOptionPane.showInputDialog("A nota é "+a.getNota()+"\nIntroduzca nova nota:"));
                a.setNota(nota);
            }
        }
    }
}
