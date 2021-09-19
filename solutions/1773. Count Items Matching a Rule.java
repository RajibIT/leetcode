class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        HashMap<String, List<String>> map = new HashMap<>();
        map.put("type", new ArrayList<String>());
        map.put("color", new ArrayList<String>());
        map.put("name", new ArrayList<String>());
        for(List<String> list : items) {
            map.get("type").add(list.get(0));
            map.get("color").add(list.get(1));
            map.get("name").add(list.get(2));
        }
        List<String> list = map.get(ruleKey);
        int count = 0;
        if(list.contains(ruleValue)) {
            
            for(int index = 0; index < list.size(); index++) {
                if(list.get(index).equals(ruleValue)) {
                    count++;
                }
            }
        }
        return count;
        
        
    }
}
