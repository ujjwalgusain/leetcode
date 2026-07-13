// Last updated: 7/13/2026, 12:03:07 PM
1class Solution {
2
3    void fun(int open, int close, int n, String temp, List<String> res) {
4        if (open == n && close == n) {
5            res.add(temp);
6            return;
7        }
8
9        if (open < n) {
10            fun(open + 1, close, n, temp + "(", res);
11        }
12
13        if (close < open) {
14            fun(open, close + 1, n, temp + ")", res);
15        }
16    }
17
18    public List<String> generateParenthesis(int n) {
19        List<String> res = new ArrayList<>();
20        fun(0, 0, n, "", res);
21        return res;
22    }
23}