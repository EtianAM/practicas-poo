/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3dispositivos;

/**
 *
 * @author Etian Alvarado
 */

public class Calculadora extends DispositivosElectronicos implements IOperacionesBasicas{
    private String modelo;
    
    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public String encender() {
        return "Calculadora encendida";
    }
    
    public double raizCuad(double a) {
        return Math.sqrt(a);
    }

    public double potencia(double a, double b) {
        return Math.pow(a, b);
    }

    public double sen(double a) {
        return Math.sin(a);
    }

    public double cos(double a) {
        return Math.cos(a);
    }

    public double tan(double a) {
        return Math.tan(a);
    }
    
    @Override
    public double suma(double a, double b){
        return a + b;
    }
    
    @Override
    public double resta(double a, double b){
        return a - b;
    }
    
    @Override
    public double division(double a, double b){
        return a / b;
    }
    
    @Override
    public double multi(double a, double b){
        return a * b;
    }
}
