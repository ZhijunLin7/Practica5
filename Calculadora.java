/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author engin
 */
public class Calculadora implements ICalculadora {
    
    @Override
    public float suma (float num1,float num2){ 
    float resultado;
    resultado = num1 + num2;
    return resultado;
    
    }
    
    @Override
    public float resta (float num1,float num2){ 
    float resultado;
    resultado = num1 - num2;
    return resultado;
    }
   
    
    @Override
    public float multiplicar (float num1,float num2){ 
    float resultado;
    resultado = num1 * num2;
    return resultado;
    }
    @Override
    public float dividir (float num1,float num2){ 
    float resultado;
    resultado = num1 / num2;
    return resultado;
       }
}

//@Override




