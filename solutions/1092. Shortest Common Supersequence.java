class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        int[][] dp = new int[m + 1][n + 1];
        for(int i = 1; i < m + 1; i++) {
            for(int j = 1; j < n + 1; j++) {
                if(str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        String str = buildSequence(dp, str1);
        int p1 = 0; int p2 = 0;
        int p3 = 0;
        ArrayList<Character> shortestCommon = new ArrayList<>();
        while(p1 < m && p2 < n && p3 < str.length()) {
            while(str1.charAt(p1) != str.charAt(p3)){
                shortestCommon.add(str1.charAt(p1));
                p1++;
            }
            while(str2.charAt(p2) != str.charAt(p3)){
                shortestCommon.add(str2.charAt(p2));
                p2++;
            }
            shortestCommon.add(str.charAt(p3));
            p3++;
            p1++;
            p2++;
        }
        while(p1 < m){
            shortestCommon.add(str1.charAt(p1));
            p1++;
        }
        while(p2 < n){
            shortestCommon.add(str2.charAt(p2));
            p2++;
