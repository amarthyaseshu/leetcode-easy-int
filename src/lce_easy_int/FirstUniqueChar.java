package lce_easy_int;
import java.util.HashMap;
import java.util.Map;

public class FirstUniqueChar {
	public static void main(String[] args) {
		System.out.println(firstUniqChar("aabb"));

	}
// leetcode best soln
//	public static int firstUniqChar(String s) {
//		int count[] = new int[256];
//		for (int i = 0; i < s.length(); i++) {
//			count[s.charAt(i)]++;
//		}
//		for (int i = 0; i < s.length(); i++) {
//			if (count[s.charAt(i)] == 1)
//				return i;
//		}
//		return -1;
//	}

	// My solution
	public static int firstUniqChar(String s) {
		char[] ch = s.toCharArray();
		Map<Character, Integer> charCountMap = new HashMap<>();
		for (int i = 0; i < ch.length; i++) {
			if (charCountMap.containsKey(ch[i])) {
				charCountMap.put(ch[i], charCountMap.get(ch[i]) + 1);
			} else {
				charCountMap.put(ch[i], 1);
			}
		}
		for (int i = 0; i < ch.length; i++) {
			if (charCountMap.get(ch[i]) == 1) {
				return i;
			}
		}
		return -1;
	}
}
