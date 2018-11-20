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
public class Ordenador {
    //Atributos clases
    CPU procesador;
    Raton mouse;
    Teclado keyboard;
    Monitor screen;
    //Constructores
    public Ordenador(){
        procesador = new CPU();
        mouse = new Raton();
        keyboard = new Teclado();
        screen = new Monitor();
    }
    //Setters de las clases
    public void setCPU(int nucleos, int ram){
        procesador.setNucleos(nucleos);
        procesador.setRAM(ram);
    }
    public void setRaton(boolean inalambrico, String modelo){
        mouse.setInalambrico(inalambrico);
        mouse.setModelo(modelo);
    }
    public void setTeclado(int numTeclas){
        keyboard.setTeclas(numTeclas);
    }
    public void setMonitor(String marca, float pulgadas){
        screen.setMarca(marca);
        screen.setPulgadas(pulgadas);
    }
    //Visualización de los atributos de todas las clases
    public String visualizarAtributos(){
        return procesador.visualizar() + "\n" + mouse.visualizar() 
        + "\n" + keyboard.visualizar() + "\n" + screen.visualizar(); 
    }
    //Cálculo del precio según ciertas características
    public double calcularPrecio(){
        double precio = procesador.getRAM()*5 + keyboard.getTeclas()*0.7 + screen.getPulgadas()*12;
        if(mouse.getInalambrico() == true){
            return Math.round(precio * 1.5);
        }
        else{
            return Math.round(precio);
        }
    }
}
