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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode node = head;
        int size = 0;
        while(node != null) {
            size++;
            node = node.next;
        }
        
        int divide = size / 2;
        
        int count = 1;
        if(size % 2 == 0) {
            
            
            ListNode t = head;
            
            while(t != null && count != divide) {
                count++;
                t = t.next;
            }
            
            ListNode temp1 = reverse(t.next);
            t.next = null;
            return checkPalindrome(temp1,head);
        }else{
            ListNode t = head;
            while(t != null && count != divide) {
