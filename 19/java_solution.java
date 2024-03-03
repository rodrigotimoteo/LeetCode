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
class Solution19 {
    private class ListNode {
        ListNode next = new ListNode();
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = getSize(head);

        ListNode storeHead = head;

        if(size == 1 && n == 1) return null;
        else {
            if(size == n) return head.next;

            while(size != (n + 1)) {
                size--;
                head = head.next;
            }

            head.next = head.next.next;

            return storeHead;
        }
    }

    private int getSize(ListNode head) {
        int size = 0;

        while(head != null) {
            size++;
            head = head.next;
        }

        return size;
    }
}