/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

/**
 *
 * @author USUARIO
 */
public class Selection {
    
    public void selectionSort(int arr[]){
  int i,j,min,temp;
  for(j=0; j < arr.length-1; j++){
   min=j;
   for(i=j+1; i < arr.length; i++)
    if(arr[i] < arr[min]) min=i;
   if(j!=min){
    temp=arr[j];
    arr[j]=arr[min];
    arr[min]=temp;
   }
  }
} 
}
