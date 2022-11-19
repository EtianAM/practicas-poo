/*
 * Clase de operaciones avanzadas, contiene:
 * Raiz cudrada, potencia (exponente) y las tres operaciones trigonometricas principales
 */
package Calculadora;

/**
 *
 * @author Etian Alvarado
 */

public class OperacionesAvanzadas {
    public double raizCuad(double a){
        return Math.sqrt(a);
    }
    
    public double potencia(double a, double b){
        return Math.pow(a, b);
    }
    
    public double sen(double a){
        return Math.sin(a);
    }
    
    public double cos(double a){
        return Math.cos(a);
    }
    
    public double tan(double a){
        return Math.tan(a);
    }
}
