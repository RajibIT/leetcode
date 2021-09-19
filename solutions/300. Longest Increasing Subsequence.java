class Solution {
    public int lengthOfLIS(int[] array) {
        int[] sequences = new int[array.length];
        Arrays.fill(sequences, -1);
        int[] newArr = new int[array.length];
        int maxLen = 0;
        int idx = 0;
        for(int i = 1; i < array.length; i++) {
            for(int j = 0; j < i; j++) {
                if(array[j] < array[i]){
                    newArr[i] = Math.max(newArr[j] + 1, newArr[i]); 
                    sequences[i] = j;
                }
            }
            if(newArr[i] > maxLen) {
                maxLen = newArr[i];
                idx = i;
            }
        }
    //return buildSequences(sequences, array, idx);
        return maxLen + 1;
  }
    public static List<Integer> buildSequences(int[] sequences, int[] array, int idx) {
        List<Integer> res = new ArrayList<>();
        while(sequences[idx] != -1) {
            res.add(0, array[idx]);
            idx = sequences[idx];
        }
        res.add(0, array[idx]);
        return res;
    }
}
