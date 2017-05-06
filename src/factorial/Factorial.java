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
public class Factorial {

   static long computeI(int n){
       
       long result = 1;
       
       for (int i = 1; i <= n; i++) {
           result *= i;
       }
       return result;
   }
   
   static long computeR(int n){
       if (n == 1)
           return n;
       return computeR(n - 1)*n;
   }
    
}
