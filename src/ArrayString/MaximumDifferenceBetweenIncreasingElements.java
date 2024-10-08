//Given a 0-indexed integer array nums of size n, find the maximum difference between nums[i] and nums[j] 
//		(i.e., nums[j] - nums[i]), such that 0 <= i < j < n and nums[i] < nums[j].
//
//Return the maximum difference. If no such i and j exists, return -1.
//
// 
//
//Example 1:
//
//Input: nums = [7,1,5,4]
//Output: 4
//Explanation:
//The maximum difference occurs with i = 1 and j = 2, nums[j] - nums[i] = 5 - 1 = 4.
//Note that with i = 1 and j = 0, the difference nums[j] - nums[i] = 7 - 1 = 6, but i > j, so it is not valid.
//Example 2:
//
//Input: nums = [9,4,3,2]
//Output: -1
//Explanation:
//There is no i and j such that i < j and nums[i] < nums[j].
//Example 3:
//
//Input: nums = [1,5,2,10]
//Output: 9
//Explanation:
//The maximum difference occurs with i = 0 and j = 3, nums[j] - nums[i] = 10 - 1 = 9.

package ArrayString;

public class MaximumDifferenceBetweenIncreasingElements {
    public int maximumDifference(int[] nums) {
    	int ans = -1;
    	int[] maxRight = new int[nums.length];
    	maxRight[maxRight.length-1] = nums[nums.length-1];
    	System.out.println(maxRight[1]);
    	for (int i = nums.length -2; i > 0; i--)
    	{
    		maxRight[i] = Math.max(nums[i], maxRight[i+1]);
    	}
    	for (int i = 0; i < nums.length-1; i++)
    	{
    		System.out.println(maxRight[i+1] + " > " +nums[i]);
    		if (maxRight[i+1] > nums[i])
    		{
    			ans = Math.max(ans, maxRight[i+1]-nums[i]);
    		}
    	}
        return ans;
    }
    
//    public int maximumDifference(int[] nums) {
//        int ans = -1;
//        int min = nums[0];
//
//        for (int i = 1; i < nums.length; ++i) {
//          if (nums[i] > min)
//            ans = Math.max(ans, nums[i] - min);
//          min = Math.min(min, nums[i]);
//        }
//
//        return ans;
//      }
    
    public static void main(String[] args)
    {
    	MaximumDifferenceBetweenIncreasingElements md = new MaximumDifferenceBetweenIncreasingElements();
    	int[] arr = {1,2};
    	System.out.println(md.maximumDifference(arr));
    }
}
