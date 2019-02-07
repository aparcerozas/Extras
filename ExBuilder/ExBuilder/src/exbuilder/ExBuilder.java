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
public class ExBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado e1 = new EmpleadoBuilder2().setNombre("Juan").setApellido1("Martínez").setApellido2("Piñeiro").setDia(6).setMes(9).setAno(1998).setAltura(1.76).setPie(1.5).setSueldo(1450).setDni("12345678A").setCargo("Oficinista").setFormacion("Experto").createEmpleado();
        Empleado e2 = new EmpleadoBuilder2().setNombre("Pedro").setApellido1("Sánchez").setApellido2("Tijuán").setDia(0).setMes(0).setAno(0).setAltura(0).setPie(0).setSueldo(0).setDni("87654321B").setCargo("").setFormacion("").createEmpleado();
        Empleado e3 = new EmpleadoBuilder("Adrián","Parcero","12563478C")
                .setApellido2("Zas")
                .crearEmpleado();
        System.out.println(e3.toString());
    }
    
}
