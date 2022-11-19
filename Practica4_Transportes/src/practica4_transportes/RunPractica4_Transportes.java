/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica4_transportes;

/**
 *
 * @author 211_13
 */
public class RunPractica4_Transportes {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double energia = 22;
        double energiaNada = 0;
        int gasolinaPoca = 4;
        
        Automovil auto = new Automovil(energia);
        auto.setColor("Azul");
        auto.setMarca("Audi");
        auto.setModelo("2023 e-tron GT");
        System.out.println(auto.info());
        System.out.println(auto.avanzar(energia));
        
        System.out.println("");
        
        Avion aero = new Avion(gasolinaPoca);
        aero.setColor("Blanco");
        aero.setMarca("Boeing");
        aero.setModelo("777X");
        System.out.println(aero.info());
        System.out.println(aero.avanzar(gasolinaPoca));
        
        System.out.println("");
        
        Tren ferro = new Tren(energiaNada);
        ferro.setColor("Beige");
        ferro.setMarca("Hitachi");
        ferro.setModelo("N700S-3000 series");
        System.out.println(ferro.info());
        System.out.println(ferro.avanzar(energiaNada));
    }
    
}
