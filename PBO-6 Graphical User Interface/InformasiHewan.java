
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InformasiHewan extends JFrame {

    JButton btnKucing, btnAnjing, btnGajah, btnSinga;
    JLabel labelJudul, labelInstruksi;

    public InformasiHewan() {

        setTitle("Aplikasi Informasi Hewan");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelUtama = new JPanel();
        JPanel panelAtas = new JPanel();
        JPanel panelHewan = new JPanel();

        panelUtama.setLayout(new BorderLayout(10, 10));
        panelAtas.setLayout(new GridLayout(2, 1));
        panelHewan.setLayout(new GridLayout(2, 2, 10, 10));

        labelJudul = new JLabel("APLIKASI INFORMASI HEWAN");
        labelInstruksi = new JLabel(
            "Pilih hewan untuk melihat informasinya:"
        );

        btnKucing = new JButton("Kucing");
        btnAnjing = new JButton("Anjing");
        btnGajah = new JButton("Gajah");
        btnSinga = new JButton("Singa");

        labelJudul.setHorizontalAlignment(JLabel.CENTER);
        labelInstruksi.setHorizontalAlignment(JLabel.CENTER);

        labelJudul.setFont(
            new Font("Arial", Font.BOLD, 20)
        );

        panelAtas.add(labelJudul);
        panelAtas.add(labelInstruksi);

        panelHewan.add(btnKucing);
        panelHewan.add(btnAnjing);
        panelHewan.add(btnGajah);
        panelHewan.add(btnSinga);

        panelUtama.add(panelAtas, BorderLayout.NORTH);
        panelUtama.add(panelHewan, BorderLayout.CENTER);

        add(panelUtama);

        btnKucing.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tampilkanInformasi(
                    "KUCING",
                    "Habitat: Rumah dan lingkungan perkotaan.\n\n" +
                    "Makanan: Ikan dan daging.\n\n" +
                    "Ciri-ciri: Memiliki empat kaki, kumis, " +
                    "cakar, dan ekor.\n\n" +
                    "Fakta menarik: Kucing dapat mengeluarkan " +
                    "suara dengkuran ketika merasa nyaman."
                );
            }
        });

        btnAnjing.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tampilkanInformasi(
                    "ANJING",
                    "Habitat: Rumah dan lingkungan manusia.\n\n" +
                    "Makanan: Daging dan makanan khusus anjing.\n\n" +
                    "Ciri-ciri: Memiliki empat kaki, indra " +
                    "penciuman tajam, dan pendengaran baik.\n\n" +
                    "Fakta menarik: Anjing memiliki kemampuan " +
                    "mengenali aroma dengan sangat baik."
                );
            }
        });

        btnGajah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tampilkanInformasi(
                    "GAJAH",
                    "Habitat: Hutan, padang rumput, dan sabana.\n\n" +
                    "Makanan: Rumput, daun, dan buah.\n\n" +
                    "Ciri-ciri: Memiliki tubuh besar, belalai " +
                    "panjang, dan telinga lebar.\n\n" +
                    "Fakta menarik: Gajah memiliki ingatan " +
                    "yang sangat baik."
                );
            }
        });

        btnSinga.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tampilkanInformasi(
                    "SINGA",
                    "Habitat: Padang rumput dan sabana Afrika.\n\n" +
                    "Makanan: Zebra dan hewan herbivora lainnya.\n\n" +
                    "Ciri-ciri: Memiliki tubuh kuat, gigi taring " +
                    "tajam, dan singa jantan memiliki surai.\n\n" +
                    "Fakta menarik: Singa hidup berkelompok " +
                    "yang disebut pride."
                );
            }
        });
    }

    public void tampilkanInformasi(
        String nama,
        String informasi
    ) {

        JFrame windowInformasi = new JFrame();

        windowInformasi.setTitle("Informasi " + nama);
        windowInformasi.setSize(400, 350);
        windowInformasi.setLocationRelativeTo(this);
        windowInformasi.setDefaultCloseOperation(
            JFrame.DISPOSE_ON_CLOSE
        );

        JPanel panelInformasi = new JPanel();

        panelInformasi.setLayout(new BorderLayout(10, 10));

        JLabel labelNama = new JLabel(
            "INFORMASI " + nama
        );

        JTextArea areaInformasi = new JTextArea(informasi);

        areaInformasi.setEditable(false);
        areaInformasi.setLineWrap(true);
        areaInformasi.setWrapStyleWord(true);

        labelNama.setHorizontalAlignment(JLabel.CENTER);
        labelNama.setFont(
            new Font("Arial", Font.BOLD, 18)
        );

        panelInformasi.add(labelNama, BorderLayout.NORTH);
        panelInformasi.add(
            new JScrollPane(areaInformasi),
            BorderLayout.CENTER
        );

        windowInformasi.add(panelInformasi);

        windowInformasi.setVisible(true);
    }

    public static void main(String[] args) {

        InformasiHewan frame = new InformasiHewan();
        frame.setVisible(true);

    }
}
