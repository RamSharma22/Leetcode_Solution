
 
class Solution {
    public ListNode rotateRight(ListNode h, int k) {
        ListNode n = new ListNode();
        if(h == null){
            return null;
        }
        n.next = h;
        ListNode t = h;
        ListNode r = h;
        int m = 1;
        while(t.next != null){
            t = t.next;
            m += 1;
        }
        t.next = h;
        k %= m;
        for(int i = 0;i < m - k-1;i++){
            r = r.next;
        }
        n.next = r.next;
        r.next = null;
        return n.next;
    }
}