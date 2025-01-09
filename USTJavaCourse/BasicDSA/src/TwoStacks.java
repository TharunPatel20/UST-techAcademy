
//2. "Create a data structure two Stacks that represents two stacks. Implementation of two
//Stacks should use only one array, i.e., both stacks should use the same array for storing
//elements. Following functions must be supported by two Stacks.
//push1(int x) –> pushes x to first stack
//push2(int x) –> pushes x to second stack
//pop1() –> pops an element from first stack and return the popped element.
//pop2() –> pops an element from second stack and return the popped element”
// 


public class TwoStacks {
    private int[] arr;
    private int size;
    private int top1, top2;

    // Constructor to initialize the array and the size of the array
    public TwoStacks(int n) {
        arr = new int[n];
        size = n;
        top1 = -1; // top1 starts from -1 for Stack 1 (top1 will grow from left to right)
        top2 = size; // top2 starts from size for Stack 2 (top2 will grow from right to left)
    }

    // Pushes an element x to the first stack
    public void push1(int x) {
        if (top1 < top2 - 1) { // Check if there is space in the array for Stack 1
            top1++;
            arr[top1] = x;
        } else {
            System.out.println("Stack Overflow in Stack 1");
        }
    }

    // Pushes an element x to the second stack
    public void push2(int x) {
        if (top1 < top2 - 1) { // Check if there is space in the array for Stack 2
            top2--;
            arr[top2] = x;
        } else {
            System.out.println("Stack Overflow in Stack 2");
        }
    }

    // Pops an element from the first stack and returns it
    public int pop1() {
        if (top1 >= 0) { // Check if Stack 1 is not empty
            int value = arr[top1];
            top1--;
            return value;
        } else {
            System.out.println("Stack Underflow in Stack 1");
            return -1; // Return an error value
        }
    }

    // Pops an element from the second stack and returns it
    public int pop2() {
        if (top2 < size) { // Check if Stack 2 is not empty
            int value = arr[top2];
            top2++;
            return value;
        } else {
            System.out.println("Stack Underflow in Stack 2");
            return -1; // Return an error value
        }
    }

    // Function to check if Stack 1 is empty
    public boolean isEmpty1() {
        return top1 == -1;
    }

    // Function to check if Stack 2 is empty
    public boolean isEmpty2() {
        return top2 == size;
    }

    public static void main(String[] args) {
        TwoStacks ts = new TwoStacks(5);

        ts.push1(10);
        ts.push1(20);
        ts.push2(30);
        ts.push2(40);

        System.out.println("Popped from Stack 1: " + ts.pop1()); // 20
        System.out.println("Popped from Stack 2: " + ts.pop2()); // 40
        System.out.println("Popped from Stack 1: " + ts.pop1()); // 10
        System.out.println("Popped from Stack 2: " + ts.pop2()); // 30

        // Testing overflow and underflow
        ts.push1(50);
        ts.push1(60);
        ts.push2(70); // Stack Overflow in Stack 2
        System.out.println("Popped from Stack 1: " + ts.pop1()); // 60
    }
}
