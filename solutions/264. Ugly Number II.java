class Solution {
    public int nthUglyNumber(int n) {
        
        ArrayList<Integer> res = new ArrayList<>();
        int i2 = 2, i3 = 3, i5 = 5;
        int i = 0, j = 0, k = 0;
        
        res.add(1);
        while(res.size() < n) {
            int ugly2 = i2 * res.get(i);
            int ugly3 = i3 * res.get(j);
            int ugly5 = i5 * res.get(k);
            int min = Math.min(Math.min(ugly2, ugly3), ugly5);
            res.add(min);
            if(min == ugly2) {
                i++;
            }
            if(min == ugly3) {
                j++;
            }
            if(min == ugly5){
                k++;
            }
        }
        return res.get(res.size() - 1);
    }
}
