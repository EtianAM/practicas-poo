/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica3dispositivos;
import java.util.Scanner;

/**
 *
 * @author Etian Alvarado
 */

public class RunPractica3Dispositivos {
    static Scanner scan = new Scanner(System.in); //Define scan como clase de Scanner

    public static void main(String[] args) {
        double a, b, c; //a y b seran valores de entrada, c sera remplazado por el calor de las operaciones cada vez
        Calculadora calc = new Calculadora();
        Telefono tel = new Telefono();
        System.out.println("Ingresa el valor 'a': ");
        a = scan.nextDouble();
        System.out.println("Ingresa el valor 'b': ");
        b = scan.nextDouble();
        
        tel.setColor("Negro");
        tel.setMarca("SAMSUNG");
        tel.modelo = "A73";
        System.out.println("\nTelefono " + tel.getMarca() + " " + tel.modelo + " " + tel.getColor());
        System.out.println(tel.encender());
        System.out.println(tel.buscarContacto("Juan Perez"));
        System.out.println(tel.hacerLlamada(812021673)); //Telefono de 9 digitos porque un int no soporta mas
        System.out.println(tel.hacerLlamada("Juan Perez"));
        System.out.println(tel.terminarLlamada());
        c = tel.suma(a, b);
        System.out.println("Suma de " + a + " + " + b + " es igual a " + c);
        c = tel.resta(a, b);
        System.out.println("Resta de " + a + " - " + b + " es igual a " + c);
        c = tel.division(a, b);
        System.out.println("Division de " + a + " / " + b + " es igual a " + c);
        c = tel.multi(a, b);
        System.out.println("Multiplicacion de " + a + " * " + b + " es igual a " + c);
        
        calc.setModelo("fx-82MS");
        calc.setMarca("CASIO");
        calc.setColor("Azul");
        System.out.println("\nCalculadora " + calc.getMarca() + " " + calc.getModelo() + " " + calc.getColor());
        System.out.println(calc.encender());
        c = calc.suma(a, b);
        System.out.println("Suma de " + a + " + " + b + " es igual a " + c);
        c = calc.resta(a, b);
        System.out.println("Resta de " + a + " - " + b + " es igual a " + c);
        c = calc.division(a, b);
        System.out.println("Division de " + a + " / " + b + " es igual a " + c);
        c = calc.multi(a, b);
        System.out.println("Multiplicacion de " + a + " * " + b + " es igual a " + c);
        c = calc.raizCuad(a);
        System.out.println("Raiz cuadrada de " + a + " es igual a " + c);
        c = calc.potencia(a, b);
        System.out.println("Potencia de " + a + " ^ " + b + " es igual a " + c);
        c = calc.sen(a);
        System.out.println("Seno de " + a + " es igual a " + c);
        c = calc.cos(a);
        System.out.println("Coseno de " + a + " es igual a " + c);
        c = calc.tan(a);
        System.out.println("Tangente de " + a + " es igual a " + c);
    }
    
}
