package lce_easy_int;


public class RomanToInteger {
	public static void main(String[] args) {
		System.out.println(romanToInt("MCDLXXVI"));
	}

	public static int romanToInt(String s) {
		int sum=0;
		char[] charArr=s.toCharArray();
		for(int i=charArr.length-1;i>=0;i--) {
			 char[] tempChar;
			 
			 if(i>=1 && isPair(new char[] {charArr[i-1],charArr[i]})) {
				 tempChar =new char[2];
				 tempChar[0]=charArr[i-1];
				 tempChar[1]=charArr[i];
				 i--;
			 }else {
				 tempChar =new char[1];
				 tempChar[0]=charArr[i];
			 }
		sum+=	romanIntConvValue(tempChar);
		}
		return sum;

	}
	
	private static boolean isPair(char[] charArr) {
		if(charArr[0]=='I' && charArr[1]=='V') {
			return true;
		}else if (charArr[0]=='I' && charArr[1]=='X') {
			return true;
		}else if (charArr[0]=='X' && charArr[1]=='L') {
			return true;
		}else if (charArr[0]=='X' && charArr[1]=='C') {
			return true;
		}else if (charArr[0]=='C' && charArr[1]=='D') {
			return true;
		}else if (charArr[0]=='C' && charArr[1]=='M') {
			return true;
		}else {
			return false;
		}
	}

	public static int romanIntConvValue(char[] charArr) {
		if (charArr.length == 1) {
			return getSingleCharValue(charArr[0]);
		} else {
			if(charArr[0]=='I' && charArr[1]=='V') {
				return 4;
			}else if (charArr[0]=='I' && charArr[1]=='X') {
				return 9;
			}else if (charArr[0]=='X' && charArr[1]=='L') {
				return 40;
			}else if (charArr[0]=='X' && charArr[1]=='C') {
				return 90;
			}else if (charArr[0]=='C' && charArr[1]=='D') {
				return 400;
			}else if (charArr[0]=='C' && charArr[1]=='M') {
				return 900;
			}else {
				return (getSingleCharValue(charArr[0])+getSingleCharValue(charArr[1]));
			}
		}
	}

	private static int getSingleCharValue(char c) {
		if (c == 'I') {
			return 1;
		} else if (c == 'V') {
			return 5;
		} else if (c == 'X') {
			return 10;
		} else if (c == 'L') {
			return 50;
		} else if (c == 'C') {
			return 100;
		} else if (c == 'D') {
			return 500;
		} else if (c == 'M') {
			return 1000;
		}
		return 0;
	}

}
