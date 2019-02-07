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

    public EmpleadoBuilder setApellido2(String apellido2) {
        this.apellido2 = apellido2;
        return this;
    }

    public EmpleadoBuilder setDia(int dia) {
        this.dia = dia;
        return this;
    }

    public EmpleadoBuilder setMes(int mes) {
        this.mes = mes;
        return this;
    }

    public EmpleadoBuilder setAno(int ano) {
        this.ano = ano;
        return this;
    }

    public EmpleadoBuilder setAltura(double altura) {
        this.altura = altura;
        return this;
    }

    public EmpleadoBuilder setPie(double pie) {
        this.pie = pie;
        return this;
    }

    public EmpleadoBuilder setSueldo(double sueldo) {
        this.sueldo = sueldo;
        return this;
    }

    public EmpleadoBuilder setCargo(String cargo) {
        this.cargo = cargo;
        return this;
    }

    public EmpleadoBuilder setFormacion(String formacion) {
        this.formacion = formacion;
        return this;
    }
    
    public Empleado crearEmpleado(){
        return new EmpleadoBuilder2().setNombre(nombre).setApellido1(apellido1).setApellido2(apellido2).setDia(dia).setMes(mes).setAno(ano).setAltura(altura).setPie(pie).setSueldo(sueldo).setDni(dni).setCargo(cargo).setFormacion(formacion).createEmpleado();
    }
    
}
