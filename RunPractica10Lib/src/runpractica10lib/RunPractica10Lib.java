/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runpractica10lib;
import java.util.Scanner;

/**
 *
 * @author Etian Alvarado
 */

public class RunPractica10Lib {
    static Scanner scan = new Scanner(System.in); //Define scan como clase de Scanner

    public static void main(String[] args) {
        double a, b, c; //a y b seran valores de entrada, c sera remplazado por el calor de las operaciones cada vez
        CalculadorEstandar calc = new CalculadorEstandar();
        System.out.println("Ingresa el valor 'a': ");
        a = scan.nextDouble();
        System.out.println("Ingresa el valor 'b': ");
        b = scan.nextDouble();
        
        c = calc.suma(a, b);
        System.out.println("Suma de " + a + " + " + b + " es igual a " + c);
        c = calc.resta(a, b);
        System.out.println("Resta de " + a + " - " + b + " es igual a " + c);
        c = calc.multiplicacion(a, b);
        System.out.println("Multiplicacion de " + a + " * " + b + " es igual a " + c);
        c = calc.division(a, b);
        System.out.println("Division de " + a + " / " + b + " es igual a " + c);
    }
    
}
