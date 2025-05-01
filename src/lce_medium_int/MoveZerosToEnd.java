package lce_medium_int;

import java.util.Arrays;

public class MoveZerosToEnd {

   // Given an integer array nums, move all 0's to the end of it
    // while maintaining the relative order of the non-zero elements.
   // Note that you must do this in-place without making a copy of the array.

    //Input: nums = [0,1,0,3,12]
    //Output: [1,3,12,0,0]

    public static void main(String[] args) {
        int[] nums={1,6,0,3,0,2,9,1,0};
            int length= nums.length;

        for (int i = 0; i <length ; i++) {

            if(nums[i]==0){
                pushElementsToLeft(nums,length,i+1);
            }
        }
        System.out.println(Arrays.toString(nums));

    }
    private static void pushElementsToLeft(int[] nums, int length,int i) {

        for (int j = i; j < length; j++) {
                nums[j-1]=nums[j];
        }
        nums[length-1]=0;
    }

    // For above one TC: O(n sq)


    // optimized
    public void moveArrZ(){
       int[] nums = {0,1,0,3,12};
       int nonZeroIndex=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
               nums[nonZeroIndex]=nums[i];
                nonZeroIndex++;
            }
        }
        for (int i = nonZeroIndex; i <nums.length ; i++) {
                nums[i]=0;
        }

    }
// For above one TC: O(2n) almost eq to O(n)


    //further optimized
    public static void moveArr2(){
        int[] nums = {0,1,0,3,12};
        int nonZeroIndex=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != nonZeroIndex) {
                    int temp = nums[nonZeroIndex];
                    nums[nonZeroIndex] = nums[i];
                    nums[i] = temp;
                }
                nonZeroIndex++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

}
