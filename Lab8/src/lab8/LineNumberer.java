package lab8;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class LineNumberer {
	
	  public static void main(String[] args) throws FileNotFoundException {
		
	    File file = new File("..\\project7\\src\\lab7\\Deck.java");
     
        Scanner fileScanner = new Scanner(file);
	    
	    
	    int lineCount = 1;

	    while (fileScanner.hasNextLine())
	    {
	      String line = fileScanner.nextLine();
	      System.out.print(lineCount + " ");
	      System.out.println(line);
	      lineCount += 1;
	    }
	    
	    fileScanner.close();
	  }

}