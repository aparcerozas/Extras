/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herdanza;

import java.text.ParseException;

/**
 *
 * @author aparcerozas
 */
public class Secretaria extends Empregado{
    private String telefonoMovil;
    
    public Secretaria(){
        super();
    }
    
    public Secretaria(String nome, String inicioTraballo, String dataNacemento, String titulacion, String telefonoMovil) throws ParseException{
        super(nome, inicioTraballo, dataNacemento, titulacion);
        this.telefonoMovil = telefonoMovil;
    }

    public String getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setTelefonoMovil(String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    @Override
    public String toString() {
        return super.toString() +", Secretaria{" + "telefonoMovil=" + telefonoMovil + '}';
    }
    
}
