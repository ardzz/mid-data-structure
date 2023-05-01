<h2 align="center">LAPORAN TUGAS BESAR JAVA LINKED LIST</h2>
<br>
<p align="center">
    <img src="https://github.com/ardzz/dasar-pemrogaman-2/raw/master/images/logo-polines.png" alt="Logo Polines" width="300" height="300">
</p>
<br>
<h4 align="center">
Disusun oleh : <br>
1. Naufal Reky Ardhana (43322021)<br>
2. Akasha Bin Ali (43322001)<br>
3. Aufa Bima Ngahada (43322003)<br>
</h4>

<br><br>

<h3 align="center">
TEKNOLOGI REKAYASA KOMPUTER <br>
TEKNIK ELEKTRO <br>
POLITEKNIK NEGERI SEMARANG <br>
2023
</h3>

<br><br>

### BAB 1 PENDAHULUAN
#### 1.1 Latar Belakang
Laporan ini dibuat untuk memenuhi tugas besar mata kuliah Struktur Data. 
Dalam laporan ini akan dijelaskan mengenai program yang dibuat untuk memenuhi tugas besar mata kuliah Struktur Data. 
Program yang dibuat adalah program yang dapat mengelola data penjualan alat tulis dengan menggunakan double linked list. 
Program ini dibuat dengan menggunakan bahasa pemrograman Java.

Dimana program ini dapat melakukan beberapa hal, yaitu:
1. Menambahkan data tersedia di dalam linked list 
2. Menghapus data yang ada di dalam linked list
3. Menampilkan data yang ada di dalam linked list
4. Mencari data tersedia ada di dalam linked list
5. Memindahkan data dari data tersedia ke data keranjang
6. Menampilkan data yang ada di dalam data keranjang
7. Menghapus data yang ada di dalam data keranjang
8. Memindahkan data dari data keranjang ke data terjual (_checkout_)
9. Menampilkan data yang ada di dalam data terjual
10. Keluar dari program

Program diatas dibuat untuk memudahkan dalam mengelola data penjualan alat tulis.

### BAB 2 DASAR TEORI
#### 2.1 Struktur Data
Struktur data adalah cara menyimpan dan mengorganisasikan data dalam komputer sehingga data tersebut dapat digunakan dengan efisien.
Struktur data merupakan bagian dari algoritma yang sangat penting.
Struktur data yang tepat dapat menghemat waktu dalam menjalankan program dan menghemat ruang penyimpanan dalam komputer.

#### 2.2 Linked List
Linked list adalah struktur data yang terdiri dari kumpulan node yang saling terhubung.
Node adalah sebuah struktur data yang berisi data dan pointer yang menunjuk ke node lainnya.
Node pertama disebut head dan node terakhir disebut tail.
Node yang tidak memiliki node lain yang ditunjuk disebut null.

#### 2.3 Double Linked List
Double linked list adalah struktur data yang terdiri dari kumpulan node yang saling terhubung.
Node adalah sebuah struktur data yang berisi data dan pointer yang menunjuk ke node lainnya.
Node pertama disebut head dan node terakhir disebut tail.
Node yang tidak memiliki node lain yang ditunjuk disebut null.
Double linked list memiliki pointer yang menunjuk ke node sebelumnya dan node selanjutnya.

### BAB 3 METODOLOGI
#### 3.1 Alat dan Bahan
1. Laptop
2. IDE Netbeans atau IntelliJ IDEA
3. JDK 18
4. Java

#### 3.2 Cara Kerja Program
Program terdiri dari 9 linked list yaitu:
1. linked list untuk data tersedia (3)
2. linked list untuk data keranjang (3)
3. linked list untuk data terjual (3)

Tujuan dibuatnya 9 linked list adalah untuk memudahkan dalam mengelola data penjualan alat tulis. 
Seperti berinteraksi dengan data keranjang layaknya keranjang belanja di supermarket, yang bisa memindahkan data dari data tersedia ke data keranjang, menghapus data yang ada di dalam data keranjang, dan menampilkan data yang ada di dalam data keranjang.

Lalu ada data terjual yang berfungsi untuk menyimpan data yang sudah di _checkout_ atau sudah dibeli oleh pembeli.

Program ini memiliki 10 menu, yaitu:
1. Lihat data tersedia
2. Tambah data tersedia
3. Hapus data tersedia
4. Pindahkan data tersedia ke data keranjang
5. Lihat data keranjang
6. Hapus data keranjang
7. Pindahkan data keranjang ke data terjual (_checkout_)
8. Lihat data terjual
9. Cari data tersedia
10. Keluar

#### 3.3 Flowchart
```mermaid
graph LR
A[Memulai Program] --> B[Memasukkan data tersedia]
B --> C[Memasukkan data keranjang]
C --> D[Memasukkan data terjual]
D --> E[Memilih menu]
E --> F{Menu yang dipilih}
F --> G[Lihat data tersedia]
F --> H[Tambah data tersedia]
F --> I[Hapus data tersedia]
F --> J[Pindahkan data tersedia ke data keranjang]
F --> K[Lihat data keranjang]
F --> L[Hapus data keranjang]
F --> M[Pindahkan data keranjang ke data terjual]
F --> N[Lihat data terjual]
F --> O[Cari data tersedia]
F --> P[Keluar]
```

#### 3.4 Pengaplikasian kelas abstract pada item (buku, pensil, dan penggaris)
Kelas abstract adalah kelas yang tidak dapat diinstansiasi dan hanya dapat diwariskan ke anak kelas.
Penggunaan kelas abstract pada item (buku, pensil, dan penggaris) adalah untuk memudahkan dalam mengelola data penjualan alat tulis. 
Serta membuat kode lebih bersih, efisien dan efektif.

<img src="assets/diagram_uml_item.png">