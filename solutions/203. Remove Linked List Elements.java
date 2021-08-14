/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode node = head;
        ListNode prev = head;
        ListNode res = prev;
        while(node != null) {
            
            if(node.val == val) {
                if(node == head) {
                    head = head.next;
                    prev = head;
                    
                    
                }
                else if(prev != null)
                    prev.next = node.next;
                 
            }else
                prev = node;
            node = node.next;
        }
        return head;
        
    }
}
