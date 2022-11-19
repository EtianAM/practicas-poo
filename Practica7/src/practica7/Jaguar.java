/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica7;

/**
 *
 * @author Shiroi
 */
public class Jaguar extends Animal{
    public Jaguar(){
    }
    public Jaguar(String comida){
        System.out.println(comer(comida));
    }
    
    public String tipo;
    
    @Override
    public String camiar(double distancia) {
        setDistancia(getDistancia() + distancia);
        return "El jaguar ha caminado " + distancia + "m mas, en total ha caminado " + getDistancia() + "m.";
    }
    
    private String comer(String comida){
        return "El jaguar esta comiendo " + comida;
    }
    
    public String rugir(){
        return "(Rugido)!";
    }
}