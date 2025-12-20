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
    public ListNode middleNode(ListNode head) {
        ListNode node = head;
        int size=0;
        while(node != null){
            size++;
            node = node.next;
        }
        int idx= size/2;
        ListNode ans =getNode(head,idx);
        return ans;
    }
    public ListNode getNode(ListNode head, int index){
        ListNode node  = head;
        for(int i=0;i<index;i++){
            node = node.next;
        }
        return node;
    }
}