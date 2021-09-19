class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i = 0; i < accounts.length; i++) {
            max = Math.max(max, sumOfRow(i, accounts));
        }
        return max;
    }
    public int sumOfRow(int row, int[][] accounts) {
        int sum = 0;
        for(int i = 0; i < accounts[row].length; i++) {
            sum += accounts[row][i];
        }
        return sum;
    }
}
