import java.util.Stack;

class RecentCounter {
    // Main stack to hold timestamps (newest at the top)
    private Stack<Integer> stack1;
    // Helper stack to reverse order (oldest at the top)
    private Stack<Integer> stack2;

    public RecentCounter() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    public int ping(int t) {
        // Step 1: Add the new request to the main stack
        stack1.push(t);
        
        // Step 2: Move everything from stack1 to stack2 
        // This puts the oldest elements on top of stack2
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        
        // Step 3: Pop elements from stack2 that are out of the [t - 3000, t] range
        while (!stack2.isEmpty() && stack2.peek() < t - 3000) {
            stack2.pop();
        }
        
        // Step 4: Move the valid elements back to stack1 to restore chronological order
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        
        // Step 5: The size of stack1 is our answer
        return stack1.size();
    }
}
