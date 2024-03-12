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
class Solution1171 {
    private class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode removeZeroSumSublists(ListNode head) {
        int[] array = new int[size(head)];

        for(int i = 0; i < array.length; i++, head = head.next) 
            array[i] = head.val;
        
        for(int i = 0; i < array.length; i++) {
            int sum = 0;
            for(int l = i; l < array.length; l++) {
                sum += array[l];
                if(sum == 0) {
                    for(int j = i; j <= l; j++)
                        array[j] = 0;
                    
                    break;
                }
            }
        }

        ListNode result = new ListNode(0);
        ListNode resultCopy = result;

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            if(array[i] != 0) {
                result.next = new ListNode(array[i]);
                result = result.next;
            }
        }

        return resultCopy.next;
    }

    private int size(ListNode head) {
        int size = 0;

        while(head != null) {
            size++;
            head = head.next;
        }

        return size;
    }
}