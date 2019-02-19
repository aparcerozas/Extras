/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exarraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import utilidades.PedirDatos;

/**
 *
 * @author aparcerozas
 */
public class ExArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> lista = new ArrayList<>();
        metodos obx = new metodos();
        int opcion;
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Menú\n1. Introducir elemento\n2. Amosar elementos\n"
                    + "3. Borrar posición\n4. Borrar elemento\n5. Actualizar elemento\n6. Saír"));
            switch(opcion){
                case 1: obx.engadir(lista);
                break;
                case 2:
                    int opcion2 = Integer.parseInt(JOptionPane.showInputDialog("Menú\n1. Amosar\n2. Amosar For Each\n3. Amosar Iterator"));
                    switch(opcion2){
                        case 1: obx.amosar(lista);
                        break;
                        case 2: obx.amosarForEach(lista);
                        break;
                        case 3: obx.amosarIterator(lista);
                        break;
                    }
                    break;
                case 3:
                    int posicion = PedirDatos.enteiro("Introduzca posición:");
                    obx.borrarPosicion(posicion, lista);
                    break;
                case 4:
                    int elemento = PedirDatos.enteiro("Introduzca elemento:");
                    obx.borrarElemento(elemento, lista);
                    break;
                case 5:
                    int posicion2 = PedirDatos.enteiro("Introduzca elemento:");
                    int novo = PedirDatos.enteiro("Introduzca novo valor:");
                    obx.actualizarValor(posicion2, novo, lista);
                    break;
                case 6: System.exit(0);
                default: System.out.println("Opción inválida");
            }
        }while(opcion!=6);
        
    }
    
}
