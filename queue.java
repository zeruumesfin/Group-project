import java.util.Queue;

public class queue {
    int[] array;
    int rear;
    int front;
    int maxsize;
    int count;

    public queue(int size) {
        array = new int[size];
        rear = -1;
        front = 0;
        maxsize = size;
        count = 0;
    }

    public void enqueue(int value) {
        if(isFull()) {
           System.out.println("Queue is full");
           return;
        }
        array[++rear] = value;
        count++;
    }

    public int dequeue() {

        if(isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        int value = array[front++];
        count--;
        return value;
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Queue is Full");
            return -1;
        }
        return array[front];
    }

    public boolean isFull() {
        return count == maxsize;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public static void main(String[] args){
        queue queue = new queue(5);
    
        queue.enqueue(0);
    }
}



