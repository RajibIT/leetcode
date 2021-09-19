class Solution {
    public int findMinFibonacciNumbers(int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int val1 = 1;
        int val2 = 1;
        list.add(val1); list.add(val2);
        while(val2 <= k) {
            int temp = val2;
            val2 = val1 + val2;
            list.add(val2);
            val1 = temp;
        }
        int count = 0;
        for(int i = list.size() - 1; i >= 0; i--){
            if(list.get(i) <= k) {
                k = k - list.get(i);
                count++;
            }
        }
        return count;
    }
    
}
