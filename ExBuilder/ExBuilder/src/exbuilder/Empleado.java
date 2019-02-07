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
public class Empleado {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int dia;
    private int mes;
    private int ano;
    private double altura;
    private double pie;
    private double sueldo;
    private String dni;
    private String cargo;
    private String formacion;

    public Empleado(final String nombre, final String apellido1, 
            final String apellido2, final int dia, final int mes, 
            final int ano, final double altura, final double pie, 
            final double sueldo, final String dni, final String cargo, 
            final String formacion) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.altura = altura;
        this.pie = pie;
        this.sueldo = sueldo;
        this.dni = dni;
        this.cargo = cargo;
        this.formacion = formacion;
    }
    
    
    
}
