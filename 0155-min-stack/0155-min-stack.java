class MinStack {
    private int[] stackArray;
    private int top;
    private final int MAX_SIZE = 30005;

    public MinStack() {
        stackArray = new int[MAX_SIZE];
        top = -1;
    }
    
    public void push(int value) {
        if (top >= MAX_SIZE - 1) {
            return;
        }
        top++;
        stackArray[top] = value;
    }
    
    public void pop() {
        if (top == -1) {
            return;
        }
        top--;
    }
    
    public int top() {
        return stackArray[top];
    }
    
    public int getMin() {
        int min = stackArray[0];
        for (int i = 1; i <= top; i++) {
            if (stackArray[i] < min) {
                min = stackArray[i];
            }
        }
        return min;
    }
}
