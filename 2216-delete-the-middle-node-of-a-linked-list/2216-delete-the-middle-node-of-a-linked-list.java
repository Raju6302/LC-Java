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
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) return null;
         ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        ListNode temp1 = head;
        int res = count/2;
        while (temp1 != null) {
            res--;
            if (res == 0) {
                temp1.next = temp1.next.next;
                break;
            }

            temp1 = temp1.next;
        }

        return head;
    }
}