/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author MI PC
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int variable1 = 4;
        int variable2 = 81;
        int variable3 = 70;
        int variable4 = 50;
        int variable5 = 2;
        int variable6 = 25;
        int variable7 = 18;
        int variable8 = 12;
        int variable9 = 25;
        int variable10 = 7;
        int variable11 = 40;
        
        
         System.out.println("-------Solución a problema------------------");
        //Math.pow me permite obtener la potencia de un valor 
        
        double variable12 = (Math.pow(variable1, 3) + Math.sqrt(variable2));
        
        double variable13 = (variable4 / variable5);
        
        double variable14 = (variable7 + variable8);
        
        double variable15 = (Math.pow(variable10, 2));
    
         boolean a = (variable12 > variable3);
         //true or false
    
        boolean b = (variable13 == variable9);
        //true or false
        
        boolean c = (variable14 <= variable6);
        //true or false
        
        boolean d = (variable15 > variable11);
        //true or false
        
        boolean e = (a && b); //true or false
        
        boolean f = (c || !d); //true or false
        
        boolean resultado = (e || f);
   System.out.println(resultado); 
        
       
        
    }
    
}
