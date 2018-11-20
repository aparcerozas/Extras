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
public class Raton {
    private boolean inalambrico;
    private String modelo;
    
    public Raton(){}
    
    public Raton(boolean inalambrico, String modelo){
        this.inalambrico = inalambrico;
        this.modelo = modelo;
    }

    public boolean isInalambrico() {
        return inalambrico;
    }

    public void setInalambrico(boolean inalambrico) {
        this.inalambrico = inalambrico;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public String toString(){
        if(inalambrico = true){
            return "Características ratón\nInalámbrico: Sí\nModelo: " + modelo + "\n";
        }
        else{
            return "Características ratón\nInalámbrico: No\nModelo: " + modelo + "\n";
        }
    }
}
