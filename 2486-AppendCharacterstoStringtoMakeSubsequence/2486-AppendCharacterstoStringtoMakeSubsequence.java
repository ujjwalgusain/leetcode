// Last updated: 8/27/2026, 3:31:17 PM
1class Solution {
2    public int appendCharacters(String s, String t) {
3        int i = 0,
4        j = 0;
5
6        while(i < s.length() && j < t.length()){
7            if(s.charAt(i) == t.charAt(j)){
8                j = j+ 1;
9            }
10            i = i + 1;
11        }
12
13        return t.length() - j;
14        
15    }
16}