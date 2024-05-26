import java.util.Stack;

 class stack {
    int[] array;
    int top;
    int maxsize;

    public stack(int size) {
        array = new int[size];
        maxsize = size;
        top = -1;
    }

    public void push(int value) {
        if(isFull()) {
            System.out.println("Stack is Full");
            return;
        }
        array[++top] = value;
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return array[top--];
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Stack is full");
            return -1;
        }
        return array[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxsize -1;
    }

    public static void main(String[] args) {
        stack stack = new stack(5);
    
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
    
        System.out.println("The last Element is" + stack.peek());
    
        stack.pop();
        stack.pop();
    
        
    }
}

