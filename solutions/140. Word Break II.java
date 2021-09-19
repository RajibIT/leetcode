class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
            List<String> res = new ArrayList<>();
            
            constructSentences(0, s, wordDict, res, new ArrayList<>());
            Collections.sort(res);
            return res;
    }
    public static void constructSentences(int startIdx, String str, List<String> dict, List<String> res, ArrayList<String> sb) {
            if(startIdx == str.length() ) {
                res.add(String.join(" ", sb));
                return;
            }
            
            
           
            for(String word : dict) {
                if(!str. startsWith(word, startIdx)) continue;
                sb.add(word);
                constructSentences(startIdx + word.length(), str, dict, res, sb);
                sb.remove(sb.size() - 1);
            }
            
            
            return;
        }
    
}
​
​
