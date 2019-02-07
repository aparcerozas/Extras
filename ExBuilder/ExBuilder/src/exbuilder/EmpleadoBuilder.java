/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exbuilder;

/**
 *
 * @author aparcerozas
 */
public class EmpleadoBuilder {
    private String nombre;
    private String apellido1;
    private String apellido2 = "";
    private int dia = 0;
    private int mes = 0;
    private int ano = 0;
    private double altura = 0;
    private double pie = 0;
    private double sueldo = 0;
    private String dni;
    private String cargo = "";
    private String formacion = "";

    public EmpleadoBuilder(final String nombre, final String apellido1, final String dni) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.dni = dni;
    }

    
    
}
