/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

/**
 *
 * @author Etian Alvarado
 */

public class CalculadoraCientifica extends OperacionesBasicas implements IOperacionesAvanzadas{
      
    @Override
    public double raizCuad(double a) {
        return Math.sqrt(a);
    }

    @Override
    public double potencia(double a, double b) {
        return Math.pow(a, b);
    }

    @Override
    public double sen(double a) {
        return Math.sin(a);
    }

    @Override
    public double cos(double a) {
        return Math.cos(a);
    }

    @Override
    public double tan(double a) {
        return Math.tan(a);
    }
    
    public void start(){ //Imprime un saludo o inicio
        System.out.println("CASIO CIENTIFICA");
    }
}
