
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        Stack stackBuku = new Stack();

        // Membuat frame untuk aplikasi
        JFrame frame = new JFrame("Menu Perpustakaan");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // membuat panel dengan layout grid
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        // Membuat label dan field untuk input judul, penulis, dan tahun
        JLabel judulLabel = new JLabel("Judul Buku:");
        JTextField judulField = new JTextField();
        JLabel penulisLabel = new JLabel("Penulis:");
        JTextField penulisField = new JTextField();
        JLabel tahunLabel = new JLabel("Tahun Rilis:");
        JTextField tahunField = new JTextField();

        // Membuat tombol untuk tambah, hapus, dan tampilkan buku
        JButton tambahButton = new JButton("Tambah Buku");
        JButton hapusButton = new JButton("Hapus Buku");
        JButton tampilButton = new JButton("Tampilkan Semua Buku");
        JButton sizeButton = new JButton("Jumlah Buku");

        // Menambahkan action listener untuk tombol tambah
        tambahButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String judul = judulField.getText();
                String penulis = penulisField.getText();
                int tahun = Integer.parseInt(tahunField.getText());
                stackBuku.push(judul, penulis, tahun);
                JOptionPane.showMessageDialog(frame, "Buku berhasil ditambahkan");
            }
        });

        // Menambahkan action listener untuk tombol hapus
        hapusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Node removedBook = stackBuku.pop();
                if (removedBook != null) {
                    JOptionPane.showMessageDialog(frame, "Hapus Buku: " + removedBook);
                } else {
                    JOptionPane.showMessageDialog(frame, "stack kosong");
                }
            }
        });

        // Menambahkan action listener untuk tombol tampilkan
        tampilButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (stackBuku.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Stack kosong");
                } else {
                    StringBuilder books = new StringBuilder();
                    Node current = stackBuku.peek();
                    while (current != null) {
                        books.append(current).append("\n");
                        current = current.getNext();
                    }
                    JOptionPane.showMessageDialog(frame, books.toString());
                }
            }
        });

        // Menambahkan action listener untuk tombol size
        sizeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int size = stackBuku.size(); 
                JOptionPane.showMessageDialog(frame, "Jumlah Buku : " +size);
            }
        }
        );

        // Menambahkan komponen ke dalam panel
        panel.add(judulLabel);
        panel.add(judulField);
        panel.add(penulisLabel);
        panel.add(penulisField);
        panel.add(tahunLabel);
        panel.add(tahunField);
        panel.add(tambahButton);
        panel.add(hapusButton);
        panel.add(tampilButton);
        panel.add(sizeButton);

        // Menambahkan panel ke dalam frame dan menampilkannya
        frame.add(panel);
        frame.setVisible(true);
    }
}
