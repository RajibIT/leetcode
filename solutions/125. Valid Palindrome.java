import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Solution {
    public boolean isPalindrome(String s) {
        List<Character> ch = new ArrayList<>();
        s= s.toLowerCase();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c > 96 && c < 123 || c > 47 && c < 58)
                ch.add(c);
        }
        
        
        
        return checkPalindrome(ch, 0, ch.size() - 1);
    }
    public boolean checkPalindrome(List<Character> ch, int left, int right) {
        
        while(left < right) {
            
            if(ch.get(left) != ch.get(right)) return false;
            left++;right--;
            
        }
        return true;
    }
}
