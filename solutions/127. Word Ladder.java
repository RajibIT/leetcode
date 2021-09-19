class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int count = 0;
        Set<String> set = new HashSet<String>();
        for(int i = 0; i < wordList.size(); i++) {
            if(beginWord.equals(wordList.get(i)))
                continue;
            if(endWord.equals(wordList.get(i))) {
                count++;
            }
            set.add(wordList.get(i));
        }
        if(count == 0) {
            return 0;
        }
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int dist = 0;
        String current = "";
        while(!queue.isEmpty()) {
                dist++;
                int q_size = queue.size();
                while(q_size-->0) {
                    current = queue.poll();
                    List<String> list = getStrings(current, set);
                    
                    for(String st : list) {
                        if(st.equals(endWord)){
                            return dist + 1;
                        }
                        set.remove(st);
                        queue.add(st);
                    }
                } 
            }
        
        return current.equals(endWord) ? dist : 0;
    }
    public List<String> getStrings(String current, Set<String> set) {
