/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exbuilder;


public class EmpleadoBuilder2 {

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

    public EmpleadoBuilder2() {
    }

    public EmpleadoBuilder2 setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public EmpleadoBuilder2 setApellido1(String apellido1) {
        this.apellido1 = apellido1;
        return this;
    }

    public EmpleadoBuilder2 setApellido2(String apellido2) {
        this.apellido2 = apellido2;
        return this;
    }

    public EmpleadoBuilder2 setDia(int dia) {
        this.dia = dia;
        return this;
    }

    public EmpleadoBuilder2 setMes(int mes) {
        this.mes = mes;
        return this;
    }

    public EmpleadoBuilder2 setAno(int ano) {
        this.ano = ano;
        return this;
    }

    public EmpleadoBuilder2 setAltura(double altura) {
        this.altura = altura;
        return this;
    }

    public EmpleadoBuilder2 setPie(double pie) {
        this.pie = pie;
        return this;
    }

    public EmpleadoBuilder2 setSueldo(double sueldo) {
        this.sueldo = sueldo;
        return this;
    }

    public EmpleadoBuilder2 setDni(String dni) {
        this.dni = dni;
        return this;
    }

    public EmpleadoBuilder2 setCargo(String cargo) {
        this.cargo = cargo;
        return this;
    }

    public EmpleadoBuilder2 setFormacion(String formacion) {
        this.formacion = formacion;
        return this;
    }

    public Empleado createEmpleado() {
        return new Empleado(nombre, apellido1, apellido2, dia, mes, ano, altura, pie, sueldo, dni, cargo, formacion);
    }
    
}
