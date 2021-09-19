class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        char[] ch1 = new char[s1.length()];
        for(int i = 0; i < ch1.length; i++) {ch1[i] = s1.charAt(i);}
        char[] ch2 = new char[s2.length()];
        for(int i = 0; i < ch2.length; i++) {ch2[i] = s2.charAt(i);}
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        int i = 0;
        while(i < ch1.length && ch1[i] >= ch2[i]){i++;}
        if(i == ch1.length) return true;
        i = 0;
        while(i < ch2.length && ch2[i] >= ch1[i]){i++;}
        if(i == ch2.length) return true;
        return false;
    }
}
