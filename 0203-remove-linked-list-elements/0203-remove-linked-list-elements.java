class Solution {
    public ListNode removeElements(ListNode head, int val) {

        // Handle head deletions
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode node = head;

        while (node != null && node.next != null) {
            if (node.next.val == val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }

        return head;
    }
}
