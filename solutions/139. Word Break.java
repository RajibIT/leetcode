class Solution {
    public boolean wordBreak(String str, List<String> wordDict) {
            HashMap<Integer, Boolean> table = new HashMap<>(16);
            table.put(str.length(), true);
            return recurse(0, str, wordDict, table);
        }
​
        private static boolean recurse(int startIdx, String str, List<String> words, HashMap<Integer, Boolean> table) {
            if (table.containsKey(startIdx)) {
                return table.get(startIdx);
            }
            if (startIdx >= str.length()) {
                return true;
            }
            boolean wordBreak = false;
            for (String word : words) {
                if (!str.startsWith(word, startIdx)) {
                    continue;
                }
                int newStartIdx = startIdx + word.length();
                wordBreak = wordBreak || recurse(newStartIdx, str, words, table);
            }
            table.put(startIdx, wordBreak);
            return wordBreak;
        }
}
