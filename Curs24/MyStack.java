package devmindJava.Curs24;

public class MyStack {
    //Implementare stiva cu lista inlantuita
    private DoubleLinkedListNode head;
    private int size;

    public MyStack() {
    }
    public void push(int element) {
        if(size == 0){
            head = new DoubleLinkedListNode(element);
            size++;
        } else {
            DoubleLinkedListNode myElement = new DoubleLinkedListNode(element);
            head.previous = myElement;
            myElement.next = head;
            head = myElement;
            size++;
        }
    }

    public int peek() {
        if (size > 0) {
            return head.value;
        } else {
            System.err.println("Error: peeking into empty stack");
            return 0;
        }
    }

    public int pop() {
        if (size > 0) {
            int removedElement = head.value;
            head = head.next;
            if(head != null){
                head.previous = null;
            }
            size--;
            return removedElement;
        } else {
            System.err.println("Error: popping from empty stack");
            return 0;
        }
    }

    public boolean isEmpty() {
        if(size == 0){
            return true;
        }
        return false;
    }

    private class DoubleLinkedListNode {

        private int value;
        private DoubleLinkedListNode next;
        private DoubleLinkedListNode previous;

        public DoubleLinkedListNode(int value, DoubleLinkedListNode next, DoubleLinkedListNode previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }

        public DoubleLinkedListNode(int value) {
            this(value, null, null);
        }

        public DoubleLinkedListNode() {
        }

        public void value(int value) {
            this.value = value;
        }

        public int value() {
            return value;
        }

        public DoubleLinkedListNode next() {
            return next;
        }

        public void next(DoubleLinkedListNode next) {
            this.next = next;
        }

        public DoubleLinkedListNode prev() {
            return previous;
        }

        public void prev(DoubleLinkedListNode previous) {
            this.previous = previous;
        }
    }
}
