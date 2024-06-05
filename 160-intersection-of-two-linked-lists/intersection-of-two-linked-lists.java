/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();
        if(headA==null || headB==null){
            return null;
        }
        set.add(headA);
        while(headA.next!=null){
            headA=headA.next;
             set.add(headA);
        }
        if(set.contains(headB)){
                return headB;
            }
        while(headB.next!=null){
            headB=headB.next;
            if(set.contains(headB)){
                return headB;
            }
        }
        return null;
    }
}