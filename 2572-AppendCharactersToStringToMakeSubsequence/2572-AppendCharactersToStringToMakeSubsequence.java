// Last updated: 8/27/2026, 3:31:37 PM
class Solution {
    public int appendCharacters(String s, String t) {
        int i = 0,
        j = 0;

        while(i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                j = j+ 1;
            }
            i = i + 1;
        }

        return t.length() - j;
        
    }
}