/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herdanza;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author aparcerozas
 */
public class Empregado {
    private String nome;
    private Date inicioTraballo;
    private Date dataNacemento;
    private String titulacion;
    
    public Empregado(){}

    public Empregado(String nome, String inicioTraballo, String dataNacemento, String titulacion) throws ParseException {
        this.nome = nome;
        SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
        this.inicioTraballo = dateformat.parse(inicioTraballo);
        this.dataNacemento = dateformat.parse(dataNacemento);
        this.titulacion = titulacion;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getInicioTraballo() {
        return inicioTraballo;
    }

    public void setInicioTraballo(String inicioTraballo) throws ParseException {
        SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
        this.inicioTraballo = dateformat.parse(inicioTraballo);
    }

    public Date getDataNacemento() {
        return dataNacemento;
    }

    public void setDataNacemento(String dataNacemento) throws ParseException {
        SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
        this.dataNacemento = dateformat.parse(dataNacemento);
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }
    
    public float calcularSoldo(String nome){
        float soldo = 1004.5f;
        return soldo;
    }

    @Override
    public String toString() {
        return "Empregado{" + "nome=" + nome + ", inicioTraballo=" + inicioTraballo + ", dataNacemento=" + dataNacemento + ", titulacion=" + titulacion + '}';
    }
    
}
