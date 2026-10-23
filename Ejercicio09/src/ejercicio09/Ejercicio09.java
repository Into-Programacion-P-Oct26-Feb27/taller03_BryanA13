/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09;

/**
 *
 * @author MI PC
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int variable1 = 225;
        int variable2 = 5;
        int variable3 = 50;
        int variable4 = 120;
        int variable5 = 4;
        int variable6 = 30;
        
        System.out.println("-------Solución a problema------------------");
        //Math.pow me permite obtener la potencia de un valor 
        
        double variable7 = (Math.sqrt(variable1) + Math.pow(variable2, 2));
        
        double variable8 = (variable4 / variable5);
        
        boolean a = (variable7 < variable3);
    System.out.println(a); // true or false
    
        boolean b = (variable8 == variable6);
    System.out.println(b); // true or false
    
    boolean c = (a && b);
   System.out.println(c);
   
   System.out.println(!c);
    
    
    }
    
}
