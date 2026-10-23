/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author MI PC
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int variable1 = 3;
        int variable2 = 81;
        int variable3 = 40;
        
        System.out.println("-------Solución a problema------------------");
        // Math.sqrt me permite obtener la raíz cuadrada de un número
        // Math.pow me permite obtener la potencia de un número
        
        double resultado = (Math.pow (variable1, 3) + Math.sqrt (variable2));
        
        
        System.out.println(resultado);
        
        boolean a = (resultado <= variable3);
    System.out.println(a); // true or false
        
        
        
    }
    
}
