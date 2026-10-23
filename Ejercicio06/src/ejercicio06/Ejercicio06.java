/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;

/**
 *
 * @author MI PC
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int variable1 = 100;
        int variable2 = 4;
        int variable3 = 25;
        int variable4 = 7;
        int variable5 = 50;
        
        System.out.println("-------Solución a problema------------------");
        
        double variable6 = (variable1 / variable2);  
        
        double variable7 = (Math.pow(variable4, 2));
        
        boolean a = (variable6 == variable3);
    System.out.println(a); // true or false
    
    boolean b = (variable7 > variable5);
    System.out.println(b); // true or false
    
    
    boolean resultado = (a && b);
   System.out.println(resultado); 
   
        
    }
    
}
