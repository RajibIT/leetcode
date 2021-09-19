class Solution {
    public String longestPalindrome(String s) {
        int len = Integer.MIN_VALUE;
        String  str = "";
        for(int i = 0; i < s.length(); i++) {
            int len1 = getPalindromSize(s, i, i);
            int len2 = getPalindromSize(s, i, i + 1);
            
            if(len < len1) {
                len = Math.max(len, len1);
                str = s.substring(i - len / 2, i + len / 2 + 1);
            }
            if(len < len2) {
                len = Math.max(len, len2);
                str = s.substring(i - len / 2 + 1, i + len / 2 + 1);
            }
        }
        return str;
        
    }
    public int getPalindromSize(String str, int left, int right) {
        while(left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return right - (left + 1);
    }
}
