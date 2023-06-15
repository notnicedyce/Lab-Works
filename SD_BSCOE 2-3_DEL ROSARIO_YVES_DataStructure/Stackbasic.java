public class Stackbasic {
    private int maxSize;
    private int top;
    private int[] stackArray;

    // constructor
    public Stackbasic(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; 
    }

    // Add element
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push element: " + value);
        } else {
            top++;
            stackArray[top] = value;
            System.out.println("Pushed element: " + value);
        }
    }

    // Remove element
    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop element.");
        } else {
            int poppedElement = stackArray[top];
            top--;
            System.out.println("Popped element: " + poppedElement);
        }
    }

    // Return 
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty. No element to peek.");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    public static void main(String args[]) {
        Stackbasic stack = new Stackbasic(3);
        stack.push(1);
        stack.push(2);
        System.out.println("Top element: " + stack.peek());
        stack.pop();
        System.out.println("Top element: " + stack.peek());
    }
}