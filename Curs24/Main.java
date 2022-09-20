package devmindJava.Curs24;

public class Main {

    public static void main(String[] args){

        System.out.println("\n///Stack///");

        MyStack stack1 = new MyStack();
        stack1.push(45);
        stack1.push(178);
        stack1.peek();
        System.out.println("Peek." + stack1.peek());
        System.out.println("Pop." + stack1.pop());
        System.out.println(stack1.isEmpty());
        System.out.println("Pop2." + stack1.pop());
        stack1.peek();

        System.out.println("\n///CircularQueue///");

        MyCircularQueue circularQueue = new MyCircularQueue(3);
        circularQueue.offer(22);
        circularQueue.offer(4789);
        circularQueue.poll();
        System.out.println("Front." + circularQueue.front());
        System.out.println("Poll." + circularQueue.poll());
        System.out.println(circularQueue.isEmpty());
    }
}
