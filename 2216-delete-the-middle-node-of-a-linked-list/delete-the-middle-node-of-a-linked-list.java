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
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if(head==null || count(head)==1){
            return null;
        }
        if(count(head)%2==0){
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        }
        else{
            ListNode n = new ListNode();
            n.next = head;
            slow = n;
            while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        }

        return head;

    }
    public static int count(ListNode head){
        ListNode temp = head;
        int c=1;
        while(temp.next!=null){
            temp = temp.next;
            c++;
        }
        return c;
    }
}