package hashMap;

import java.util.HashMap;

public class LetterOccurance {

	public static void main(String[] args) {
		String str= "I am preparing for interview";
		HashMap<Character,Integer> hm= new HashMap<>();
		int len= str.length();
		for( int i= 0; i<len; i++) {
			char ch= str.charAt(i);
			if (hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}
			else {
				hm.put(ch, 1);
			}
		}
			for(Character c: hm.keySet()) {
				System.out.println(c+":"+hm.get(c));
				
				
			}
		}

	}


