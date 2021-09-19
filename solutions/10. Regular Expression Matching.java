class Solution {
    public boolean isMatch(String s, String p) {
    
        boolean[][] dp = new boolean[s.length()+1][p.length()+1];
        char[] string = new char[s.length()+1];
        char[] pattern = new char[p.length()+1];
        string[0] = (char)0;
        pattern[0] = (char)0;
        for(int i=0;i<s.length(); i++){
            string[i+1]=s.charAt(i);
        }
        for(int i=0;i<p.length(); i++){
            pattern[i+1]=p.charAt(i);
        }
        dp[0][0] =true;
        for(int i=1; i<pattern.length; i++){
            if(pattern[i] == '*' && dp[0][i-2] == true){
                dp[0][i] = true;
            }
        }
        for(int i=1;i<string.length;i++){
            for(int j=1;j<pattern.length;j++){
                if(pattern[j] == string[i] || pattern[j] == '.'){
                    dp[i][j]=dp[i-1][j-1];
                }else if(pattern[j] == '*'){
                    if(pattern[j-1] == string[i] || pattern[j-1] == '.'){
                        dp[i][j] = dp[i][j-2] || dp[i-1][j];
                    }else{
                        dp[i][j] = dp[i][j-2];
                    }
                }
            }
        }
        return dp[string.length -1][pattern.length-1];
    }
}
​
​
    
