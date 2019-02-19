/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exarraylistobjects;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import utilidades.PedirDatos;

/**
 *
 * @author aparcerozas
 */
public class ExArrayListObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        metodos obx = new metodos();
        ArrayList<Alumno> lisAlumnos = new ArrayList<>();
        String op="";
        do{
            op = PedirDatos.palabras("Menú\n- Engadir\n- Ver\n- Borrar\n- Ordenar\n- Buscar\n- Nota\n- Saír");
            switch(op){
                case "engadir": obx.engadir(lisAlumnos);
                    break;
                case "ver":
                    String op2 = PedirDatos.palabras("1. Ver For Each\n2. Ver Iterator");
                    switch(op2){
                        case "foreach": obx.verForEach(lisAlumnos);
                        break;
                        case "iterator": obx.verIterator(lisAlumnos);
                        break;
                        default: System.out.println("Opción inválida");
                        break;
                    }
                    break;
                case "borrar":
                    String op3 = PedirDatos.palabras("1. Borrar posición\n2. Borrar DNI");
                    switch(op3){
                        case "posicion":
                            int posicion = PedirDatos.enteiro("Introduzca posición:");
                            obx.borrarPosicion(posicion, lisAlumnos);
                        break;
                        case "dni":
                            String dni = PedirDatos.palabras("Introduzca DNI:");
                            obx.borrarDNI(dni, lisAlumnos);
                        break;
                        default: System.out.println("Opción inválida");
                        break;
                    }
                    break;
                case "ordenar": obx.ordenar(lisAlumnos);
                    break;
                case "buscar":
                    String dni = JOptionPane.showInputDialog("Introduzca DNI:");
                    obx.buscar(dni, lisAlumnos);
                    break;
                case "nota":
                    String dni2 = JOptionPane.showInputDialog("Introduzca DNI:");
                    obx.modificarNota(dni2, lisAlumnos);
                    break;
                case "sair": System.exit(0);
                
        }
        }while(!"sair".equals(op));
    }
    
}
