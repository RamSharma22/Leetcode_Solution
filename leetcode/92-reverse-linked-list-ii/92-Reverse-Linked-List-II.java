/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode h, int l, int r) {
        if(h == null|| l == r){
            return h;
        }
        ListNode d = new ListNode(0);
        d.next = h;
        ListNode p = d;
        for(int i = 1;i < l;i++){
            p = p.next;
        }
        ListNode c = p.next;
        for(int i = 0;i < r-l;i++){
            ListNode n = c.next;
            c.next = n.next;
            n.next = p.next;
            p.next = n;
        }
        return d.next;
    }
}