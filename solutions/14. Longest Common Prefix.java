class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String res = strs[0];
        for(String str : strs) {
            if(str.length() < res.length()) {
                res = str;
            }
        }
        for(String str : strs) {
            if(res.equals("")) return "";
            while(!str.startsWith(res)) {
                res = res.substring(0, res.length() - 1);
            }
        }
        return res;
    }
}
