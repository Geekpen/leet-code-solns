package TwoSums;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumsSoln {

	public static void main(String[] args) {
		int[] myVars = {2, 7, 11, 15};
		
		System.out.println(Arrays.toString(twoSum(myVars, 13)));

	}
	
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i = 0; i < nums.length; i++) {
		int complement = target - nums[i];
			if(map.containsKey(complement)) {
				return new int[] {map.get(complement), i};
			}
			map.put(nums[i], i);
		}
		
		throw new IllegalArgumentException("Sum not found");
		//throw     IllegalArguementException("Sum not found");
	}

}
