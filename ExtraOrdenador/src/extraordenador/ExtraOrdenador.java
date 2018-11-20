/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraordenador;

import javax.swing.JOptionPane;

/**
 *
 * @author aparcerozas
 */
public class ExtraOrdenador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ordenador perita = new Ordenador();
        perita.setCPU(4, 8);
        perita.setRaton(true, "Logitech");
        perita.setTeclado(58);
        perita.setMonitor("Samsung", 15.5f);
        JOptionPane.showMessageDialog(null, perita.visualizarAtributos());
        JOptionPane.showMessageDialog(null, perita.calcularPrecio());
    }
    
}
