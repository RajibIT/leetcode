class Solution {
    public int maxDiff(int num) {
        if(num == 0){
            return 8;
        }
        String str = num + "";
        String str1 = "";
        int i = 0;
        while(i < str.length()){
            if(str.charAt(i) != '9'){
                str1= str.replaceAll(str.substring(i, i + 1), "9");
                break;
            }
                
            i++;
        }
        int a;
        if(!str1.equals(""))
            a = Integer.parseInt(str1);
        else
            a = Integer.parseInt(str);
        int j = 0;
        String str2 = "";
        
        while(j < str.length()){
            if(j == 0){
                if(str.charAt(j) != '1'){
                    str2 = str.replaceAll(str.substring(j, j + 1), "1");
                    break;
                }
            }else{
                if(str.charAt(j) != '0' && str.charAt(j) != '1'){
                    
                    str2 = str.replace(str.substring(j, j + 1), "0");
                    
                    break;
                }
            }
            j++;
