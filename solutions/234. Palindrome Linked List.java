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
                count++;
                t = t.next;
            }
            ListNode temp1 = reverse(t.next.next);
            t.next = null;
            return checkPalindrome(temp1, head);
        }
        
    }
    public boolean checkPalindrome(ListNode h1, ListNode h2) {
        while(h1 != null && h2 != null) {
            if(h1.val != h2.val) {
                return false;
            }
            h1 = h1.next;
            h2 = h2.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head) {
        ListNode node = head;
        ListNode prev = null;
        while(node != null) {
            ListNode t = node.next;
            node.next = prev;
            prev = node;
            node = t;
        }
        return prev;
    }
}
