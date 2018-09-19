package postage3;

public class PostageUtil {
	 
	public static double computePostage(double weight)
	  {
		 double cost = 0.47;
		 
		 if (weight > 1) {
			 cost = cost + (weight - 1) * 0.21;
		 }
		 
		 
		 
		 
		 
		 if (weight >3.5) {
			 cost = cost + 0.47;
		 }
		
		return cost;
		
		
	  }
}
