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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) {
            return head;
        }
        ListNode current = head;    
        int counter = 0;
    
        while (current != null) {
            counter++;
            current = current.next;
        }
        
​
        ListNode oddNode = head;
        ListNode nextNode = head.next;
        ListNode evenNode = head.next;
        if (counter % 2 == 0) {
            
            while(oddNode.next.next != null) {
                oddNode.next = oddNode.next.next;
                evenNode.next = evenNode.next.next;
                oddNode = oddNode.next;
                evenNode = evenNode.next;
​
            }
            oddNode.next = nextNode;
            
                
