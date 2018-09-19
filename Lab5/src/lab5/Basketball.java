package lab6;

public class Basketball {
	
	boolean Inflated;
	double Diameter;
	
	public Basketball(double givenDiameter)
	  {
		givenDiameter = Diameter;
	  }

	  public boolean isDribbleable()
	  {
	    if(Inflated) {
	    	return true;
	    }
	    else 
	    	return false;
	  }

	  public double getDiameter()
	  {
	    return 5;
	  }

	  public double getCircumference()
	  {
	    return 0;
	  }

	  public void inflate()
	  {
		  Inflated = true;
	  }
}
