
public class Node {
	
    String title;
    String author;
    int year;
    Node next;

    public Node(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.next = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nYear: " + year;
    }
}
