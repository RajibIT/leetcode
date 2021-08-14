class Solution {
    public int addDigits(int num) {
        int res = 0;
        int sum = 10;
        while(sum > 9){
            sum = 0;
            while(num > 0) {
                int remain = num % 10;
                sum += remain;;
                num = num / 10;
            }
            num = sum;
        }
        return num;
    }
}
