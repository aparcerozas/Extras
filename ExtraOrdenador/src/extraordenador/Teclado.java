/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraordenador;

/**
 *
 * @author aparcerozas
 */
public class Teclado {
    private int numTeclas;
    
    public Teclado(){}
    public Teclado(int numTeclas){
        this.numTeclas = numTeclas;
    }
    
    public int getTeclas(){
        return numTeclas;
    }
    public void setTeclas(int numTeclas){
        this.numTeclas = numTeclas;
    }
    
    public String visualizar(){
        return "Características teclado\nTeclas: " + numTeclas + "\n";
    }
}
