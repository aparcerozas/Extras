/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploexcepcions2;

/**
 *
 * @author aparcerozas
 */
public class Operacions {
    public void numerador(float num)throws ArithmeticException{
        if(num < 50 || num > 100){
            throw new ArithmeticException("Valor fuera del rango adecuado");
        }
    }
    
    public void denominador(float num)throws ArithmeticException{
        if(num == 0){
            throw new ArithmeticException("No se puede dividir por cero");
        }
    }
    
    public void division(float num1, float num2){
        this.numerador(num1);
        this.denominador(num2);
        System.out.println(num1/num2);
    }
}
