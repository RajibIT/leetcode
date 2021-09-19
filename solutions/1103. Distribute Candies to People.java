class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int i = 0;
        int n = 0;
        int k = 1;
        while(candies > 0){
            if(i == res.length) {
                n = k * num_people;
                k++;
                i = i % num_people;
            }
            int candy = i + 1 + n;
            
            if(candies >= candy){
                candies -= candy;
                res[i] += candy;
            }
            else{
                res[i] += candies;
                candies = 0;
            }
                
            i++;
        }
        return res;
    }
}
