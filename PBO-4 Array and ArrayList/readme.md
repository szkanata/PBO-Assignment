# Sistem Pengelolaan Bank (Banking System)

Proyek ini merupakan implementasi sistem perbankan sederhana menggunakan bahasa pemrograman Java. Proyek ini dibuat untuk memperlihatkan perbedaan konsep, kelebihan, dan cara kerja antara **Array Biasa (Fixed-size Array)** dan **ArrayList (Dynamic Array)** dalam pengelolaan data koleksi (nasabah dan rekening).

---

## 📄 Struktur Berkas Project

```text
.
├── Account.java              # Kelas model untuk rekening bank (Saldo, Deposit, Withdraw)
├── BankA.java                # Kelas pengelola bank menggunakan Array Biasa
├── CustomerArray.java        # Kelas nasabah yang menyimpan akun menggunakan Array Biasa
├── BankArray.java            # Main class / Program utama untuk uji coba versi Array Biasa
├── BankAL.java               # Kelas pengelola bank menggunakan ArrayList
├── CustomerArrayList.java    # Kelas nasabah yang menyimpan akun menggunakan ArrayList
└── BankArrayList.java        # Main class / Program utama untuk uji coba versi ArrayList
```

---

## ⚙️ Komponen Utama (Shared Class)

### `Account.java`
Kelas ini digunakan oleh kedua pendekatan (Array biasa & ArrayList) untuk merepresentasikan rekening bank nasabah.
- **Atribut:**
  - `balance` (`double`): Menyimpan jumlah saldo rekening.
- **Metode Utama:**
  - `deposit(double amount)`: Menambah saldo jika nominal `amount > 0`.
  - `withdraw(double amount)`: Mengurangi saldo jika `balance >= amount`.
  - `getBalance()`: Mengembalikan saldo saat ini.

---

## 🔍 Penjelasan Implementasi

---

### 1. Implementasi Menggunakan Array Biasa (Fixed-size Array)

Pada pendekatan ini, jumlah nasabah dan jumlah akun yang dimiliki oleh setiap nasabah ditentukan dengan batas ukuran tetap sejak awal (*fixed length*).

#### **Kelas Terkait:**
* **`CustomerArray.java`**:
  * Menggunakan array tunggal `accounts` berukuran fixed (misal `accounts = new Account[10]`).
  * Menggunakan atribut penanda indeks `numberOfAccounts` untuk mencatat jumlah akun yang terisi saat ini.
* **`BankA.java`**:
  * Memiliki array nasabah `customers = new CustomerArray[5]`. Max kapasitas bank adalah 5 nasabah.
  * Memiliki counter `numberOfCustomers`.
* **`BankArray.java`**:
  * Berisi fungsi `main` untuk menguji alur kerja Bank berbasis Array Biasa.

#### **Cara Kerja Kode (Array Biasa):**
1. **Inisialisasi Bank:** `BankA` dibuat dengan alokasi memori awal berupa array `CustomerArray` berukuran 5 elemen.
2. **Penambahan Nasabah (`addCustomer`):**
   - Sebelum menambah, sistem mengecek kondisi `if (numberOfCustomers < customers.length)`.
   - Jika masih ada ruang kosong, objek `CustomerArray` baru dimasukkan ke elemen `customers[numberOfCustomers]`, lalu `numberOfCustomers` ditambah 1 (`++`).
   - Jika array sudah penuh, sistem menampilkan pesan error `"Kapasitas Bank sudah penuh!"`.
3. **Pengambilan Nasabah (`getCustomer`):**
   - Mengambil data berdasarkan indeks array dengan validasi boundary `0 <= index < numberOfCustomers`.
4. **Pengelolaan Akun Nasabah (`setAccount` / `getAccount`):**
   - Mengisi elemen array `accounts[i]` secara langsung berdasarkan indeks.

---

### 2. Implementasi Menggunakan ArrayList (Dynamic Array)

Pada pendekatan ini, jumlah nasabah maupun jumlah rekening nasabah bersifat fleksibel (*dynamic length*). Data dapat bertambah terus-menerus tanpa perlu menentukan batasan kapasitas awal.

#### **Kelas Terkait:**
* **`CustomerArrayList.java`**:
  * Menggunakan `ArrayList<Account>` untuk menyimpan daftar rekening.
* **`BankAL.java`**:
  * Menggunakan `ArrayList<CustomerArrayList>` untuk menyimpan daftar nasabah bank.
* **`BankArrayList.java`**:
  * Berisi fungsi `main` untuk menguji alur kerja Bank berbasis ArrayList.

#### **Cara Kerja Kode (ArrayList):**
1. **Inisialisasi Bank:** `BankAL` membuat sebuah instance `ArrayList` kosong yang siap menampung objek `CustomerArrayList`.
2. **Penambahan Nasabah (`addCustomer`):**
   - Membuat objek `CustomerArrayList` baru.
   - Memanggil metode bawaan Java `.add(cust)`. Ukuran koleksi akan membesar secara otomatis tanpa perlu pemeriksaan batas kapasitas.
3. **Pengambilan Nasabah (`getCustomer`):**
   - Memeriksa batas elemen menggunakan `.size()`.
   - Mengambil objek nasabah menggunakan metode bawaan `.get(index)`.
4. **Pengelolaan Akun Nasabah (`addAccount` / `getAccount`):**
   - Rekening baru ditambahkan menggunakan `accounts.add(account)`.
   - Mengambil rekening menggunakan `accounts.get(index)`.

---

## 📊 Perbandingan: Array Biasa vs ArrayList

| Fitur / Karakteristik | Array Biasa (`BankA` & `CustomerArray`) | ArrayList (`BankAL` & `CustomerArrayList`) |
| :--- | :--- | :--- |
| **Ukuran Memori** | Tetap (*Fixed*). Ditentukan saat *instantiation* (`new CustomerArray[5]`). | Dinamis (*Dynamic*). Bertambah/berkurang secara otomatis. |
| **Pemeriksaan Batas** | Manual. Membutuhkan variabel penanda (misal: `numberOfCustomers`). | Otomatis. Menggunakan fungsi bawaan seperti `.size()`. |
| **Batas Kapasitas** | Terbatas. Jika melebihi batas, akan memunculkan peringatan / `ArrayIndexOutOfBoundsException`. | Tidak terbatas (hanya dibatasi oleh memori RAM). |
| **Akses Elemen** | Menggunakan notasi bracket `array[index]`. | Menggunakan method `.get(index)`. |
| **Performa** | Sangat cepat dan efisien dalam konsumsi memori dasar. | Memiliki sedikit *overhead* memori, namun jauh lebih fleksibel. |

---

## 🚀 Cara Menjalankan Program

### 1. Kompilasi Seluruh File Java
Buka terminal pada direktori proyek, lalu jalankan perintah:
```bash
javac *.java
```

### 2. Jalankan Versi Array Biasa
```bash
java BankArray
```

**Output yang Dihasilkan:**
```text
=== INFORMASI BANK ===
Jumlah Nasabah  : 2
Nama Nasabah 1  : John Doe
Saldo Akun Utama: $650.0
```

### 3. Jalankan Versi ArrayList
```bash
java BankArrayList
```

**Output yang Dihasilkan:**
```text
Jumlah Nasabah: 2
Nasabah 1: John Doe
Saldo Akun 1: $650.0
```