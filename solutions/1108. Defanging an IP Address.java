class Solution {
    public String defangIPaddr(String address) {
        int i;
        StringBuilder sb = new StringBuilder();
        for(i = 0; i < address.length(); i++) {
            if(address.charAt(i) == '.'){
                sb.append("[.]");
                continue;
            }
            sb.append(address.substring(i, i + 1));
        }
        
        return sb.toString();
    }
}
