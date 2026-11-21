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

Program terdiri dari satu class utama, yaitu `InformasiHewan`,
