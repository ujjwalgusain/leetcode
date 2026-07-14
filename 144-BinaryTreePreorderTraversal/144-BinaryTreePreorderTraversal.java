// Last updated: 7/14/2026, 12:32:29 PM
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
17    public List<Integer> preorderTraversal(TreeNode root) {
18        List<Integer> result = new ArrayList<>();
19        preorder(root, result);
20        return result;
21        
22    }
23
24     private void preorder(TreeNode node, List<Integer> result) {
25        if (node == null) {
26            return;
27        }
28
29        result.add(node.val);
30        preorder(node.left, result);   // Left
31        preorder(node.right, result);  // Right
32    }
33
34
35}