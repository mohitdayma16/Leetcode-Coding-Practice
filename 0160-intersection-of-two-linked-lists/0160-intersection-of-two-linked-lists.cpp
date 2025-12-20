/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        ListNode* temp1 = headA;
        ListNode* temp2 = headB;
        ListNode* vir1 = headA;
        ListNode* vir2 = headB;
        int size1 = 0, size2 = 0;
        while(temp1!=NULL){
            temp1 = temp1->next;
            size1++;
        }

        while(temp2!=NULL){
            temp2 = temp2->next;
            size2++;
        }
        
        int demo = 0;   

        if(size1>size2){
            demo = size1-size2;

            while(demo!=0){
                demo--;
                vir1 = vir1->next;
            }
        }
        else{
            demo = size2 - size1;
            while(demo!=0){
                demo--;
                vir2 = vir2->next;
            }
        }


       while (vir1 && vir2) {
            if (vir1 == vir2) return vir1;
            vir1 = vir1->next;
            vir2 = vir2->next;
        }

        return NULL;


        



    }
};