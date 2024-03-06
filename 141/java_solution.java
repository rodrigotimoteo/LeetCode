import java.util.ArrayList;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
class Solution141 {
    private class ListNode {
        ListNode next = new ListNode();
    }
    
    public boolean hasCycle(ListNode head) {
        ArrayList<ListNode> list = new ArrayList<>();

        while(head != null) {
            if(list.contains(head)) return true;
            else {
                list.add(head);
                head = head.next;
            }
        }

        return false;
    }
}