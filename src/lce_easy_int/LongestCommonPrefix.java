package lce_easy_int;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strs = { "flower", "flow", "flight" };
		System.out.println(longestCommonPrefix(strs));

	}

	public static String longestCommonPrefix(String[] strs) {
		int len = getSmallestStringLength(strs);
		String commonPrefix="";
		if(len>0) {
			for (int i = 0; i < strs.length; i++) {
				for(int j=0;j<len;j++) {
					String commonTemp="";
					if(i==j) {
						commonTemp=String.valueOf((strs[i].charAt(j)));
					}
					if(commonTemp.contains(String.valueOf((strs[i].charAt(j))))) {
						
					}
				}
			}
		}
		return null;

	}

	private static int getSmallestStringLength(String[] strs) {
		int smallestLength = 0;
		for (int i = 0; i < strs.length; i++) {
			if (i == 0) {
				smallestLength = strs[i].length();
			} else if (strs[i].length() < smallestLength) {
				smallestLength = strs[i].length();
			}
		}
		return smallestLength;

	}

}
