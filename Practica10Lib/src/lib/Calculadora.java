/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lib;

/**
 *
 * @author Etian Alvarado
 */

public abstract class Calculadora {
    public abstract double suma(double a, double b);
    
    public double resta(double a, double b){
        return a - b;
    }
    
    public double multiplicacion(double a, double b){
        return a * b;
    }
    
    public double division(double a, double b){
        return a / b;
    }
}
