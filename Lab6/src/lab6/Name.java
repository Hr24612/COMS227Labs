package lab6;

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		String name = FullName1("Amir Hamza");
		System.out.println(name);
	}

	public static String FullName1(String s) {
		Scanner c = new Scanner(s);
		String x = ""; 
		while (c.hasNext()) { 

			x += c.next().charAt(0);

		}
		return x;
	}
}
