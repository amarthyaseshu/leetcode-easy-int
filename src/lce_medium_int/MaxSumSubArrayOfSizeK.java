package lce_medium_int;

public class MaxSumSubArrayOfSizeK {

    public static void main(String[] args) {
            int maxSubArray=maximumSumSubarray();
        System.out.println(maxSubArray);
//        int[] arr={4,2,1,7,8,1,2,3,9};
//        //4,2
//        //2,1
//        //1,7
//        //7,8
//        int k=3;
//                int max=0;
//        for (int i = 0; i <= arr.length-k; i++) {
//            int sum=arr[i];
//            for (int j = 1; j < k; j++) {
//               sum=sum+arr[i+j];
//            }
//            if(sum>max){
//                max=sum;
//            }
//
//        }
//        System.out.println(max);
        // for above one
        // TC: O(n^2)
        //SC: O(1)
    }

    // Sliding window algo
    static int maximumSumSubarray() {
        int[] arr = {4, 2, 1, 7, 8, 1, 2, 3, 9};
        //4,2,1=7
        //2,1,7
        //1,7,8
        //7,8,1
        //1,2,3
        //2,3,9
        // here one element is reducing before & 1 element increasing, which shows sliding window pattern
        // focus on i & k, i is starting ele to iterate & i-k is used for reduction
        // last is used for adding, first is used for reducing
        int k = 3;

        int max_sum = 0;
        int current_sum = 0;
        for (int i = 0; i < k; i++) {
            current_sum += arr[i];
        }

            max_sum = current_sum;

        for (int i = k; i <= arr.length - 1; i++) {
            current_sum = current_sum - arr[i - k] + arr[i];
            if (current_sum > max_sum) {
                max_sum = current_sum;
            }
        }
        return max_sum;
    }

    // TC: O(n)
    // SC:O(1)
}
