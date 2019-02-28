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
public class Singleton {
    private static Singleton INSTANCIA = null;
    private int id;
    private String nombre;
    private int dni;

    private Singleton(int id, String nombre, int dni) {
        this.id = id;
        this.nombre = nombre;
        this.dni = dni;
    }

    private Singleton() {
    }
    
    public static Singleton instanciar(){
        if(INSTANCIA==null){
            INSTANCIA = new Singleton();
            return INSTANCIA;
        }
        return INSTANCIA;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "id=" + id + ", nombre=" + nombre + ", dni=" + dni;
    }
    
}
