/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head ==null || head.next == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode start = head;
        
        while(fast != null && fast.next != null){
            ListNode cross = null;
            if (slow.next.equals(fast.next.next)){
                cross = slow.next;
                if (cross.equals(head)){
                    return cross;
                }
                while(true){
                    if(cross.next.equals(start.next)){
                        return cross.next;
                    }
                    cross = cross.next;
                    start = start.next;
                }
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return null;
    }
}
    