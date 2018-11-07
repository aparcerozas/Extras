/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notasmedias;

import javax.swing.JOptionPane;

/**
 *
 * @author aparcerozas
 */
public class Nota {
    //Atributos
    private double teorica;
    private double practica;
    private int boletines;
    private double notaMedia;
    //Validación y asignación de las notas teóricas
    public void validarNotaTeorica(){
        double teorica1, teorica2;
        do{
        teorica1 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la primera nota teórica:"));
        }while(teorica1<0 || teorica1>10);
        do{
        teorica2 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la segunda nota teórica:"));
        }while(teorica2<0 || teorica2>10);
        teorica = (teorica1 + teorica2)/2;
    }
    //Validación y asignación de la nota práctica
    public void validarNotaPractica(){
        do{
        practica = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la nota práctica:"));
        }while(practica<0 || practica>10);
    }
    //Petición de total de boletines y boletines entregados, y cálculo del porcentaje de boletines y su nota
    public void porcentajeBoletines(){
        int bolTotal = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número total de boletines:"));
        int bolEntr = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número de boletines entregados:"));
        double porcentaje = bolEntr * 100 / bolTotal;
        if(porcentaje < 70){
            boletines = 0;
        }
        else if(porcentaje < 90 && porcentaje > 70){
            boletines = 1;
        }
        else{
            boletines = 2;
        }
    }
    //Cálculo de la nota media de múltiples alumnos en bucle
    //El bucle terminará cuando algún alumno tenga menos de 5 de nota media
    public void NotaMedia(){
        do{
            String alumno = JOptionPane.showInputDialog("Introduzca el nombre del alumno:");
            validarNotaTeorica();
            validarNotaPractica();
            porcentajeBoletines();
            notaMedia = Math.round((0.4 * teorica) + (0.4 * practica) + boletines);
            JOptionPane.showMessageDialog(null, "Nombre alumno:" + alumno + "\nNota media: " + notaMedia);
        }while(notaMedia > 5.0);   
    }
}
