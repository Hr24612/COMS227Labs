package lab6;

public class vowel {

	public static void main(String[] args) {

		int result = getvowel();
		System.out.println(result);
	}

	public static int getvowel() {

		String ch = "vvvfffvvbbksle";

		for (int i = 0; i < ch.length(); i++) {
			if ("AEIOUaeiou".indexOf(ch.charAt(i)) >= 0) {
				return i;

			}
		}

		return -1;
	}

}
