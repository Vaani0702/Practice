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
        int n = 0;
        //ListNode prev = head;
        ListNode curr = head;
        while(curr !=null){
            n++ ;
            curr = curr.next;
        }
         if(n<=1){
            return null;
        }  
        int mid = n/2;
        ListNode prev = null;
        curr = head;
        for (int i = 0; i < mid; i++) {
            prev = curr;
            curr = curr.next;
            }
        prev.next = curr.next;
        return head;  
       


            }
        }
    
