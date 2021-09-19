class Solution {
    public String simplifyPath(String path) {
        String[] str = path.split("/");
        Stack<String> stack = new Stack<>();
        for(String st : str) {
            if(st.equals(""))
                continue;
            if(st.equals("."))
                continue;
            if(st.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
                continue;
            }
            if(st.equals("...")) {
                stack.push(st);
                continue;
            }
            if(st.equals("....")) {
                stack.push(st);
                continue;
            }
            stack.push(st);
        }
        StringBuilder sb = new StringBuilder();
        if(stack.isEmpty()){
            sb.append("/");
        }
        while(!stack.isEmpty()) {
            sb.insert(0, "/" + stack.pop());
        }
        return sb.toString();
    }
}
