
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        Stack stackBuku = new Stack();

        JFrame frame = new JFrame("Menu Perpustakaan");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        JLabel titleLabel = new JLabel("Judul Buku:");
        JTextField titleField = new JTextField();
        JLabel authorLabel = new JLabel("Penulis:");
        JTextField authorField = new JTextField();
        JLabel yearLabel = new JLabel("Tahun Rilis:");
        JTextField yearField = new JTextField();

        JButton tambahButton = new JButton("Tambah Buku");
        JButton hapusButton = new JButton("Hapus Buku");
        JButton tampilButton = new JButton("Tampilkan Semua Buku");

        tambahButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String title = titleField.getText();
                String author = authorField.getText();
                int year = Integer.parseInt(yearField.getText());
                stackBuku.push(title, author, year);
                JOptionPane.showMessageDialog(frame, "Buku berhasil ditambahkan");
            }
        });

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

        panel.add(titleLabel);
        panel.add(titleField);
        panel.add(authorLabel);
        panel.add(authorField);
        panel.add(yearLabel);
        panel.add(yearField);
        panel.add(tambahButton);
        panel.add(hapusButton);
        panel.add(tampilButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}
