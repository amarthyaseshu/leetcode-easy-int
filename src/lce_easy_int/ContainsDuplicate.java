package lce_easy_int;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums = { 1,1,1,3,3,4,3,2,4,2 };
		System.out.println(containsDuplicate(nums));
	}

	public static boolean containsDuplicate(int[] nums) {
		Set<Integer> numsSet = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (numsSet.contains(nums[i])) {
				return true;
			} else {
				numsSet.add(nums[i]);
			}
		}
		return false;
	}
}
