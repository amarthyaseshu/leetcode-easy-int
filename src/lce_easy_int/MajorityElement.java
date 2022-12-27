package lce_easy_int;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
		System.out.println(majorityElement(nums));

	}

	public static int majorityElement(int[] nums) {
		Map<Integer, Integer> elemCountMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (elemCountMap.containsKey(nums[i])) {
				elemCountMap.put(nums[i], elemCountMap.get(nums[i]) + 1);
			} else {
				elemCountMap.put(nums[i], 1);
			}
		}
		return elemCountMap.entrySet().stream().filter(e -> e.getValue() > (nums.length / 2)).findFirst().get()
				.getKey();

	}

}
