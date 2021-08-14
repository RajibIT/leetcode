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
    public ListNode deleteDuplicates(ListNode head) {
        /*if(head == null || head.next == null) 
            return head;
        ListNode node = head;
        ListNode prev = head;
        
        while(node != null) {
            
            if(node.val != prev.val) {
                prev.next = node;
                prev = node;
            }
            node = node.next;
        }
        prev.next = node;
        return head;*/
        if(head == null || head.next == null) 
            return head;
        ListNode node = head;
        while(node != null) {
            ListNode prev = node;
            while(prev != null && prev.val == node.val) {
                prev = prev.next;
            }
            node.next = prev;
            node = prev;
        }
        return head;
    }
}
