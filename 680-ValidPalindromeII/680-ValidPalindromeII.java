// Last updated: 8/20/2026, 2:08:31 PM
1class Solution {
2    public boolean palindromeHelper(int i, int j, String s){
3        while (i < j){
4            if (s.charAt(i) != s.charAt(j)){
5                return false;
6            }else {
7                i = i+1;
8                j = j-1;
9            }
10        }
11        return true;
12    }
13    public boolean validPalindrome(String s) {
14        int i = 0;
15        int j = s.length() -1;
16
17        while(i<j){
18            int left = s.charAt(i);
19            int right = s.charAt(j);
20            if(left != right){
21
22               return palindromeHelper(i+1, j, s) || palindromeHelper(i, j-1, s);
23
24            }else{
25                i = i + 1;
26                j = j - 1;
27            }
28        }
29        return true;
30    }
31}