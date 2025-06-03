package lce_medium_int;

import java.util.HashMap;
import java.util.Map;

public class SplitEqualArrWithoutDuplicates {

    //[1,1,2,2,3,4]
    // Given arr of even length
    // If arr is able to be split into 2 equal half's without duplicates, return true or false
    public static void main(String[] args) {

        int[] arr={1,1,2,2,3,4};
        Map<Integer,Integer> freqMap=new HashMap<>();
        for (int a:arr){
            freqMap.put(a,freqMap.getOrDefault(a,0)+1);
            if(freqMap.get(a)> (arr.length/2)){
                System.out.println(false);
                break;
            }
        }
        System.out.println(true);

    }
}
