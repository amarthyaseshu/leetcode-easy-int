package lce_easy_int;

public class HappyNumber {
	public static void main(String[] args) {
		System.out.println(isHappy(2));
	}

	private static boolean isHappy(int n) {
		int count = 0;
		return getResult(n, count);

	}

	private static boolean getResult(int n, int count) {
		if (count > 50) {
			return false;
		}
		int l = getlatestNumber(n);
		if (l == 1) {

			return true;
		} else {
			count++;
			return getResult(l, count);
		}
	}

	private static int getlatestNumber(int n) {
		int quotient = n;
		int squaredNumber = 0;
		while (quotient > 0) {
			int remainder = quotient % 10;
			squaredNumber += (remainder * remainder);
			quotient = quotient / 10;
		}
		return squaredNumber;
	}
}
