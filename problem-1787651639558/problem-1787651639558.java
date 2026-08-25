// Last updated: 8/25/2026, 3:23:59 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13        ListNode dummy = new ListNode(0);
14        dummy.next = head;
15
16        int len = 0;
17
18        ListNode l = head;
19
20        while( l != null){
21            len = len + 1;
22            l = l.next;
23        }
24
25        int d = len - n + 1;
26 
27        ListNode prev = dummy;
28        ListNode curr = head;
29        
30
31        int i = 0;
32
33        while(i <(d-1)){
34            curr = curr.next;
35            prev = prev.next;
36            i = i + 1;
37        } 
38
39        prev.next = prev.next.next;
40
41        return dummy.next;
42        
43    }
44}