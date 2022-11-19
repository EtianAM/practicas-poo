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
public class Tren extends Vehiculo{
    private String modo;
    
    public Tren(){
        
    }
    
    public Tren(int gas){
        System.out.println(encenderTren(gas));
        modo = "Combustion";
    }
    
    public Tren(double kw){
        System.out.println(encenderTren(kw));
        modo = "Electrico";
        
    }
    
    private String encenderTren(int gas){
        if(gas > 1){
            return "Tren encendido";
        } else {
            return "Tren sin gasolina";
        }
    }
    
    public String avanzar(int gas){
        if(gas >= 10){
            return "Avanzando";
        } else if(gas > 0) {
            return "POCO COMBUSTIBLE\nAvanzando";
        } else {
            return "Tren sin gasolina";
        }
    }
    
    private String encenderTren(double kw){
        if(kw > 1){
            return "Tren encendido";
        } else {
            return "Tren sin energia";
        }
    }
    
    public String avanzar(double kw){
        if(kw >= 10){
            return "Avanzando";
        } else if(kw > 0) {
            return "POCA ENERGIA\nAvanzando";
        } else {
            return "Tren sin energia";
        }
    }
    
    public String info(){
        return "Tren " + getMarca() + " " + getModelo() + " " + getColor() + " " + modo;
    }
}
