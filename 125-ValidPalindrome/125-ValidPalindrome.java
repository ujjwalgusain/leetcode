// Last updated: 8/20/2026, 1:24:22 PM
1class Solution {
2    public boolean isPalindrome(String s) {
3        int i = 0;
4        int j = s.length() - 1;
5
6    while(i<j){
7    char left = s.charAt(i);
8    char right = s.charAt(j);
9
10    if (!Character.isLetterOrDigit(left)){
11        i = i+1;
12        continue;
13
14    }
15
16    if (!Character.isLetterOrDigit(right)){
17        j = j-1;
18        continue;
19    }
20
21    if(Character.toLowerCase(left)!= Character.toLowerCase(right)){
22        return false;
23    }
24
25    i = i+1;
26    j = j-1;
27
28    }
29
30    return true;
31
32    }
33       
34}