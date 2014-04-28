/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import ordenamiento.*;

/**
 *
 * @author Administrador
 */
public class Unit {
   BogoSort objeto;
   Insertion objeto2;
   Selection objeto3;
   int vector [] = {5,3,6,8,7,9,2,1,10,4};
    int vector2 [] = {1,2,3,4,5,6,7,8,9,10};
    
    @Before
    public void setUp() {
      objeto = new BogoSort();
      objeto2 = new Insertion();
      objeto3 = new Selection();
    }
    
    
    
    @After
    public void tearDown() {
        objeto = null;
        objeto2 = null;
        objeto3 = null;
    }

    
     @Test
     public void bogosort() 
     {
         
      int vectororden[] = objeto.bogoSort(vector);   
      for(int i=0; i<vector.length; i++){
          assertEquals( vector2[i], vectororden[i]);
      }
     }
     
      @Test
     public void insertion() 
     {
         
       int vectororden[] = objeto2.InsertionSort(vector2);
       for(int i=0; i<vector.length; i++){
          assertEquals( vector2[i], vectororden[i]);
      }

     }
     
     
      @Test
     public void selection() 
     {
      int vectororden[] = objeto3.selectionSort(vector2);
       for(int i=0; i<vector.length; i++){
          assertEquals( vector2[i], vectororden[i]);
      }

     }
  
}
