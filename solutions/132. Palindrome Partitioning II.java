class Solution {
    public int minCut(String s) {
        if(isPalindrome(0, s.length() - 1, s))
            return 0;
        int[] dp = new int[s.length() + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        
        for(int right = 1; right <= s.length(); right++) {
            for(int left = right - 1; left >= 0; left--) {
                if(isPalindrome(left, right - 1, s)) {
                    dp[right] = Math.min(dp[right], dp[left] + 1);
                }
            }
        }
        return dp[s.length()] -1;
    }
    public boolean isPalindrome(int left, int right, String str) {
        while(left < right) {
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
