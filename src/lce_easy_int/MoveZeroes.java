package lce_easy_int;
import java.util.Arrays;

public class MoveZeroes {

	public static void main(String[] args) {
		int[] nums= {0};
		System.out.println(Arrays.toString(moveZeroes(nums)));

	}
	 public static int[] moveZeroes(int[] nums) {
		 if(nums.length==1) {
			 return nums;
		 }
		 for(int i=0;i<nums.length-1;i++) {
			 if(nums[i]==0) {
				 for(int j=i+1;j<nums.length;j++) {
						if(nums[j]!=0) {
							nums[i]=nums[i]+nums[j];
							nums[j]=nums[i]-nums[j];
							nums[i]=nums[i]-nums[j];
							break;
						}
					 }
			 }
			 
		 }
		 
		return nums;
	        
	    }

}
