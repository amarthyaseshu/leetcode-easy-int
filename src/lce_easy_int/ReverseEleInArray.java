package lce_easy_int;

import java.util.Arrays;

public class ReverseEleInArray {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};

        int reversedArr[]=new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversedArr[i]=arr[arr.length-(i+1)];
        }
        System.out.println(Arrays.toString(reversedArr));
    }
}
