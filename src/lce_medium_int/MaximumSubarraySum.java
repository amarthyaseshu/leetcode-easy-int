package lce_medium_int;

public class MaximumSubarraySum {

    //Input: nums[-2,1,-3,4,-1,2,1,-5,4]
   // Output: 6 +
    //Explanation: The subarray [4,-1,2,1] has the largest sum 6.

    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        
        int maxSum=0;

        for (int i = 0; i < nums.length; i++) {
            if(i== nums.length-1){
                maxSum= Math.max(nums[i], maxSum);
            }
                int subCounter=nums[i];
            for (int j = i+1; j < nums.length; j++) {
                    subCounter=subCounter+nums[j];
                    if(subCounter>maxSum){
                        maxSum=subCounter;
                    }
            }
            
        }
        System.out.println(maxSum);

    }
}
