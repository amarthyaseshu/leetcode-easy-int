package lce_easy_int;

public class PalindromeArray {

    public static void main(String[] args) {
        int[] arr={1,2,2,3,1};
            boolean isPalindrome=true;
        for (int i = 0; i < arr.length/2; i++) {
            if(arr[i]!=arr[arr.length-(i+1)]){
                isPalindrome=false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}

