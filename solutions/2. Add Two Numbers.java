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
        int carry = 0;
        int counter1 = 0;
        ListNode current1 = l1;
        while(current1 != null) {
            counter1++;
            current1 = current1.next;
        }
        int counter2 = 0;
        ListNode current2 = l2;
        while(current2 != null) {
            counter2++;
            current2 = current2.next;
        }
        
        if(counter1 > counter2) {
            return addTwoListsNumber(l1, l2);
            
        }else{
            return addTwoListsNumber(l2, l1);
        }
        
        
    }
    public ListNode addTwoListsNumber(ListNode biggerList, ListNode smallerList) {
        int carry = 0;
        ListNode prev = null;
        ListNode bigList = biggerList;
