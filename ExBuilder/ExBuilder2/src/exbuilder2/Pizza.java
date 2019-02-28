/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exbuilder2;

/**
 *
 * @author aparcerozas
 */
public class Pizza {
    private int grHarina;
    private int mlAgua;
    private int grSal;
    private int mlAceite;
    private String tipoAceite;
    private int grTomate;
    private int grQueso;
    private String tipoQueso;
    private int grPinha;

    public Pizza(final int grHarina, final int mlAgua, final int grSal, 
            final int mlAceite, final String tipoAceite, final int grTomate, 
            final int grQueso, final String tipoQueso, final int grPinha) {
        this.grHarina = grHarina;
        this.mlAgua = mlAgua;
        this.grSal = grSal;
        this.mlAceite = mlAceite;
        this.tipoAceite = tipoAceite;
        this.grTomate = grTomate;
        this.grQueso = grQueso;
        this.tipoQueso = tipoQueso;
        this.grPinha = grPinha;
    }

    @Override
    public String toString() {
        return "grHarina=" + grHarina + ", mlAgua=" + mlAgua + 
                ", grSal=" + grSal + ", mlAceite=" + mlAceite + 
                ", tipoAceite=" + tipoAceite + ", grTomate=" + grTomate + 
                ", grQueso=" + grQueso + ", tipoQueso=" + tipoQueso + 
                ", grPinha=" + grPinha;
    }
    
    
    
}
