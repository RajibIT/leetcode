class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new String[][];
        if(str.length() == 0) return res;
        if(str.length() == 1) {
         res[0] = strs;   
        } 
        Map<String, ArrayList<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length(); i++) {
            Char ch[] = strs.get(i).toCharArray();
            Arrays.sort(ch);
            String s = Character.toString(ch);
            if(map.containsKey(s)) {
                map.get(s).add(strs.get(i));
            }else{
                List<String> list = new ArrayList<String>();
                list.add(strs.get(i));
                map.put(s, list);
            } 
        }
        for(List<String> list : map.getValues()) {
            res.add(list);
        }
        return res;
    }
    
}
