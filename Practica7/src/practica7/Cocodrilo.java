/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica7;

/**
 *
 * @author Shiroi
 */
public class Cocodrilo extends Animal{
    public Cocodrilo(){
    }
    public Cocodrilo(String comida){
        System.out.println(comer(comida));
    }
    
    public String largo;
    
    @Override
    public String camiar(double distancia) {
        setDistancia(getDistancia() + distancia);
        return "El cocodrilo ha caminado " + distancia + "m mas, en total ha caminado " + getDistancia() + "m.";
    }
    
    private String comer(String comida){
        return "El cocodrilo esta comiendo " + comida;
    }
    
    public String lloro(){
        return "(Ruido)!";
    }
}