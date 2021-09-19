class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>(); 
        helper(0, s, new ArrayList<>(), res);
        return res;
    }
    public void helper(int idx, String str, List<String> current, List<List<String>> res) {
        if(idx >= str.length()) {
            res.add(new ArrayList<String>(current));
            return;
        }
        for(int i = idx; i < str.length(); i++) {
            String s = str.substring(idx, i + 1);
            if(isPalindrome(s)) {
                current.add(s);
                helper(i + 1, str, current, res);
                current.remove(current.size() - 1);
            }
        }
        return;
    }
    public boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
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
