# Aplikasi Informasi Hewan

## Deskripsi
Aplikasi Informasi Hewan merupakan aplikasi sederhana berbasis Java GUI menggunakan library **Java Swing**. Aplikasi ini memungkinkan pengguna untuk melihat informasi umum mengenai beberapa jenis hewan dengan cara menekan tombol nama hewan yang tersedia.

Setiap kali pengguna menekan tombol hewan, aplikasi akan membuka jendela baru yang menampilkan informasi mengenai habitat, makanan, ciri-ciri, dan fakta menarik dari hewan tersebut.

## Fitur Aplikasi
Aplikasi ini memiliki beberapa fitur utama:
- Menampilkan daftar hewan yang dapat dipilih.
- Menampilkan informasi umum mengenai hewan yang dipilih.
- Membuka jendela baru untuk menampilkan informasi hewan.
- Menampilkan informasi dalam bentuk teks yang dapat digulir (scroll).
- Memungkinkan pengguna membuka beberapa jendela informasi sekaligus.

## Daftar Hewan
Terdapat empat jenis hewan yang tersedia dalam aplikasi:

| Hewan | Informasi yang Ditampilkan |
|---|---|
| Kucing | Habitat, makanan, ciri-ciri, dan fakta menarik. |
| Anjing | Habitat, makanan, ciri-ciri, dan fakta menarik. |
| Gajah | Habitat, makanan, ciri-ciri, dan fakta menarik. |
| Singa | Habitat, makanan, ciri-ciri, dan fakta menarik. |

## Teknologi yang Digunakan
- **Bahasa Pemrograman:** Java
- **GUI Library:** Java Swing
- **Layout Manager:** BorderLayout dan GridLayout
- **Event Handling:** ActionListener

## Komponen GUI

Program ini menggunakan beberapa komponen GUI berdasarkan fungsinya:

| Komponen | Class | Fungsi |
|---|---|---|
| Top Level Container | JFrame | Membuat jendela utama dan jendela informasi hewan. |
| Intermediate Container | JPanel | Mengelompokkan komponen GUI. |
| Atomic Component | JButton | Membuat tombol pilihan hewan. |
| Atomic Component | JLabel | Menampilkan judul dan instruksi. |
| Atomic Component | JTextArea | Menampilkan informasi hewan. |
| Layout Class | BorderLayout | Mengatur posisi panel pada jendela. |
| Layout Class | GridLayout | Mengatur susunan tombol hewan. |
| Event Listener | ActionListener | Menangani tindakan ketika tombol ditekan. |

## Struktur Program

Program terdiri dari satu class utama, yaitu `InformasiHewan`, yang memiliki beberapa bagian:

1. **Deklarasi Komponen:** Mendeklarasikan tombol, label, dan komponen GUI lainnya.
2. **Constructor:** Menginisialisasi jendela utama, membuat panel, mengatur layout, dan menambahkan komponen.
3. **Event Listener:** Menangani klik pada setiap tombol hewan menggunakan `ActionListener`.
4. **Method tampilkanInformasi():** Membuat jendela baru dan menampilkan informasi berdasarkan hewan yang dipilih.
5. **Main Method:** Menjalankan aplikasi dan menampilkan jendela utama.

## Cara Menjalankan Aplikasi

### Persyaratan
- Java Development Kit (JDK) telah terinstal.
- IDE seperti Visual Studio Code, NetBeans, atau IntelliJ IDEA.

### Langkah Menjalankan

1. Pastikan file `InformasiHewan.java` tersedia.
2. Buka terminal pada direktori tempat file disimpan.
3. Compile program menggunakan perintah:

   ```bash
   javac InformasiHewan.java
   ```

4. Jalankan program menggunakan perintah:

   ```bash
   java InformasiHewan
   ```

5. Jendela utama aplikasi akan muncul.
6. Tekan salah satu tombol nama hewan untuk membuka jendela informasi.

## Cara Penggunaan

1. Jalankan aplikasi Informasi Hewan.
2. Pilih salah satu tombol hewan yang tersedia, yaitu Kucing, Anjing, Gajah, atau Singa.
3. Aplikasi akan membuka jendela baru sesuai hewan yang dipilih.
4. Baca informasi mengenai habitat, makanan, ciri-ciri, dan fakta menarik hewan tersebut.
5. Tutup jendela informasi jika sudah selesai.
6. Pilih hewan lainnya untuk melihat informasi yang berbeda.

## Event Handling

Aplikasi menggunakan interface `ActionListener` untuk menangani event ketika pengguna menekan tombol hewan.

Method `actionPerformed(ActionEvent e)` di-override untuk menjalankan perintah ketika tombol ditekan.

Setiap tombol memanggil method `tampilkanInformasi()` dengan dua parameter, yaitu nama hewan dan informasi mengenai hewan tersebut.

Method tersebut kemudian membuat objek `JFrame` baru untuk menampilkan informasi yang dipilih.

## Penutup

Aplikasi Informasi Hewan merupakan contoh sederhana penerapan pemrograman berorientasi objek dan Java Swing dalam pembuatan Graphical User Interface (GUI). Melalui aplikasi ini, konsep Container, Atomic Component, Layout Manager, Interface, dan Event Listener dapat diterapkan dalam sebuah program yang interaktif.
