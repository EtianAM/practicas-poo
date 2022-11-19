/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4_transportes;

import vehiculos.Vehiculo;

/**
 *
 * @author 211_13
 */
public class Automovil extends Vehiculo{
    private String modo;
    
    public Automovil(){
        
    }
    
    public Automovil(int gas){
        System.out.println(encenderAutomovil(gas));
        modo = "Combustion";
    }
    
    public Automovil(double kw){
        System.out.println(encenderAutomovil(kw));
        modo = "Electrico";
        
    }
    
    private String encenderAutomovil(int gas){
        if(gas > 1){
            return "Automovil encendido";
        } else {
            return "Automovil sin gasolina";
        }
    }
    
    public String avanzar(int gas){
        if(gas >= 10){
            return "Avanzando";
        } else if(gas > 0) {
            return "POCO COMBUSTIBLE\nAvanzando";
        } else {
            return "Automovil sin gasolina";
        }
    }
    
    private String encenderAutomovil(double kw){
        if(kw > 1){
            return "Automovil encendido";
        } else {
            return "Automovil sin energia";
        }
    }
    
    public String avanzar(double kw){
        if(kw >= 10){
            return "Avanzando";
        } else if(kw > 0) {
            return "POCA ENERGIA\nAvanzando";
        } else {
            return "Automovil sin energia";
        }
    }
    
    public String info(){
        return "Automovil " + getMarca() + " " + getModelo() + " " + getColor() + " " + modo;
    }
}
