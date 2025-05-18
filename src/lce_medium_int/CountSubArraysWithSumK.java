package lce_medium_int;

public class CountSubArraysWithSumK {
    /*
    [1,2,3], k =3
    Count =2 {1,2}, {3}
     */
    public static void main(String[] args) {

        int[] nums={1,2,3,4,5,6};
        int k=6;
            int count=0;
        for (int i = 0; i < nums.length; i++) {
            if(i== nums.length-1){
                if(nums[i]==k){
                    count++;
                }
                break;
            }
            int internalCounter=nums[i];
            for (int j = i+1; j < nums.length; j++) {
                    if(nums[i]==k){
                        count++;
                        break;
                    }else if(nums[i]<k){
                        internalCounter=internalCounter+nums[j];
                        if(internalCounter==k){
                            count++;
                            break;
                        }else if(internalCounter>k){
                            break;
                        }
                    }else{
                        break;
                    }
            }
        }
        System.out.println(count);

    }

    // for optimized way use prefix sum formula
}
