/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica7;

/**
 *
 * @author Shiroi
 */
public class Perro extends Animal{
    public Perro(){
    }
    public Perro(String comida){
        System.out.println(comer(comida));
    }
    
    public String color;
    
    @Override
    public String camiar(double distancia) {
        setDistancia(getDistancia() + distancia);
        return "El perro ha caminado " + distancia + "m mas, en total ha caminado " + getDistancia() + "m.";
    }
    
    private String comer(String comida){
        return "El perro esta comiendo " + comida;
    }
    
    public String ladrar(){
        return "Guau!";
    }
}