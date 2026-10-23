/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author MI PC
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int variable1 = 15;
        int variable2 = 25;
        int variable3 = 30;
        int variable4 = 8;
        int variable5 = 60;
        int variable6 = 144;
        int variable7 = 12;
        
        System.out.println("-------Solución a problema------------------");
        
        double variable8 = (variable1 + variable2);
        
        System.out.println(variable8);
        
        double variable9 = (Math.pow(variable4, 2));
        
        System.out.println(variable9);
        
        double variable10 = (Math.sqrt(variable6));
        
        System.out.println(variable10);
        
        boolean a = (variable8 > variable3);
    System.out.println(a); // true or false
    
    boolean b = (variable9 < variable5);
    System.out.println(b); // true or false
    
    boolean c = (variable10 == variable7);
    System.out.println(c); // true or false
    
    boolean resultado = (a || b && c);
   System.out.println(resultado); 
    
    
                
    }
    
}
