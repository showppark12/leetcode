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
    public boolean hasCycle(ListNode head) {
        ListNode currentNode = head;
        List<ListNode> nodeList = new ArrayList<>();
        while(currentNode != null && currentNode.next != null){
            for (ListNode node : nodeList){
                if(currentNode.equals(node)){
                    return true;
                }
            }
            nodeList.add(currentNode);
            currentNode = currentNode.next;
        }
        return false;
    }
}