class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> answer = new ArrayList<Boolean>();
        int i = 0, j = 0;
        while(i < l.length){
            
            int k = 0;
            
            int[] arith = new int[r[j]+1 - l[i]];
            for(int n = l[i]; n < r[j] + 1; n++){
                if(k < arith.length)
                    arith[k++] = nums[n];
            }
            Arrays.sort(arith);
            int diff = arith[1] - arith[0];
            int m = 1;
            boolean sequence = true;
            while(m < arith.length - 1){
                if((arith[m + 1] - arith[m]) != diff){
                    sequence = false;
                }
                m++;
            }
            answer.add(sequence);
            i++; j++;
                
        }
        return answer;
    }
}
