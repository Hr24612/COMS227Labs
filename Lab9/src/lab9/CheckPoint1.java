package lab9;

public class CheckPoint1 {

	public static void main(String[] args) {
		int[] test = { 3, 4, 5, 1, 2, 9, 2}; 
		int result = arrayMax(test);
		System.out.println(result);
	}

	public static int arrayMax(int[] arr) {
		return arrayMaxRec(arr, 0, arr.length - 1);
	}

	private static int arrayMaxRec(int[] arr, int start, int end) {
		if (start == end) {
			return arr[start];
		} else {
			int mid = (start + end) / 2;
			int leftSum = arrayMaxRec(arr, start, mid);
			int rightSum = arrayMaxRec(arr, mid + 1, end);
			return (leftSum > rightSum) ? leftSum : rightSum;
		}
	}
}
