package lab8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.Point;
import plotter.Plotter;
import plotter.Polyline;
import java.util.ArrayList;

public class NewPlotter {
	public static void main (String [] args)throws FileNotFoundException{

	Plotter plotter = new Plotter();
	ArrayList<Polyline> list = readFile("hello.txt");
	for(Polyline line:list){
		plotter.plot(line);
	}
}	
	private static ArrayList<Polyline> readFile(String fileName)throws FileNotFoundException{
		File file = new File (fileName);
		Scanner scanner = new Scanner (file);
		ArrayList<Polyline> lineList = new ArrayList<>();
		while (scanner.hasNextLine()){
			Polyline p = oneLine(scanner.nextLine());
			if(p != null){
				
				lineList.add(p);
			}
		}
		scanner.close();
		return lineList;
	}
	
	
	private static Polyline oneLine(String line){
		Scanner in = new Scanner(line);
		int width;
		String color;
		Polyline a;
		if(!line.isEmpty() && line.charAt(0)!= '#'){
			if(in.hasNextInt()){
				width = in.nextInt();
				color = in.next();
				a = new Polyline (color, width);
			}
			else{
				color = in.next();
				a = new Polyline(color);
			}
		while(in.hasNextInt()){
			Point s = new Point(in.nextInt(),in.nextInt());
			a.addPoint(s);
		}
		in.close();
		return a;
	}
		in.close();
		return null;
	}	
}
