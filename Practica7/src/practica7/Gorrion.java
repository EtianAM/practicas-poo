/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica7;

/**
 *
 * @author Shiroi
 */
public class Gorrion extends Animal{
    public Gorrion(){
    }
    public Gorrion(String comida){
        System.out.println(comer(comida));
    }
    
    public String colores;
    
    @Override
    public String camiar(double distancia) {
        setDistancia(getDistancia() + distancia);
        return "El gorrion ha caminado " + distancia + "m mas, en total ha caminado " + getDistancia() + "m.";
    }
    
    private String comer(String comida){
        return "El gorrion esta comiendo " + comida;
    }
    
    public String chirriar(){
        return "Chrii!";
    }
}