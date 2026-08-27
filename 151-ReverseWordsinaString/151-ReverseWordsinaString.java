// Last updated: 8/27/2026, 5:16:21 PM
1class Solution {
2    public String reverseWords(String s) {
3        String trim = s.trim();
4
5        String [] arr = trim.split("\\s+");
6
7        int i = 0;
8        int j = arr.length - 1;
9
10        while(i < j ){
11            String temp = arr[i];
12            arr[i] = arr[j];
13            arr[j] = temp;
14
15            i = i + 1;
16            j = j - 1;
17        }
18
19        return String.join(" ", arr);
20
21
22        
23    }
24}