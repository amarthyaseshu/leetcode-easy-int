package lce_medium_int;

import java.util.Arrays;

public class MergeThreeSortedArrays {
 /*
    1.
    nums1 = [0,4,8,9,0,0,0,0] m=4
    nums2 = [5,6] n=2
    nums3 [2,3] 0 = 2
    o/p: [0,2,3,4,5,6,8,9]

    2.
    nums1 = [0,0,0,0,0] m=2
    nums2 = [1,2] n=2
    nums3 = [4] o=1
    o/p: [0,0,1,2,4]

 */
    public static void main(String[] args) {
      int[] nums1={0,4,8,9,0,0,0,0};
      int[] nums2={5,6};
      int[] nums3={2,3};
      int m=4;
      int n=2;
      int o=2;
        int p=(m+n+o)-1;
        int p1=m-1;
        int p2=n-1;
        int p3=o-1;
        while(p1>=0 && p2>=0 && p3>=0){
            if(nums3[p3]>=nums2[p2]){
                if(nums3[p3]>=nums1[p1]){
                    nums1[p]=nums3[p3];
                    p3--;
                    p--;
                }else if(nums2[p2]>=nums1[p1]){
                    nums1[p]=nums2[p2];
                    p2--;
                    p--;
                }else{
                    nums1[p]=nums1[p1];
                    p1--;
                    p--;
                }
            }else {
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
        }
        // use before one in a method & send 2 small arrays
        System.out.println(Arrays.toString(nums1));

    }
}
