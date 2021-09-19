/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currentA = headA;
        ListNode currentB = headB;
        
        int counter1 = 0;
        while(currentA != null) {
            counter1++;
            currentA = currentA.next;
        }
        
        int counter2 = 0;
        while(currentB != null) {
            counter2++;
            currentB = currentB.next;
        }
        
        currentA = headA;
        currentB = headB;
        if(counter1 > counter2) {
            int diff = counter1 - counter2;
            
            while(diff > 0) {
                currentA = currentA.next;
                diff--;
            }
            
            while(currentA != null && currentB != null) {
