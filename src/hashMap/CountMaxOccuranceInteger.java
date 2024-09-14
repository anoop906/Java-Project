package hashMap;

import java.util.HashMap;

public class CountMaxOccuranceInteger {

	public static void main(String[] args) {
		int[] arrint = { 7, 6, 7, 8, 9, 4, 3, 5, 4, 3, 7, 3, 5, 2, 4, 7, 2, 1 };
		int len = arrint.length;
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < len; i++) {
			int n = arrint[i];
			if (hm.containsKey(n)) {
				hm.put(n, hm.get(n) + 1);
			}
			else {
				hm.put(n, 1);
			}
		}
	//	int maxfreqnum = arrint[0];
		for (Integer num : hm.keySet()) {
//			if (hm.get(num) > hm.get(maxfreqnum)) {
//				maxfreqnum = num;
//				}
			System.out.println(num + ":" + hm.get(num));
		}
	//	System.out.println("Maximum occurance number is: " + maxfreqnum + ":" + hm.get(maxfreqnum));
	}

}
