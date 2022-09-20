package devmindJava.Curs24;

public class MyCircularQueue {
    //Implementare coada cu vector circular
    private final int[] elements;
    private int size;
    private final int capacity;

    private int front;
    private int rear;

    private static final int DEFAULT_MAX_CAPACITY = 16;

    public MyCircularQueue(int maxCapacity) {
        this.elements = new int[maxCapacity];
        this.size = 0;
        this.capacity = maxCapacity;
        this.front = 0;
        this.rear = 0;
    }

    public MyCircularQueue() {
        this(DEFAULT_MAX_CAPACITY);
    }

    public boolean offer(int element) {
        if(!this.isFull()){
            this.elements[rear] = element;
            size++;
            rear = (rear + 1) % capacity;
            System.out.println("Element " + element + " has been added to the back of the queue");
            return true;
        }
        System.err.println("Error");
        return false;
    }

    public int front() {
        if(!this.isEmpty()){
            return this.elements[front];
        }
        System.err.println("Error: retrieving element from empty queue");
        return 0;
    }

    public int poll() {
        if(!this.isEmpty()){
            int n = this.elements[front];
            this.elements[front] = 0;
            size--;
            front = (front + 1) % capacity;
            return n;
        }
        System.err.println("Error: poll from empty queue");
        return 0;
    }

    public boolean isEmpty() {
        return (this.size == 0);
    }
    public boolean isFull() {
        if(this.size == this.capacity){
            return true;
        }
        return false;
    }
}
