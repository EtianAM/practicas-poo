/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica8;

import java.util.Scanner;
import java.io.File;

/**
 *
 * @author Etian
 */
public class RunPractica8 {
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        Utils fileMet = new Utils();
        System.out.println("Ingresa la ruta del archivo:");
        String fileDir = scan.nextLine();
        File fl = new File(fileDir);
        if (fl.exists() == false){ //Comprobacion de que el archivo existe
            System.out.println("Error: El archivo '" + fileDir + "' no existe.");
            return; //Si no existe sale del programa
        }
        System.out.println("Ingresa el texto a escribir (Considera que se borrara el contenido anterior del archivo):");
        String txt = scan.nextLine();
        fileMet.writeFile(fl, txt);
        System.out.println("Leyendo contendio del archivo:");
        fileMet.readFile(fl);
    }
    
}
