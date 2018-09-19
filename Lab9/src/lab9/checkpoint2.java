package lab9;

import java.io.File;
import java.util.ArrayList;

public class checkpoint2 {

	 public static void main(String[] args)
	  {
	    // Choose the directory you want to list.
	    // If running in Eclipse, "." will just be the current project directory.
	    // Use ".." to list the whole workspace directory, or enter a path to
	    // some other directory.
	    File rootDirectory = new File("C:\\Users\\Amir Hamza\\Downloads\\Counter");

	    listAllFiles(rootDirectory);
	    
	    System.out.println(countFiles(rootDirectory));
	    
	    File in = new File("FileLister.java");
	    System.out.println(findFiles(in));
	    System.out.println(findFiles(rootDirectory));
	  }
	 
	 public static ArrayList<String> findFiles(File file)
	  {
	    // create an empty array list...
	    ArrayList arr = new ArrayList<String>();
	    
	    if(!file.isDirectory())
	    {
	    	arr.add(file.getName());
	    }
	    else
	    {
	    	findFiles(file,arr);
	    }
	    
	    // and return the filled-up ArrayList
	    return arr;
	  }
	 
	 private static void findFiles(File file, ArrayList<String> list)
	  {
	    if (!file.isDirectory())
	    {
	       list.add(file.getName());
	    }
	    else
	    {
	      // recursively search the subdirectory
	      for (File f : file.listFiles())
	      {
	        findFiles(f, list);
	      }
	    }
	  }
	  
	  /**
	   * Print the names of all items in the hierarchy located under 
	   * a given directory. If the given File object is not a directory, 
	   * just prints the file's name.
	   */
	  public static void listAllFiles(File f)
	  {
	    if (!f.isDirectory())
	    {
	      // Base case: f is a file, so just print its name
	      System.out.println(f.getName());
	    }
	    else
	    {
	      // Recursive case: f is a directory, so go through the 
	      // files and directories it contains, and recursively call
	      // this method on each one
	      System.out.println("+ " + f.getName());
	      File[] files = f.listFiles();
	      for (int i = 0; i < files.length; ++i)
	      {
	        listAllFiles(files[i]);
	      }
	    }
	  }
	  
	  public static int countFiles(File f){
			int total = 0;
			if(!f.isDirectory()){
				return 1;
			}
			else{
				File[] files = f.listFiles();
			      for (int i = 0; i < files.length; ++i)
			      {
			        total += countFiles(files[i]);
			      }
			      return total;
			}
		}
}
