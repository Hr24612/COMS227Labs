package lab4;
import java.util.Scanner;

import postage1.PostageUtil;


public class ScannerPostage {

	
	
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);

	    System.out.print("Please Enter Weight: ");
	    double weight = in.nextDouble();
	    
	    System.out.println(PostageUtil.computePostage(weight));
	}
}
