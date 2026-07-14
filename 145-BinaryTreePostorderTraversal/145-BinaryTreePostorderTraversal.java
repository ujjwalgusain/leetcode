// Last updated: 7/14/2026, 12:37:15 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<Integer> postorderTraversal(TreeNode root) {
18        List<Integer> result = new ArrayList<>();
19        postorder(root, result);
20        return result;
21    }
22     private void postorder(TreeNode node, List<Integer> result) {
23        if (node == null) {
24            return;
25        }
26
27       
28        postorder(node.left, result);   // Left
29        postorder(node.right, result);  // Right
30        result.add(node.val);
31
32     }
33    
34
35}