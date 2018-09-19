package lab7;

import java.util.Arrays;


public class Exercise1 {

	public static void main(String [] args) {
		
		int[] a = {1,4,5,7,8,-5,-7,-3,-5,8};
		int[] b = getPositiveNumbers(a);
		System.out.println(Arrays.toString(b));
		
		
}
	public static int[] getPositiveNumbers(int[] numbers) {
		int Count = 0;
	     for (int x : numbers){ 
	    	 if(x > 0 ){
	            Count = Count + 1;
	         }
	     }
	   
	     int [] b = new int[Count];
	    int i = 0;
	    for (int x : numbers){
	        if(x > 0){
	           b[i] = x;
	           i= i+1;
	        }
	    }

	    return b;
	
	}
}