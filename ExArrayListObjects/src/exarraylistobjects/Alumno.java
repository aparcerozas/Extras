/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exarraylistobjects;

import java.util.Objects;

/**
 *
 * @author aparcerozas
 */
public class Alumno implements Comparable {
    private String nome;
    private String dni;
    private int nota;

    public Alumno(String nome, String dni, int nota) {
        this.nome = nome;
        this.dni = dni;
        this.nota = nota;
    }

    public Alumno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", dni=" + dni + ", nota=" + nota;
    }

    @Override
    public int compareTo(Object o) {
        Alumno a = (Alumno)o;
        if(this.nome.compareToIgnoreCase(a.nome)>0){
            return 1;
        }
        else if(this.nome.compareToIgnoreCase(a.nome)<0){
            return -1;
        }
        else{
            return 0;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    } 
    
}
