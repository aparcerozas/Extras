/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exbuilder2;


public class PizzaBuilder {

    private int grHarina;
    private int mlAgua;
    private int grSal = 0;
    private int mlAceite = 0;
    private String tipoAceite = "";
    private int grTomate = 0;
    private int grQueso = 0;
    private String tipoQueso = "";
    private int grPinha = 0;

    public PizzaBuilder(final int grHarina, final int mlAgua) {
        this.grHarina = grHarina;
        this.mlAgua = mlAgua;
    }

    public PizzaBuilder setGrSal(int grSal) {
        this.grSal = grSal;
        return this;
    }

    public PizzaBuilder setMlAceite(int mlAceite) {
        this.mlAceite = mlAceite;
        return this;
    }

    public PizzaBuilder setTipoAceite(String tipoAceite) {
        this.tipoAceite = tipoAceite;
        return this;
    }

    public PizzaBuilder setGrTomate(int grTomate) {
        this.grTomate = grTomate;
        return this;
    }

    public PizzaBuilder setGrQueso(int grQueso) {
        this.grQueso = grQueso;
        return this;
    }

    public PizzaBuilder setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
        return this;
    }

    public PizzaBuilder setGrPinha(int grPinha) {
        this.grPinha = grPinha;
        return this;
    }

    public Pizza createPizza() {
        return new Pizza(grHarina, mlAgua, grSal, mlAceite, tipoAceite, grTomate, grQueso, tipoQueso, grPinha);
    }
    
}
