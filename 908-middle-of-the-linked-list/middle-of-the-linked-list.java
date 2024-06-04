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
    public ListNode middleNode(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode slow =head;
        ListNode fast = head;
        if(count(head)%2==1){
            while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
       }
        else{
            while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = slow.next;
        }
        return slow;
    }
    public int count(ListNode head){
        int c=1;
        while(head.next!=null){
            head=head.next;
            c++;
        }
        return c;
    }
}