/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica9;

/**
 *
 * @author Etian
 */
public class RunPractica9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student stu = new Student("Juan Perez", "Colonia Independencia", "Secundaria", 3, 6503.23);
        Staff stf = new Staff("Juan Perez", "Colonia Independencia", "Escuenla Miguel Hidalgo", 12333.33);
        System.out.println(stu.toString());
        System.out.println(stf.toString());
        
        // TODO code application logic here
    }
    
}
