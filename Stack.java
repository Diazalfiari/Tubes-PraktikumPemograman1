
public class Stack {
	private Node top;

    public Stack() {
        this.top = null;
    }

    public void push(String title, String author, int year) {
        Node newNode = new Node(title, author, year);
        newNode.setNext(top);
        top = newNode;
    }

    public Node pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        Node poppedNode = top;
        top = top.getNext();
        return poppedNode;
    }

    public Node peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return top;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        int size = 0;
        Node current = top;
        while (current != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return;
        }
        Node current = top;
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }
    }
}
