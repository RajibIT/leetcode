class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatestCandies = 0;
        for(int i = 0; i < candies.length; i++) {
            if(candies[i] > greatestCandies) {
                greatestCandies = candies[i];
            }
        }
        List<Boolean> res = new ArrayList<>();
        for(int i = 0; i < candies.length; i++) {
            if(greatestCandies <= candies[i] + extraCandies) {
                res.add(true);
            }else{
                res.add(false);
            }
            
        }
        return res;
    }
}
