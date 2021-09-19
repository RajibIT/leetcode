class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()+1][word2.length()+1];
        dp[0][0]=0;
        int[] first_word = new int[word1.length()+1];
        int[] convert_word = new int[word2.length()+1];
        first_word[0] = 0;
        convert_word[0] = 0;
        for(int i=0; i<word1.length();i++){
            first_word[i+1] = word1.charAt(i);
        }
        for(int i=0; i<word2.length();i++){
            convert_word[i+1] = word2.charAt(i);
        }
        
        for(int i=1;i<first_word.length;i++){
            dp[i][0]=i;
        }
        
        for(int i=1;i<convert_word.length;i++){
            dp[0][i]=i;
        }
        for(int i=1;i<first_word.length;i++){
            for(int j=1;j<convert_word.length;j++){
                //if(i==0) dp[i][j]=j;
                //else if(j==0) dp[i][j]=i;
                if(first_word[i] == convert_word[j]){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.min(dp[i][j-1], Math.min(dp[i-1][j-1],dp[i-1][j]))+1;
                }
            }
        }
        return dp[word1.length()][word2.length()];
    }
}
