package lce_medium_int;

import java.util.Arrays;

/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, m n
and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
Example 1:
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6]. find
 */
public class MergeSortedArrays {
    public static void main(String[] args) {
        int m=3;
        int n=3;
        int[] nums1={2,3,6,0,0,0};
        int[] nums2={1,2,4};
        int p=(m+n)-1;
        int p1=m-1;
        int p2=n-1;
        while(p1>=0 && p2>=0){
            if(nums2[p2]>=nums1[p1]){
                nums1[p]=nums2[p2];
                p2--;
                p--;
            }else{
                nums1[p]=nums1[p1];
                p1--;
                p--;
            }

        }
        while(p2>=0){
            nums1[p]=nums2[p2];
            p2--;
            p--;
        }
        System.out.println(Arrays.toString(nums1));
    }
}
