### Struktur Berkas Project
```
.
├── Bentuk.java        # Superclass utama (Atribut warna)
├── Bujursangkar.java  # Subclass dari Bentuk (Bangun datar persegi)
├── Lingkaran.java     # Subclass dari Bentuk (Bangun datar lingkaran)
├── Silinder.java      # Subclass dari Lingkaran (Bangun ruang silinder)
└── Main.java          # Main Class / Entry point program
```

### Hirarki Pewarisan Kelas (Inheritance Hierarchy)
```text
       [ Bentuk ]  (Superclass Utama)
        /      \
       /        \
[ Bujursangkar ] [ Lingkaran ]
                      |
                 [ Silinder ]  (Subclass dari Lingkaran)
```

---

## ⚙️ Cara Kerja Keseluruhan Kode

Program ini bekerja dengan memanfaatkan prinsip hirarki turunan (*inheritance chain*) untuk menghitung luas dan volume dari berbagai bentuk geometri, serta menampilkan informasinya.

### 1. Inisialisasi & Pewarisan Atribut/Konstruktor
- **`Bentuk`** bertindak sebagai *parent class* yang memiliki atribut `warna`.
- **`Bujursangkar`** dan **`Lingkaran`** mewarisi properti `warna` dari `Bentuk` menggunakan kata kunci `super(warna)`, sembari menambahkan atribut khusus mereka sendiri:
  - `Bujursangkar` menambahkan atribut `sisi`.
  - `Lingkaran` menambahkan atribut `radius`.
- **`Silinder`** mewarisi atribut dari `Lingkaran` (yang secara tidak langsung juga mewarisi `Bentuk`). Konstruktor `Silinder` memanggil `super(radius, warna)` untuk menginisialisasi radius dan warna pada kelas induknya, lalu menyimpan atribut khususnya yaitu `tinggi`.

### 2. Penghitungan Matematika & Reusability
- `Bujursangkar` menghitung luas bangun datar dengan rumus:  
  $$\text{Luas} = \text{sisi} \times \text{sisi}$$
- `Lingkaran` menghitung luas bangun datar menggunakan konstanta `Math.PI`:  
  $$\text{Luas} = \pi \times \text{radius}^2$$
- `Silinder` memanfaatkan metode `hitungLuas()` milik `Lingkaran` (luas alas) untuk menghitung volumenya tanpa perlu menulis ulang rumus luas lingkaran:  
  $$\text{Volume} = \text{hitungLuas()} \times \text{tinggi}$$

### 3. Polymorphism & Method Overriding
Setiap *subclass* melakukan **overriding** terhadap metode `printInfo()` dari *superclass*-nya agar dapat mencetak informasi spesifik sesuai jenis bangun:
- **`Bentuk`**: Menampilkan nama warna.
- **`Bujursangkar`**: Menampilkan warna dan hasil `hitungLuas()`.
- **`Lingkaran`**: Menampilkan warna dan hasil `hitungLuas()`.
- **`Silinder`**: Menampilkan warna dan hasil `hitungVolume()`.

---

## 🔍 Detail Peran Setiap Kelas

| Nama Kelas | Tipe Kelas | Deskripsi & Peran |
| :--- | :--- | :--- |
| **`Bentuk.java`** | Superclass | Kelas dasar yang menyimpan properti umum (`warna`) dan metode dasar `printInfo()`. |
| **`Bujursangkar.java`** | Subclass (`extends Bentuk`) | Mengelola bentuk persegi dengan kustomisasi metode pencarian luas dan pencetakan informasi. |
| **`Lingkaran.java`** | Subclass (`extends Bentuk`) | Mengelola bentuk lingkaran dengan menghitung luas lingkaran berbasis jari-jari (`radius`). |
| **`Silinder.java`** | Subclass (`extends Lingkaran`) | Mengelola bangun ruang silinder yang memanfaatkan luas alas dari `Lingkaran` untuk menghitung volume. |
| **`Main.java`** | Program Utama | Tempat mengeksekusi program, membuat instance/objek dari tiap kelas, dan memanggil metode `printInfo()`. |

---

## 🚀 Cara Menjalankan Program

1. **Kompilasi semua file `.java`:**
   ```bash
   javac Main.java Bentuk.java Bujursangkar.java Lingkaran.java Silinder.java
   ```

2. **Jalankan program utama:**
   ```bash
   java Main
   ```

3. **Output Program:**
   ```text
   Bujursangkar berwarna Merah, luas = 100.0
   Lingkaran berwarna Biru, luas = 113.09733552923255
   Silinder berwarna Hijau, volume = 1809.5573684677208
   ```
