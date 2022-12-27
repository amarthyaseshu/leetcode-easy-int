package lce_easy_int;

public class ReverseString {
public static void main(String[] args) {
	char[] s = {'h','e','l','l','o'};
	System.out.println(reverseString(s));
}
public static char[] reverseString(char[] s) {
	char temp;
	for(int i=0;i<s.length/2;i++) {
		temp=s[i];
		s[i]=s[(s.length-i)-1];
		s[(s.length-i)-1]=temp;
	}
	return s;
    
}
}
