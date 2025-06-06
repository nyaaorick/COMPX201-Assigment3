public class Stack {
    private Node head;
    private int size;

    public Stack() {
        this.head = null;
        this.size = 0;
    }

    public void push(String x) {
        Node newNode = new Node(x);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    public String pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        String value = head.getValue();
        head = head.getNext();
        size--;
        return value;
    }

    public String peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return head.getValue();
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int length() {
        return size;
    }

    public void dump() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        
        Node current = head;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
} 