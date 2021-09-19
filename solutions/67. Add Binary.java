class Solution {
    public String addBinary(String a, String b) {
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, 0);
        map.put(1, 1);
        map.put(2, 10);
        map.put(3, 11);
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        String res = "";
        while(i >= 0 &&  j >= 0) {
            int val1 = Integer.parseInt(a.substring(i, i + 1));
            int val2 = Integer.parseInt(b.substring(j, j + 1));
            int temp = val1 + val2 + carry;
            int val = map.get(temp);
            carry = val / 10;
            res = val % 10 + res;
            i--; j--;
        }
        
        while(i >= 0) {
            int val1 = Integer.parseInt(a.substring(i, i + 1));
            int temp = val1 + carry;
            int val = map.get(temp);
            carry = val / 10;
            res = val % 10 + res;
            i--;
        }
        while(j >= 0) {
            int val1 = Integer.parseInt(b.substring(j, j + 1));
            int temp = val1 + carry;
            int val = map.get(temp);
            carry = val / 10;
            res = val % 10 + res;
            j--;
        }
        if(carry != 0) {
