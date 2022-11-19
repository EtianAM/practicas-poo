/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica7;

import java.util.ArrayList;
/**
 *
 * @author Shiroi
 */
public class RunPractica7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x;
        ArrayList<Animal> list = new ArrayList<Animal>();
        list.add(new Gato("Whiskas"));
        list.add(new Perro("croquetas"));
        list.add(new Gorrion("semillas"));
        list.add(new Cocodrilo("pescado"));
        list.add(new Jaguar("carne"));
        x = 1;
        for (Animal o : list ){
            System.out.println(o.camiar(x));
            x++;
        }
        for (Animal o : list ){
            System.out.println(o.camiar(x));
            x++;
        }
        x = 0;
        for (Animal o : list ){
           x += o.getDistancia();
        }
        System.out.println("Todos los animales en total caminaron: " + x + "m.");
        System.out.println("Todos los animales en promedio caminaron: " + x/5 + "m.");
    }
    
}
