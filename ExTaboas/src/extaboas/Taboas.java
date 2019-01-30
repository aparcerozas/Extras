/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extaboas;

import javax.swing.JOptionPane;

/**
 *
 * @author aparcerozas
 */
public class Taboas {
    int[][] notas = {{7,4,8},{6,7,9},{3,5,8},{6,4,9}};
    String[] nomes = {"aa","bb","cc","dd"};
    int[] medias = new int[notas.length];
    int[] modulos = new int[notas[0].length];
    
    public int darValor(){
        return Integer.parseInt(JOptionPane.showInputDialog("valor"));
    }
    
    public void crearTaboa(int[][] lista){
        for(int f=0;f<lista.length;f++){
            for(int c=0;c<lista[f].length;c++){
                lista[f][c]=darValor();
            }
        }
    }
    
    public void amosar(int[] lista){
        for(int i=0;i<lista.length;i++){
            System.out.print(lista[i] + "   ");
        }
        System.out.println("");
    }
    
    public void amosar(String[] lista){
        for(int i=0;i<lista.length;i++){
            System.out.print(lista[i] + "   ");
        }
        System.out.println("");
    }
    
    public void amosarTaboa(int[][] lista){
        for(int f=0;f<lista.length;f++){
            for(int c=0;c<lista[f].length;c++){
                System.out.print(lista[f][c] + "   ");
            }
            System.out.println("");
        }
    }
    
    public void notaMedia(){
        int total = 0;
        int media = 0;
        for(int f=0;f<notas.length;f++){
            total = 0;
            for(int c=0;c<notas[f].length;c++){
                total=total+notas[f][c];
            }
            media = total/notas[f].length;
            medias[f]=media;
        }
    }
    
    public void moduloMedia(){
        int total = 0;
        int media = 0;
        for(int c=0;c<notas[0].length;c++){
            total = 0;
            for(int f=0;f<notas.length;f++){
                total=total+notas[f][c];
            }
            media = total/notas.length;
            modulos[c]=media;
        }
        amosar(modulos);
    }
    
    public void ordenarMedias(){
        notaMedia();
        int aux=0;
        int[] aux2 = {0,0,0};
        String aux3 = "";
        amosarTaboa(notas);
        amosar(nomes);
        amosar(medias);
        System.out.println("");
        for(int i=0;i<medias.length-1;i++){
            for(int j=i+1;j<medias.length;j++){
                if(medias[i]>medias[j]){
                    aux=medias[j];
                    medias[j]=medias[i];
                    medias[i]=aux;
                    aux2 = notas[j];
                    notas[j]=notas[i];
                    notas[i]=aux2;
                    aux3 = nomes[j];
                    nomes[j]=nomes[i];
                    nomes[i]=aux3;
//                    for(k=0;k<notas.length;k++){
//                        aux2=notas[i][k];
//                        notas[i][k]=notas[j][k];
//                        notas[j][k]=aux2;
//                    }
                }
            }
        }
        amosarTaboa(notas);
        amosar(nomes);
        amosar(medias);
    }
    
    
}
