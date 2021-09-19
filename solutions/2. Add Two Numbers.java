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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list = l1;
        ListNode prev = null;
        int carry = 0;
        while(l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carry;
            carry = sum / 10;
            int remainder = sum % 10;
            l1.val = remainder;
            prev = l1;
            l1 = l1.next;
            l2 = l2.next;
        }
        
        if(l2 != null) {
            prev.next = l2;
            l1 = l2;
        }
            
        while(l1 != null) {
            int sum = l1.val + carry;
            carry = sum / 10;
            int remainder = sum % 10;
            l1.val = remainder;
            prev = l1;
            l1 = l1.next;
        }
        if(carry != 0) prev.next = new ListNode(carry);
