/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploexcepcions;

/**
 *
 * @author aparcerozas
 */
public class Operacion {
    public void suma(int num1, int num2){
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
    }
    
    public void resta(int num1, int num2){
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
    }
    
    public void cociente(int num1, int num2){
        System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
    }
    
    public void resto(int num1, int num2){
        if(num2 == 0){
            System.out.println("Non se pode dividir por 0");
        }
        else{
            System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
        }
    }
    
    public void dividirConCondicionais(int num1, int num2){
        if(num2 == 0){
            System.out.println("Non se pode dividir por 0");
        }
        else{
            System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
        }
    }
    
    public void dividirConExcepcions(int num1, int num2){
        try{
            System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
        }
        catch(ArithmeticException e){
            System.out.println("Non se pode dividir por 0");
        }
    }
    
    public void dividirLanzandoExcepcion(int num1, int num2)throws ArithmeticException{
        if(num2 == 0){
//            ArithmeticException obxecto = new ArithmeticException("Non se pode dividir entre 0");
//            throw obxecto;
            throw new ArithmeticException("Non se pode dividir entre 0");
        }
        else{
            System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
        }
    }
}
