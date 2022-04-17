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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode curr = null;
        
        boolean flag = false;
        while(true){
            int t1;
            int t2;
            
            if (l1 != null){
                t1 = l1.val;
                l1 = l1.next;
            } else {
                t1 = 0;
            }
            
            if (l2 != null){
                t2 = l2.val;
                l2 = l2.next;
            } else {
                t2 = 0;
            }
            
            int sum;
            if (flag) {
                sum = t1 + t2 + 1;
            } else {
                sum = t1 + t2;
            }
            
            if (sum >= 10){
                flag = true;
                sum = sum % 10;
            } else {
                flag = false;
            }
            
            if (head == null){
                head = new ListNode(sum);
                curr = head;
            } else {
                curr.next = new ListNode(sum);
                curr = curr.next;
            }
            
            if ( l1 == null && l2 == null) {
                if (flag) {
                    curr.next = new ListNode(1);
                }
                break;
            }
        }
        return head;
    }
}