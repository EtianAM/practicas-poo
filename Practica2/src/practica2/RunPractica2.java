/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2;
import java.util.Scanner;

/**
 *
 * @author Etian Alvarado
 */

public class RunPractica2 {
    static Scanner scan = new Scanner(System.in); //Define scan como clase de Scanner

    public static void main(String[] args) {
        double a, b, c; //a y b seran valores de entrada, c sera remplazado por el calor de las operaciones cada vez
        CalculadoraBasica casio = new CalculadoraBasica();
        CalculadoraCientifica casioCient = new CalculadoraCientifica();
        System.out.println("Ingresa el valor 'a': ");
        a = scan.nextDouble();
        System.out.println("Ingresa el valor 'b': ");
        b = scan.nextDouble();
        
        System.out.println("\nclass CalculadoraBasica");
        casio.start();
        c = casio.suma(a, b);
        System.out.println("Suma de " + a + " + " + b + " es igual a " + c);
        c = casio.resta(a, b);
        System.out.println("Resta de " + a + " - " + b + " es igual a " + c);
        c = casio.division(a, b);
        System.out.println("Division de " + a + " / " + b + " es igual a " + c);
        c = casio.multi(a, b);
        System.out.println("Multiplicacion de " + a + " * " + b + " es igual a " + c);
        
        System.out.println("\nclass CalculadoraCientifica");
        casioCient.start();
        c = casioCient.suma(a, b);
        System.out.println("Suma de " + a + " + " + b + " es igual a " + c);
        c = casioCient.resta(a, b);
        System.out.println("Resta de " + a + " - " + b + " es igual a " + c);
        c = casioCient.division(a, b);
        System.out.println("Division de " + a + " / " + b + " es igual a " + c);
        c = casioCient.multi(a, b);
        System.out.println("Multiplicacion de " + a + " * " + b + " es igual a " + c);
        c = casioCient.raizCuad(a);
        System.out.println("Raiz cuadrada de " + a + " es igual a " + c);
        c = casioCient.potencia(a, b);
        System.out.println("Potencia de " + a + " ^ " + b + " es igual a " + c);
        c = casioCient.sen(a);
        System.out.println("Seno de " + a + " es igual a " + c);
        c = casioCient.cos(a);
        System.out.println("Coseno de " + a + " es igual a " + c);
        c = casioCient.tan(a);
        System.out.println("Tangente de " + a + " es igual a " + c);
    }
    
}
