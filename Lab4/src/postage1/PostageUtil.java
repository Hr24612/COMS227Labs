package postage1;

public class PostageUtil
{
 
  public static double computePostage(double weight)
  {
	  double cost;
  if (weight <= 1) {
		        cost = .47;}
	  
		    else if (weight <= 3.5) {
		            cost = .47 + (weight - 1) * .21; }
		        else {
		            cost = .94 + (weight - 1) * .21; }
    return cost;
  }
}
