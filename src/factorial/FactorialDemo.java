/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author ase911
 */
public class FactorialDemo {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("вычисление факториала в цикле");
        for (int i = 6; i > 0; i--) {
            System.out.println(i +"! = " + Factorial.computeI(i));
        }
        
        System.out.println("вычисление факториала рекурсивно");
        for (int r = 1; r <= 6; r++) {
            System.out.println(r +"! = " + Factorial.computeR(r));
        }
    }
    
}
