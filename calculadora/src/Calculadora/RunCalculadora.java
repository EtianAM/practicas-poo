/*
 * Clase main
 */
package Calculadora;
import java.util.Scanner;

/**
 *
 * @author Etian Alvarado
 */

public class RunCalculadora {
    static Scanner scan = new Scanner(System.in); //Define scan como clase de Scanner
    
    public static void main(String[] args) {
        double a, b, c; //a y b seran valores de entrada, c sera remplazado por el calor de las operaciones cada vez
        Operaciones op = new Operaciones(); //Define op como clase de Operaciones
        OperacionesAvanzadas opAv = new OperacionesAvanzadas();  //Define opAv como clase de OperacionesAvanzadas
        System.out.println("Ingresa el valor 1: ");
        a = scan.nextDouble();
        System.out.println("Ingresa el valor 2: ");
        b = scan.nextDouble();
        System.out.println("class Operaciones");
        c = op.suma(a, b);
        System.out.println("Suma de " + a + " + " + b + " es igual a " + c);
        c = op.resta(a, b);
        System.out.println("Resta de " + a + " - " + b + " es igual a " + c);
        c = op.division(a, b);
        System.out.println("Division de " + a + " / " + b + " es igual a " + c);
        c = op.multi(a, b);
        System.out.println("Multiplicacion de " + a + " * " + b + " es igual a " + c);
        System.out.println("\nclass OperacionesAvanzadas");
        c = opAv.raizCuad(a);
        System.out.println("Raiz cuadrada de " + a + " es igual a " + c);
        c = opAv.potencia(a, b);
        System.out.println("Potencia de " + a + " ^ " + b + " es igual a " + c);
        c = opAv.sen(a);
        System.out.println("Seno de " + a + " es igual a " + c);
        c = opAv.cos(a);
        System.out.println("Coseno de " + a + " es igual a " + c);
        c = opAv.tan(a);
        System.out.println("Tangente de " + a + " es igual a " + c);
    }
}
