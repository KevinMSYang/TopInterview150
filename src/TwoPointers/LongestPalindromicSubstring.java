//Given a string s, return the longest 
//palindromic
// 
//substring
// in s.
//
// 
//
//Example 1:
//
//Input: s = "babad"
//Output: "bab"
//Explanation: "aba" is also a valid answer.
//Example 2:
//
//Input: s = "cbbd"
//Output: "bb"

package TwoPointers;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s.length() == 1) {
        	return s;
        }
        StringBuilder sb = new StringBuilder(s);
        int l = 0;
        int r = s.length()-1;
        while ( l < r) {
        	if (isPalindrom(sb.toString())) {
        		return sb.toString();
        	}
        	if () {
        		r--;
        	}
        	else {
        		l++;
        	}
        }
    }
    
    private boolean isPalindrom(String s) {
    	StringBuilder sb = new StringBuilder(s);
    	if (sb.reverse().toString().equals(s)) {
    		return true;
    	}
    	return false;
    }
    
//    public String longestPalindrome(String s) {
//        if (s.isEmpty())
//          return "";
//
//        // (start, end) indices of the longest palindrome in s
//        int[] indices = {0, 0};
//
//        for (int i = 0; i < s.length(); ++i) {
//          int[] indices1 = extend(s, i, i);
//          if (indices1[1] - indices1[0] > indices[1] - indices[0])
//            indices = indices1;
//          if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
//            int[] indices2 = extend(s, i, i + 1);
//            if (indices2[1] - indices2[0] > indices[1] - indices[0])
//              indices = indices2;
//          }
//        }
//
//        return s.substring(indices[0], indices[1] + 1);
//      }
//
//      // Returns the (start, end) indices of the longest palindrome extended from
//      // the substring s[i..j].
//      private int[] extend(final String s, int i, int j) {
//        for (; i >= 0 && j < s.length(); --i, ++j)
//          if (s.charAt(i) != s.charAt(j))
//            break;
//        return new int[] {i + 1, j - 1};
//      }
}
