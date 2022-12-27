package lce_easy_int;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SingleNumber {

	public static void main(String[] args) {
		int[] nums= {4,1,2,1,2};
System.out.println(singleNumber(nums));
	}
	 public static int singleNumber(int[] nums) {
		 if(nums.length==1) {
			 return nums[0];
		 }
		 Set<Integer> uniqueSet=new HashSet<>();
		 for(int i=0;i<nums.length;i++) {
			 if(uniqueSet.contains(nums[i])) {
				 uniqueSet.remove(nums[i]);
			 }else {
				 uniqueSet.add(nums[i]);
			 }
		 }
		return uniqueSet.iterator().next();   
	    }

}
