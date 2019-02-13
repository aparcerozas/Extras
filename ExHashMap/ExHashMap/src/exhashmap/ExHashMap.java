/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exhashmap;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author aparcerozas
 */
public class ExHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<String,Alumno> Alumnos = new HashMap<>();
        Secretaria obx = new Secretaria();
        ArrayList<Alumno> lista = new ArrayList<>();
        int op;
        String dni;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Menú:\n1. Crear"
                    + "\n2. Amosar\n3. Amosar ArrayList\n4. Modificar nota"
                    + "\n5. Consultar alumno\n6. Saír"));
            switch(op){
                case 1: dni = JOptionPane.showInputDialog("dni");
                        obx.crear(Alumnos, dni);
                        break;
                case 2: obx.amosar(Alumnos);
                        break;
                case 3: obx.pasarArrayList(Alumnos, lista);
                        break;
                case 4: dni = JOptionPane.showInputDialog("dni");
                        int nota = Integer.parseInt(JOptionPane.showInputDialog("nota"));
                        obx.modificarNota(Alumnos, dni, nota);
                        break;
                case 5: dni = JOptionPane.showInputDialog("dni");
                        obx.consultar(Alumnos, dni);
                        break;
                case 6: System.exit(0);
            }
        }while(op!=6);
        
    }
    
}
