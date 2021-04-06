package cdexer;

public class OneDArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OneDArraySum p = new OneDArraySum();
		int[] nums = { 2, 3, 5, 7 };
		System.out.println(p.runningSum(nums));
	}

	public int[] runningSum(int[] nums) {
		int[] result = new int[nums.length];

		// Initialize first element of result array with first element in nums.
		result[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			// Result at index `i` is sum of result at `i-1` and element at `i`.
			result[i] = result[i - 1] + nums[i];
		}
		return result;
	}
}
