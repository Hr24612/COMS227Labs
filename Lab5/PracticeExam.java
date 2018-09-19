package practice;

public class PracticeExam {
	1.

	interface IPlayer {
	 int play(); //Returns the player's move, which is always 0, 1, or 2
	 int getPreviousMove(int movesAgo); // Returns a previous move
	  }

	class RandomPlayer implements IPlayer {

	  private Random rand = new Random();
	  private ArrayList<Integer> history = new ArrayList<Integer>();

	  public int play()
	  	{
	    	int move = rand.nextInt(3); // randomly chooses 0, 1, or 2
	    	history.add(move);
	    	return move;
	  	}

	  public int getPreviousMove(int movesAgo)
	  	{
	   	 return history.get(history.size() - movesAgo);
	  	}

	  protected void addToHistory(int move)
	  	{
	   	 history.add(move);
	  	}

	  protected int nextRandom(int n)
	  	{
	      	return rand.nextInt(n);
	  	}

	}




	class AlternatingPlayer extends RandomPlayer {

	private int state = 0;
	public int play(){
	// usually returns 0, but every third move randomly chooses 1 or 2
	    int move = 0;
	    if (state % 3 == 2){
	          move = nextRandom(2) + 1;
	        }
	      ++state;
	      addToHistory(move);
	    return move;
	  }

	}



	2.

	class Picture extends Circle{
	private ArrayList<Shape> shapes;
	  public Picture(){
	     shapes = new ArrayList<Shape>();
	  }
	  public void add(Shape s){
	    shapes.add(s);
	  }
	  public double findTotalArea(){
	    double area = 0;
	    for(Shape x : shapes){
	      area += x.getArea;
	    }
	    return area;
	  }
	}



	3.
	A. I do not think this will work because the student did not add the shapes to an ArrayList. Therefore, the answer will always be 0.(atleast when I plugged it into eclipse it did this)
	B. This is an undesriable solution because in reality you would want to add all the shapes to an ArrayList, then iterate through the array list finding the area.



	4.
	A.
	public interface Processor
	{
	  public double getResult();

	  public void process(double[] arr);

	}



	B.

	public class MaxProcessor implements Processor{

	  private  double max;

	public MaxProcessor(){
	      max = 0.0;
	    }

	@Override
	public void process(double[] arr)
	{
		max = arr[0];
	        for(int i = 1; i < arr.length ; i++)
	        {
	          if(arr[i] > arr[i-1]){
	            max = arr[i];
	          }
	       }
	  }

	@Override
	public double getResult()
	    {
	      return max;
	    }
	}



	C.

	public class RangeCounter implments Processor{

	private double range;
	private int min;
	private int max;

	public RangeCounter(int min, int max)
	    {
	      this.min = min;
	      this.max = max;
	      range = 0.0;
	    }

	@Override
	public void process(double[] arr)
	{

	  if( arr.length >= max){
	    range = (max - min) + 1;
	  }else{
	    range = (arr.length - min) + 1;
	  }

	}

	@Override
	public double getResult()
		{
	 	 return range;
		}
	}




	5.(I believe I made the compareTo method correctly, this could be implemented with a for loop over an array of points)

	class Point implements Comparable<Point>{

	private int x;
	private int y;

	public Point(int givenX, int givenY)
	  {
	    x = givenX;
	    y = givenY;
	  }
	public int getX() {
	    return x;
	  }
	public int getY() {
	    return y;
	  }

	protected int pointAddition(Point g){

	  int total = (int) Math.sqrt(Math.pow(g.getX(),2) + Math.pow(g.getY(),2));;

	  return total;
	}
	@Override
	public int compareTo(Point x){

	   if(this > pointAddition(x)){
	        return -1;
	      }else if(this < pointAddition(x)){
	        return 1;
	      }else{
	        return 0;
	      }
	  }

	}




	6.

	(assuming you have a function that lets us know the 'rank' of foo, i used getRank() similar to the Card class in our last homework)

	public class Foo implements Comparable<Foo>{

	@Override
	public int compareTo(Foo x){
	    if(this > foo.getRank()){
	      return -1
	    }else if(this< foo.getRank()){
	      return 1;
	    }else{
	      return 0;
	    }
	  }

	protected Foo getTheGreatestFoo(Foo[] g){
	  Foo greatestFoo = g[0];

	  for(int i = 1; i < g.length ; i++){
	    if(g[i].getRank().compareTo(greatestFoo.getRank()) > 1){
	        greatestFoo = g[i];
	      }
	    }
	    return greatestFoo;
	  }
	}



	7.

	public interface IRabbitModel {
	public int getPopulation();
	public void simulateYear();
	public void reset();
	}



	public class RabbitModel1 implements IRabbitModel{
	  private population;
	  private year;

	public RabbitModel1(int population){
	    this.population = population;
	    year = 0;
	  }
	public int getPopulation(){
	    return population;
	  }
	public void reset(){
	    population = 0;
	    year = 0;
	  }
	public void simulateYear(){
	    population++;
	    year++;
	    if(year == 5){
	      population = population % 5;
	    }
	  }
	}

	public class RabbitModel2 extends IRabbitModel1{

	  public RabbitModel2(int population){
	    super(population);
	  }

	  @Override
	  public void simulateYear(){

	    population = population % 2;
	  }


	public class RabbitModel3 extends IRabbitModel1{

	private Random rand;

	 public RabbitModel3(int population){
	     super(population);
	     rand = new Random(); //could use a seed
	 }
	@Override
	public void simulateYear(){
	      population += rand.nextInt(11);
	    }
	}

	public class RabbitModel4 extends IRabbitModel1{

	public RabbitModel3(int population){
	      super(population);
	   }
	@Override
	public void simulateYear(){

	      int lastYear = 1;
	      int yearBefore = 0;
	      population = yearBefore + lastYear;
	      yearBefore = lastYear;
	      lastyear = population;

	    }
	}



	8.
	-20, //total's path is as follow: 10 , 30, 10, 40, 10, -20




	9.

	public static void main(String[] args){

	  try{
	      printPercentages("votes.txt");
	    }

	catch(FileNotFoundException){

	  System.out.println("no such file");

	  }
	}
}
