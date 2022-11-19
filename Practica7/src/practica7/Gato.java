/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica7;

/**
 *
 * @author Shiroi
 */
public class Gato extends Animal{

    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public Gato(){
    }
    public Gato(String comida){
        System.out.println(comer(comida));
    }
    
    private String raza;
    
    @Override
    public String camiar(double distancia) {
        setDistancia(getDistancia() + distancia);
        return "El gato ha caminado " + distancia + "m mas, en total ha caminado " + getDistancia() + "m.";
    }
    
    private String comer(String comida){
        return "El gato esta comiendo " + comida;
    }
    
    public String maullar(){
        return "Miau!";
    }
}
