class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        while (l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }

        ListNode head = null;
        int sum = 0;

        while (!s1.isEmpty() || !s2.isEmpty()) {
            int a = s1.isEmpty() ? 0 : s1.pop();
            int b = s2.isEmpty() ? 0 : s2.pop();

            sum = a + b + sum / 10;

            ListNode node = new ListNode(sum % 10);
            node.next = head;
            head = node;
        }

        if (sum / 10 > 0) {
            ListNode node = new ListNode(sum / 10);
            node.next = head;
            head = node;
        }

        return head;
    }
}