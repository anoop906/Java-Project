package hashMap;

import java.util.HashMap;

public class CountOccuranceOfWord {

	public static void main(String[] args) {
		String str = "This is java . Java is programming language";
		String[] newStr = str.toLowerCase().split(" ");
		HashMap<String, Integer> hm = new HashMap<>();
		int len = newStr.length;
		for (int i = 0; i < len; i++) {
			String word = newStr[i];
			if (hm.containsKey(word)) {
				hm.put(word, hm.get(word) + 1);

			} else {
				hm.put(word, 1);
			}
		}

		for (String finalWord : hm.keySet()) {
			System.out.println(finalWord + ":" + hm.get(finalWord));
		}

	}

}
