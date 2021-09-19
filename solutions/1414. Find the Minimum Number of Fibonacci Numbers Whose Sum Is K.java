class Solution {
    public int findMinFibonacciNumbers(int k) {
        List<Integer> list = new ArrayList<>();
        getFabonacci(list, k);
        
        int count = 0;
        for(int i = list.size() - 1; i >= 0; i--) {
            if(list.get(i) <= k) {
                k -= list.get(i);
                count++;
            }
        }
        return count;
    }
    public void getFabonacci(List<Integer> list, int k) {
        int val1 = 1; 
        list.add(val1);
        int val2 = 1;
        list.add(val2);
        
        while(true) {
            if(val2 > k){
                break;
            }
            int temp = val1 + val2;
            val1 = val2;
            val2 = temp;
            list.add(val1);
            //list.add(val2);
        }
    }
}
