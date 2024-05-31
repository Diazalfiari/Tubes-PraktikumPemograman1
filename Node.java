
public class Node {
	
    //deklarasikan variabel... untuk ,menyimpan...
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

    // Getter untuk mengembalikan judul buku
    public String getJudul() {
		return judul;
	}

    // Setter untuk mengatur judul buku
	public void setJudul(String judul) {
		this.judul = judul;
	}

    // Getter untuk mengembalikan penulis buku
	public String getPenulis() {
		return penulis;
	}

    // Setter untuk mengatur penulis buku
	public void setPenulis(String penulis) {
		this.penulis = penulis;
	}

    // Getter untuk mengembalikan tahun terbit buku
	public int getTahun() {
		return tahun;
	}

    // Setter untuk mengatur tahun terbit buku
	public void setTahun(int tahun) {
		this.tahun = tahun;
	}

    // Getter untuk mengembalikan node selanjutnya
    public Node getNext() {
        return next;
    }

    // setter untuk mengatur node selanjutnya
    public void setNext(Node next) {
        this.next = next;
    }

    // Representasi teks dari objek Node
    public String toString() {
        return "judul: " + judul + "\npenulis: " + penulis + "\ntahun: " + tahun;
    }
}
