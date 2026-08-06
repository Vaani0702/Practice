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
    ListNode head;

    public Solution(ListNode head) {
        this.head= head;
    }
    
    public int getRandom() {
       
        ListNode curr = head;
        int size=0;
        while(curr!=null){
            ++size;
            curr = curr.next;


        }
        int n =(int)(Math.random()*size);
        curr= head;
        for(int i =0; i<n;i++){

            curr= curr.next;

        }
        return curr.val;
        
    }
   
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */