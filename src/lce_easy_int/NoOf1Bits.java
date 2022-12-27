package lce_easy_int;

public class NoOf1Bits {

	public static void main(String[] args) {
		Integer n=00001011;
	System.out.println(hammingWeight(n));

	}
	
public static int hammingWeight(int n) {
	int count=0;
	int quotient=n;
	while(quotient>0) {
		int remainder=quotient%10;
		if(remainder==1) {
			count++;
		}
			quotient=quotient/10;
	}
	return count;
    }

}
