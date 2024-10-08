//Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.
//
// 
//
//Example 1:
//
//Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
//Output: [[1,6],[8,10],[15,18]]
//Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
//Example 2:
//
//Input: intervals = [[1,4],[4,5]]
//Output: [[1,5]]
//Explanation: Intervals [1,4] and [4,5] are considered overlapping.

package Intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
    	List<int[]> ans = new ArrayList<>();
    	
    	Arrays.sort(intervals, (a,b) -> (a[0] - b[0]));
    	
    	for (int[] i : intervals) {
    		if (ans.isEmpty() || ans.get(ans.size()-1)[1] < i[0]) {
    			ans.add(i);
    		}
    		else {
    			ans.get(ans.size()-1)[1] = Math.max(ans.get(ans.size()-1)[1], i[1]);
    		}
    	}
    	
    	return ans.toArray(int[][]::new);
    }
}
