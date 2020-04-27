package sortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {
	
	static void insertionSort(int [] A) {
		 for(int  i = 1 ; i<A.length;i++) {  
			 int  tmp=A[i], j=i;
		     while ( j>0 && A[j-1]>tmp ) {	
		        A[j]=A[j-1];
		        j--;
		        System.out.println("The sorted array is "+Arrays.toString(A));
		     }
		     A[j] = tmp;
		     System.out.println("The arrays after the "+i+" iteration is "+Arrays.toString(A));
		     System.out.println("---------------------------------------------");
		 }//end of for loop
	}//end of method
	

	
public static void main(String[] args) {
		
		int array[] = {10, 3, 2, 5, 8, 4, 3, 1, 2, 9, 7, 8};
		
		long start = System.nanoTime();
		InsertionSort.insertionSort(array);
		long end = System.nanoTime();
		System.out.println("\n\nTime to execute this algo: " + (end-start));
		
	}
}//end of class