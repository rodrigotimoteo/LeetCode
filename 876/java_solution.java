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
    private class ListNode {
        ListNode next = new ListNode();
    }

    public ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode storeHead = head;

        while(head != null) {
            size++;
            head = head.next;
        }

        size = size / 2;

        while(size != 0) {
            storeHead = storeHead.next;
            size--;
        }

        return storeHead;
    }
}