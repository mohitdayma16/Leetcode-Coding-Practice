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
    public ListNode deleteDuplicates(ListNode head) {
        if(head ==null){
            return null;
        }

        ListNode dummy = head;
        ListNode curr = head.next;
        while(curr !=null){
            if(dummy.val == curr.val){
                curr = curr.next;
                dummy.next = curr;
            }
            else{
                curr = curr.next;
                dummy = dummy.next;
            }
        }
        return head;
    }
}