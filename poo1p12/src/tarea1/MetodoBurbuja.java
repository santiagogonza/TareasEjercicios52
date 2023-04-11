/**
 * 
 */
package tarea1;

import java.util.Arrays;
import java.util.Iterator;

public class MetodoBurbuja {
	
	public static void main(String[] args) {
		int arreglo[] =  {1,2,3,4,5,8,9,10};
		burbuja(arreglo);
		System.out.println(Arrays.toString(arreglo));
	}
	private static void burbuja(int arreglo[]){
		 int n =arreglo.length;
		 for(int i = 0; i < n -1 ; i++) {
			 for(int j = 0; j<n-i-1; j++) {
				 if(arreglo[j] > arreglo[j+1]) {
					 
					  arreglo[j] = arreglo[j+1];
					  arreglo[j+1] = temporal;
				 }
			 }
		 }
		 
	}
}
