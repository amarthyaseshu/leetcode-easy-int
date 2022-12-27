package lce_easy_int;
import java.util.ArrayList;
import java.util.List;

public class MissingNumber {

	public static void main(String[] args) {
		int[] nums = {0, 1 };
		System.out.println(missingNumber(nums));

	}

	public static int missingNumber(int[] nums) {
		List<Integer> numbList = convertArrayToList(nums);
		for (int i = 0; i <= nums.length; i++) {
			if (!numbList.contains(i)) {
				return i;
			}
		}
		return 0;
	}

	private static List<Integer> convertArrayToList(int[] nums) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			list.add(nums[i]);
		}
		return list;
	}

}
