package lab7;

import java.util.Arrays;
import java.util.Random;

public class Exercise2 {

	public static void main(String[] args) {
		
		int [] random = randomExperiment(10,1000);
		System.out.println(Arrays.toString(random));
	}
	public static int[] randomExperiment(int max, int iters)
	{
	    Random randomGenerator = new Random();
	    
	    int[] counts = new int [max];
	    
	    for(int i = 0; i < iters; i++)
	    {
	        int randomInt = randomGenerator.nextInt(max);
	        counts[randomInt]++;
	    }
	    return counts;
	}
}
