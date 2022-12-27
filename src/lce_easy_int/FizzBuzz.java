package lce_easy_int;
import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static void main(String[] args) {
		System.out.println(fizzBuzz(5));

	}

	public static List<String> fizzBuzz(int n) {
		List<String> fizzBuzzList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			fizzBuzzList.add(getValueByIndex(i+1));
		}
		return fizzBuzzList;
	}

	private static String getValueByIndex(int i) {
		  if (i % 3 == 0 && i % 5 == 0) {
			return "FizzBuzz";
		}else if (i % 3 == 0) {
			return "Fizz";
		}else  if (i % 5 == 0) {
			return "Buzz";
		}
		return String.valueOf(i);
	}
}
