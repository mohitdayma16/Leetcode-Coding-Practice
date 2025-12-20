/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode list1 = headA;
        ListNode list2 = headB;
        
        int size1=0;
        int size2 =0;
        while(list1 !=null){
            list1 = list1.next;
            size1++;
        }
        while(list2 !=null){
            list2 = list2.next;
            size2++;
        }
        ListNode listA = headA;
        ListNode listB = headB;
        if(size1>size2){
            while(size1 != size2){
                listA = listA.next;
                size1--;
            }
        }else{
            while(size2!=size1){
                listB = listB.next;
                size2--;
            }
        }

        for(int i=0;i<size1;i++){
            if(listA == listB){
                return listA;
            }
            listA = listA.next;
            listB = listB.next;
        }
        return null;

    }
}   