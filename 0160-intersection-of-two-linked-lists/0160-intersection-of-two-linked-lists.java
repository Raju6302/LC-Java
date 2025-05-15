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
        if (headA == null || headB == null) return null;
        HashMap<ListNode, Boolean> map = new HashMap<>();
        ListNode temp = headA;
        while (temp != null) {
            map.put(temp, true);
            temp = temp.next;
        }

        ListNode temp1 = headB;
        while (temp1 != null) {
            if (map.containsKey(temp1)) return temp1;
            temp1 = temp1.next;
        }

        return null;
    }
}