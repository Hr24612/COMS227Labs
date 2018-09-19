package lab5;

public class Balloon {

	int maxRadius;
	int Radius;
	boolean pop;

	public Balloon(int max) {
		maxRadius = max;
	if(maxRadius != Radius) {
		Radius = 0;
		}
	}

	public void blow(int amount) {
		amount = Radius++;
		if (Radius > maxRadius) {
			pop = true;
		}
	}

	public int getRadius() {
		return Radius;
	}

	public boolean isPopped() {
		if (pop) {
			return true;
		} else
			return false;
	}

	public void deflate() {
		Radius = 0;
	}

	public void pop() {
		Radius = 0;
	}
}
