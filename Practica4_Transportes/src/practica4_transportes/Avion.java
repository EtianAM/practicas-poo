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
public class Avion extends Vehiculo{
    private String modo;
    
    public Avion(){
        
    }
    
    public Avion(int gas){
        System.out.println(encenderAvion(gas));
        modo = "Combustion";
    }
    
    public Avion(double kw){
        System.out.println(encenderAvion(kw));
        modo = "Electrico";
        
    }
    
    private String encenderAvion(int gas){
        if(gas > 1){
            return "Avion encendido";
        } else {
            return "Avion sin gasolina";
        }
    }
    
    public String avanzar(int gas){
        if(gas >= 10){
            return "Avanzando";
        } else if(gas > 0) {
            return "POCO COMBUSTIBLE\nAvanzando";
        } else {
            return "Avion sin gasolina";
        }
    }
    
    private String encenderAvion(double kw){
        if(kw > 1){
            return "Avion encendido";
        } else {
            return "Avion sin energia";
        }
    }
    
    public String avanzar(double kw){
        if(kw >= 10){
            return "Avanzando";
        } else if(kw > 0) {
            return "POCA ENERGIA\nAvanzando";
        } else {
            return "Avion sin energia";
        }
    }
    
    public String info(){
        return "Avion " + getMarca() + " " + getModelo() + " " + getColor() + " " + modo;
    }
}
