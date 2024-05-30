
public class Stack {
	private Node top;


    // Konstruktor untuk membuat objek Stack kosong
    public Stack() {
        this.top = null;
    }

    // Menambahkan elemen ke atas tumpukan (push)
    public void push(String judul, String penulis, int tahun) {
        Node newNode = new Node(judul, penulis, tahun);
        newNode.setNext(top);
        top = newNode;
    }

    // Menghapus elemen dari atas tumpukan (pop)
    public Node pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        Node poppedNode = top;
        top = top.getNext();
        return poppedNode;
    }

    // Melihat elemen teratas tanpa menghapusnya (peek)
    public Node peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return top;
    }

    // Memeriksa apakah tumpukan kosong
    public boolean isEmpty() {
        return top == null;
    }

    // Menghitung jumlah elemen dalam tumpukan
    public int size() {
        int size = 0;
        Node current = top;
        while (current != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }

    // Menampilkan seluruh isi tumpukan
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
