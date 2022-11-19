/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3dispositivos;

/**
 *
 * @author Etian Alvarado
 */

public class Telefono extends DispositivosElectronicos implements IOperacionesBasicas{
    public String modelo;
    
    @Override
    public String encender() {
        return "Telefono encendido";
    }
    
    public String hacerLlamada (int numero){
        return "Llamando " + Integer.toString(numero);
    }
    
    public String hacerLlamada (String contacto){
        return "Llamando " + contacto;
    }
    
    public String terminarLlamada (){
        return "Llamanda terminada";
    }
    
    public String buscarContacto(String contacto){
        return "Buscando " + contacto + "";
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
