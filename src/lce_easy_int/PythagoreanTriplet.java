package lce_easy_int;


import java.util.*;

import java.util.stream.IntStream;

public class PythagoreanTriplet {

    public static void main(String[] args) {
        int[] arr = {3,8,5};
        System.out.println(findPythagoreanTriplet(arr));
    }

    private static boolean findPythagoreanTriplet(int[] arr) {


        Set<Integer> squares=new TreeSet<>();
        for (int a: arr){
            squares.add(a*a);
        }
        // 4 9 16 25 36

        //9 25 64

        List<Integer> list=new ArrayList<>(squares);

      return  IntStream.range(0,list.size()-3).filter(i-> squares.contains(list.get(i) + list.get(i + 1))).findFirst().isPresent();

    }
}
