package lce_easy_int;
import java.util.ArrayList;
import java.util.List;

public class ValidAnagram {

	public static void main(String[] args) {
		System.out.println(isAnagram("rat", "car"));

	}

	public static boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		List<Character> sList = addEleOfStringToList(s);
		List<Character> tList = addEleOfStringToList(t);
		for (int i = 0; i < sList.size(); i++) {
			tList.remove(sList.get(i));
		}
		return tList.isEmpty();
	}

	private static List<Character> addEleOfStringToList(String s) {
		List<Character> charList = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			charList.add(s.charAt(i));
		}
		return charList;
	}

}
