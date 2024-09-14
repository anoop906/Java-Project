package hashMap;

import java.util.HashMap;

public class MaximumOccuranceofletter {

	public static void main(String[] args) {
		String str= "I am ready for interrrviews";
		HashMap<Character, Integer> hm = new HashMap<>();
		int count=0;
		int len = str.length();
		for (int i =0 ; i<len; i++) {
			char ch = str.charAt(i);
			if (hm.containsKey(ch)) {
				count = hm.get(ch);
				count++;
				hm.replace(ch, count);
				
			}else {
				hm.put(ch, 1);
			}
			
		}
		char mfc = str.charAt(0);
		for(Character c: hm.keySet()) {
			if (hm.get(c)>hm.get(mfc)) {
				mfc=c;
				
			}
			
			System.out.print(c+":"+hm.get(c)+" ");
		}System.out.println("\nMaximum occurance of letter is:: "+mfc+":"+hm.get(mfc));
		

	}

}
