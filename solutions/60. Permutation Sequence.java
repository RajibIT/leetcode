class Solution {
    public String getPermutation(int A, int B) {
        int[] arr = new int[A];
        for(int i = 0; i < A; i++) {
            arr[i] = i + 1;
        }
        if(B == 1){
            String str = "";
            for(int i = 0; i < A; i++) {
                str += arr[i];
            }
            return str;
        }
        int fact = factorial(A);
        int k = 1;
        while(fact > 1) {
            int i = A - 2;
            while(i >= 0 && arr[i] >= arr[i + 1]) {
                i--;
            }
            int j = i + 1;
            while(j < A && arr[i] < arr[j]) {
                j++;
            }
            swap(arr, i, j - 1);
            reverse(arr, i + 1);
            fact--;
            k++;
            if(B == k) {
                break;
            }
        }
        String str = "";
        for(int i = 0; i < arr.length; i++) {
            str += arr[i];
        }
        return str;
    }
    public void swap(int[] arr, int left, int right) {
