class Solution {
    public boolean detectCapitalUse(String word) {
        
        return pattern1(word);
    }
    public boolean pattern1(String word) {
        
        for(int i = 0; i < word.length(); i++) {
            
            if(i == 0 && 97 <= word.charAt(i) && word.charAt(i) <= 122) {
                
                return pattern2(word, i + 1);
                
            }else if(i == 1 && 97 <= word.charAt(i) && word.charAt(i) <= 122) {
                
                return pattern3(word, i + 1);
            
            }else if(i > 1 && 97 <= word.charAt(i) && word.charAt(i) <= 122) {
                
                return false;
            }
        }
        return true;
    }
    public boolean pattern2(String word, int idx) {
        
        for(int i = idx; i < word.length(); i++) {
            
            if(65 <= word.charAt(i) && word.charAt(i) <= 90) {
                
                return false;
            }
        }
        return true;
    }
    public boolean pattern3(String word, int idx) {
        
        for(int i = idx; i < word.length(); i++) {
            
