package lce_medium_int;

import java.util.HashMap;
import java.util.Map;

public class FindMajorityElement {
    public static void main(String[] args) {
       int majority= findMahorityEle();
        System.out.println(majority);
//        int[] nums={1,1,3,3,5,5,5,5,5};
//        int n=nums.length/2;
//        Map<Integer,Integer> majorityEleMap=new HashMap<>();
//        for(int num:nums){
//            majorityEleMap.compute(num,(k,v)->v==null?1:v+1);
//            if(majorityEleMap.get(num)>n){
//                System.out.println(num);
//                break;
//            }
//        }
    }
   // For above one TC: O(n), SC: O(n)
    // Moores voting algorithm
  //  To reduce SC to O(1)

    static int findMahorityEle(){
        int[] nums={1,1,3,3,5,5,5,5,5};
        int result=nums[0];
        int count=0;
        for(int num:nums){
            if(count==0){
                result=num;
            }
            if(num==result){
                count++;
            }else{
                count--;
            }
        }
        return result;
    }
}
