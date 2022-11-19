/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica8;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Etian
 */
public class Utils {
    public void writeFile(File fileName, String txt){
        try{
            FileWriter fw = new FileWriter(fileName);
            fw.write(txt);
            fw.close();
            System.out.println("Escritura exitosa.");
            System.out.println("Se escribio: '" + txt + "'");
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public void readFile(File fileName){
        try{
            FileReader fr = new FileReader(fileName);
            int let = fr.read();
            while (let != -1){
                System.out.print((char)let);
                let = fr.read();
            }
            System.out.println();
            fr.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
