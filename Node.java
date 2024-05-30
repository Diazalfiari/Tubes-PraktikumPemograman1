
public class Node {
	
    //deklarasikan variabel
    String judul;
    String penulis;
    int tahun;
    Node next;


    // Konstruktor untuk membuat objek Node dengan judul, penulis, dan tahun
    public Node(String judul, String penulis, int tahun) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
        this.next = null;
    }

    // Getter untuk mengambil node selanjutnya
    public Node getNext() {
        return next;
    }

    // setter untuk mengembalikan node selanjutnya
    public void setNext(Node next) {
        this.next = next;
    }

    // Representasi teks dari objek Node
    public String toString() {
        return "judul: " + judul + "\npenulis: " + penulis + "\ntahun: " + tahun;
    }
}
