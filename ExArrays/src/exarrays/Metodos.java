/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exarrays;

import javax.swing.JOptionPane;
import java.util.Arrays;

/**
 *
 * @author aparcerozas
 */
public class Metodos {
    int[] notas = new int[8];
    int[] repe = new int[8];
    
    public int darValor(){
        return Integer.parseInt(JOptionPane.showInputDialog("valor"));
    }
    
    public void crearArray(){
        for(int i=0;i<notas.length;i++){
            notas[i]=darValor();
        }
    }
    
    public void amosar(){
        for(int i=0;i<notas.length;i++){
            System.out.println(notas[i]);
        }
    }
    
    public void amosarRepe(){
        for(int i=0;i<repe.length;i++){
            System.out.println(repe[i]);
        }
    }
    
    public void amosarForEach(){
        System.out.println("método for each");
        for(int ele : notas){
            System.out.println(ele);
        }
    }
    
    public void encontrar(int elemento){
        int comprobar = 0;
        for(int i=0;i<notas.length;i++){
            if(notas[i] == elemento){
                System.out.println("Se encuentra en la posición " + i);
                comprobar = 1;
            }
        }
        if(comprobar == 0){
            System.out.println("No se encontró el elemento");
        }
        
    }
    
    public void buscarElementoRepetido(int elemento){
        int posicion = 0;
        for(int i=0;i<notas.length;i++){
            if(notas[i] == elemento){
                repe[posicion] = i+1;
                posicion++;
            }
        }
        switch (posicion) {
            case 0:
                System.out.println("No se encontró el elemento");
                break;
            case 1:
                System.out.println("El elemento no se repite");
                break;
            default:
                for(int i=0;i<posicion;i++){
                    System.out.println(elemento + " se encuentra en la posición " + repe[i]);
                }   break;
        }
    }
    
    public void ordenarDirecto(){
        int aux = 0;
        for(int i=0;i<notas.length-1;i++){
            for(int j=i+1;j<notas.length;j++){
                if(notas[i]>notas[j]){
                    aux=notas[i];
                    notas[i]=notas[j];
                    notas[j]=aux;
                }
            }
        }
    }
    
    public void ordenarSort(){
        Arrays.sort(notas);
    }
    
    public void eliminarElemento(int numero){
        int aux = 0;
        for(int i=0;i<notas.length-1;i++){
            if(notas[i]==numero){
                for(int j=i;j<notas.length-1;j++){
                    aux=notas[j];
                    notas[j]=notas[j+1];
                    notas[j+1]=aux;
                }
            }
        }
    }
    
}
