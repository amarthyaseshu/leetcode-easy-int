package lce_medium_int;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountTheTriplets {

    //[1,5,3,2]
    public static void main(String[] args) {

        int[] arr={1,5,3,2,7};

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        int counter=0;

        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
               if(list.contains(arr[i]+arr[j])){
                    counter++;
                }
            }
        }
        System.out.println(counter);

        //countTriplets();

    }
    // If should not use list
    public static int countTriplets(){

        int[] arr={1,5,3,2,7};

        int index[]=new int[100000];

        for (int i = 0; i < arr.length; i++) {
            index[arr[i]]=1;
        }

        int counter=0;

        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(index[arr[i]+arr[j]]==1){
                    counter++;
                }
            }
        }
        System.out.println(counter);
       return counter;

    }
}
