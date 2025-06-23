package lce_medium_int;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StockBuyAndSell {

    public static void main(String[] args) {
        // [100,180,260,310,40,535,695]

        int[] arr= {4,2,2,2,4};

        List<List<Integer>> buySell=new LinkedList<>();


        int buy=arr[0];
        int sell=0;
        for (int i = 1; i < arr.length; i++) {

                if(arr[i]>buy){
                    if(arr[i]>sell) {
                        sell = arr[i];
                        if(i== arr.length-1){
                            buySell.add(List.of(buy,sell));
                        }
                    }else {
                        buySell.add(List.of(buy,sell));
                        buy=arr[i];
                        sell=0;
                    }
                }else{
                    if(sell>0) {
                        buySell.add(List.of(buy, sell));
                    }
                    buy=arr[i];
                    sell=0;
                }
        }

        System.out.println(buySell);

    }
}
