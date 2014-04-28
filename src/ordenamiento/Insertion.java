/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

/**
 *
 * @author USUARIO
 */
public class Insertion {
   
    
    public int[] InsertionSort (int a[]) { 
  int i, k, temp; 
  for (k = 1; k < a.length; k ++){
   temp = a [k]; 
   i = k; 
   while (i> 0 && temp <a [i-1 ]) { 
    a [i] = a [i-1]; 
    i--; 
   } 
   a [i] = temp; 
   
   
  }
  return a;
} 
    
}
