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
    public boolean isPalindrome(ListNode head) {
        ListNode mid = mid(head);
        ListNode second = rev(mid.next);
        

        ListNode p1 = head;
        ListNode p2 = second;
        if(head==null || head.next==null){
            return true;
        }

        while(p2!=null){
            if(p1.val!=p2.val){
                return false;
            }
            p1=p1.next;
            p2=p2.next;
        }
        return true;
    }
    public ListNode mid(ListNode head){
        ListNode s = head;
        ListNode f= head;
        while(f.next!=null && f.next.next!=null){
            s= s.next;
            f=f.next.next;
        }
        return s;
    }
    public ListNode rev(ListNode h){
        ListNode prev=null;
        ListNode curr = h;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}