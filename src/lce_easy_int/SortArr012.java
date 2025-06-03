package lce_easy_int;

import java.util.Arrays;

public class SortArr012 {

    public static void main(String[] args) {
        int[] arr={0,1,0,2,1,0};

        int zeroCounter=0;
        int oneCounter=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                zeroCounter++;
            }else if(arr[i]==1){
                oneCounter++;
            }
        }

         oneCounter= zeroCounter+oneCounter;

        for (int i = 0; i < arr.length; i++) {
            if(i<zeroCounter){
                arr[i]=0;
            } else if (i<oneCounter) {
                arr[i]=1;
            }else {
                arr[i]=2;
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
