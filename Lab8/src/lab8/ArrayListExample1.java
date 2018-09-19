package lab8;

import java.util.ArrayList;

public class ArrayListExample1 {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		a.add("AAA");
		a.add("AAA");
		a.add("BBB");
		a.add("BBB");
		a.add("CCC");
		a.add("CCC");

		System.out.println("Before: " + a);
		removeDuplicates(a);
		System.out.println("After" + a);
	}

	public static void removeDuplicates(ArrayList words) {
		for (int i = 0; i < words.size(); i++) {
			for (int j = i + 1; j < words.size(); j++) {
				if (words.get(i) == words.get(j)) {
					words.remove(j);
					j = j - 1;
				}
			}
		}
	}
}