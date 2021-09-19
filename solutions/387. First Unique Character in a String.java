class Solution {
    public int firstUniqChar(String s) {
        int[] char_arr = new int[26];
        for(int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if(Character.isLowerCase(ch))
                char_arr[ch - 'a']++;    
            //else
                //char_arr[ch - 'A']++;    
        }
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(char_arr[ch - 'a'] == 1) { // || char_arr[ch - 'A'] == 1) {
                return i;    
            }
        }
        return -1;
    }
}
