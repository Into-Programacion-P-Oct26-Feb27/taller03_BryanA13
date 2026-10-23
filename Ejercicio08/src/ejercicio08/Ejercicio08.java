/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;

/**
 *
 * @author MI PC
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int variable1 = 80;
        int variable2 = 40;
        int variable3 = 6;
        int variable4 = 5;
        int variable5 = 45;
        int variable6 = 100;
        int variable7 = 25;
        int variable8 = 3;
        int variable9 = 30;
        
        System.out.println("-------Solución a problema------------------");
        //Math.pow me permite obtener la potencia de un valor 
        
        double variable10 = (variable1 + variable2 / variable3 + 
               Math.pow(variable4, 2));
        
        double variable11 = (variable6 - variable7 * variable8);
        
        boolean a = (variable10 >= variable5);
    System.out.println(a); // true or false
    
    boolean b = (variable11 < variable9);
    System.out.println(b); // true or false
    
    boolean resultado = (a && b);
   System.out.println(resultado);
    
    
        
        
    }
    
}
