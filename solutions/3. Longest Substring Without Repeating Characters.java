class Solution {
    public int lengthOfLongestSubstring(String s) {
        /*if(s.length() == 0) 
            return 0;
        if(s.length() == 1) 
            return 1;
        int i = 0; 
        int j = 1;
        int maxLength = Integer.MIN_VALUE;
        while(j < s.length()) {
            for(int k = i; k < j; k++) {
                if(s.charAt(j) == s.charAt(k)) {
                    maxLength = Math.max(maxLength, j - i);
                    i = k + 1;
                    break;
                }    
            }
            j++;
        }
        maxLength = Math.max(maxLength, j - i);
        return maxLength;*/
        if(s.length() == 0) 
            return 0;
        int i = 0;
        int j = 0;
        int maxLength = Integer.MIN_VALUE;
        LinkedHashSet<Character> char_hashset = new LinkedHashSet<>();
        while(j < s.length()) {
            if(!char_hashset.contains(s.charAt(j))) {
                char_hashset.add(s.charAt(j));
                j++;
                maxLength = Math.max(maxLength, char_hashset.size());
            }else{
                char_hashset.remove(s.charAt(i));
                i++;
            }
        }
        return maxLength;
    }
