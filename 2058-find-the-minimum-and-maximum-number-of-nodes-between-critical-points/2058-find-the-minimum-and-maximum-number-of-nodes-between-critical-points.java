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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev = head;
        ListNode curr = head.next;

        int position = 2;
        int firstCritical = -1;
        int lastCritical = -1;
        int minDistance = 100000;

        while (curr.next != null) {

            ListNode next = curr.next;

            if ((curr.val > prev.val && curr.val > next.val) ||
                (curr.val < prev.val && curr.val < next.val)) {

                if (firstCritical == -1) {
                    firstCritical = position;
                } else {
                    minDistance = Math.min(minDistance, position - lastCritical);
                }

                lastCritical = position;
            }

            prev = curr;
            curr = next;
            position++;
        }

        if (firstCritical == -1 || firstCritical == lastCritical) {
            return new int[]{-1, -1};
        }

        int maxDistance = lastCritical - firstCritical;

        return new int[]{minDistance, maxDistance};
    }
}