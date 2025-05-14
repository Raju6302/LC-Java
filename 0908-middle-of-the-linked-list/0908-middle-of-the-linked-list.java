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
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int middle = (count / 2) + 1;
        ListNode temp1 = head;
        while (temp1 != null) {
            middle -= 1;
            if(middle == 0) {
                break;
            }
            temp1 = temp1.next;
        }

        return temp1;
    }
}