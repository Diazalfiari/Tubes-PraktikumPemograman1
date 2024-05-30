
public class Node {
	
    //deklarasikan variabel
    String title;
    String author;
    int year;
    Node next;


    // Konstruktor untuk membuat objek Node dengan judul, penulis, dan tahun
    public Node(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.next = null;
    }

    // Getter untuk mengambil node selanjutnya
    public Node getNext() {
        return next;
    }

    
    public void setNext(Node next) {
        this.next = next;
    }

    // Representasi teks dari objek Node
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nYear: " + year;
    }
}
