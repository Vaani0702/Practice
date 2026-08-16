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
        int fcp = -1;
        int lcp = -1;
        int pos = 2;
        int mindist = 100000;
        while(curr.next != null){
           ListNode next = curr.next;
           if(curr.val>prev.val && curr.val >next.val || curr.val<prev.val && curr.val < next.val){
            if(fcp == -1){
                fcp = pos;
            }
            else{
                 mindist = Math.min(mindist, pos-lcp);
            }
            lcp=pos;
           }
           prev = curr;
           curr= next;
           pos++;
        }
        if(fcp == -1|| fcp == lcp){
            return new int[]{-1,-1};
        }
        int maxdist = lcp-fcp;
        return new int []{mindist,maxdist};
    }
}
