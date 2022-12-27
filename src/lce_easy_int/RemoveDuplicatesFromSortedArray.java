package lce_easy_int;
import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
	public static void main(String[] args) {
		int[] nums = { 1 };
		System.out.println(removeDuplicates(nums));
	}

	public static int removeDuplicates(int[] nums) {
		int firstNum = nums[0];
		int lastNum = nums[nums.length - 1];
		for (int i = 0; i <= (((nums.length - 1) < lastNum) ? nums.length - 1 : lastNum); i++) {
			nums[i] = firstNum;
			firstNum++;
		}
		System.out.println(Arrays.toString(nums));
		return (lastNum - nums[0]) + 1;

	}
}
