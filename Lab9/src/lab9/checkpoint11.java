package lab9;

public class checkpoint11 {
	
		public static int getPyramidCount(int n) {
			
			if (n == 1)
				return 1;

			else
				return n * n + getPyramidCount(n - 1);
		}

		public static void main(String[] args) {
			int n = 3;
			System.out.println("No.of.balls of a pyramid with " + n + " levels is " + checkpoint11.getPyramidCount(n));
		}
	}
