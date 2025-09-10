**Nama: Irvan Alif**

**Nim: 2409116071**

**Tema: Manajemen catatan tanaman hidropnik**
---
# **Deskripsi Program**

Program ini dibuat untuk orang-orang seperti petani hidroponik, mahasiswa pertanian, atau hobiis yang ingin mencatat data mengenai tanaman hidroponik yang mereka kelola.
Disini pengguna dapat menambahkan tanaman baru beserta datanya, melihat daftar tanaman yang sudah tersimpan, memperbarui data tanaman, serta menghapus data tanaman yang tidak diperlukan.

---
# **Penjelasan Alur Program**

1. Inisialisasi Data

<img width="875" height="516" alt="image" src="https://github.com/user-attachments/assets/bf297cfe-37fa-41dd-8c9c-e12e751bfa80" />

  - Disini saya menggunakan import java.util.ArrayList; untuk menyimpan data dan import java.util.Scanner; untuk input.
  
  - namaTanaman menyimpan nama tanaman hidroponik.
  
  - jenisTanaman menyimpan jenis dari tanaman.
  
  - sistemHidroponik menyimpan metode hidroponik yang digunakan.
  
  - tanggalTanam menyimpan tanggal penanaman.
  
  - statusTanaman menyimpan status pertumbuhan tanaman.
  
  - phAir menyimpan nilai pH air.
  
  - catatan menyimpan catatan tambahan.
  
  - Scanner (input) digunakan untuk membaca data dari pengguna.

Kode ini berfungsi untuk menyiapkan struktur data (ArrayList) dan input (Scanner).
Variabel pilihan digunakan untuk menampung menu yang dipilih.

---
2. Perulangan Menu Utama

<img width="1054" height="332" alt="image" src="https://github.com/user-attachments/assets/0142adf9-99be-4c6e-a46a-3d004aad0289" />


Program menggunakan do-while loop, sehingga menu akan selalu ditampilkan berulang kali sampai pengguna memilih opsi keluar.
Menu utama terdiri dari 5 pilihan:

- Tambah Tanaman

- Lihat Tanaman

- Update Tanaman

- Hapus Tanaman

- Keluar

Jika pengguna memasukkan angka di luar 1–5, maka akan tampil pesan "Pilihan tidak valid".

---
3. Pilihan Menu (switch-case)

<img width="1141" height="694" alt="image" src="https://github.com/user-attachments/assets/fcf1beb5-4e5d-4568-8fc6-5e3ad60a90a6" />


Case 1: Tambah Tanaman

Disini user diminta memasukkan:

- Nama tanaman,

- Jenis tanaman,

- Sistem hidroponik,

- Tanggal tanam,

- Status tanaman,

- pH air,

- Catatan tambahan.

Semua data disimpan ke dalam ArrayList.

Program menampilkan pesan: "Tanaman berhasil ditambahkan".

---
Case 2: Lihat Tanaman

<img width="1258" height="506" alt="image" src="https://github.com/user-attachments/assets/d8183200-0acf-4637-8ede-6a13ae1ec3c1" />

Jika daftar kosong nanti tampil pesan "Data tanaman kosong".

Kalau ada isi datanya, program akan menampilkan daftar semua tanaman yang sudah tersimpan, dalam format:

---
Case 3: Update Tanaman

<img width="1445" height="541" alt="image" src="https://github.com/user-attachments/assets/69483943-370a-45bf-bd29-57c55bcf02e4" />

User diminta memasukkan nomor indeks tanaman yang ingin diubah.
Jika nomor valid: user diminta memasukkan data baru (nama, jenis, sistem, tanggal, status, pH, catatan).
Data lama diganti dengan data baru pada indeks tersebut.

Tampil pesan: "Data tanaman berhasil diperbarui".

Jika nomor tidak valid akan tampil notif "Nomor tidak valid".

---
Case 4: Hapus Tanaman

<img width="1326" height="512" alt="image" src="https://github.com/user-attachments/assets/077240b0-9384-4447-b4d4-fcabc37dadd1" />

User diminta memasukkan nomor indeks tanaman yang ingin dihapus.

Jika nomor valid:

- Data pada indeks tersebut dihapus dari semua ArrayList.

- Tampil pesan: "Tanaman berhasil dihapus".

Jika nomor tidak valid nanti akan tampil "Nomor tidak valid".

---
Case 5: Keluar

<img width="1197" height="379" alt="image" src="https://github.com/user-attachments/assets/06bcbaba-3abe-4980-af31-a1d25f551758" />

Program akan menampilkan pesan: "Terima kasih, program selesai".

Looping berhenti karena kondisi pilihan != 5 tidak terpenuhi.

---
# **OUTPUT**
---
Pilihan 1
<img width="965" height="598" alt="image" src="https://github.com/user-attachments/assets/58ca5477-d7ee-48d4-a023-4f7847b4e32c" />

Pilihan 2
<img width="1075" height="322" alt="image" src="https://github.com/user-attachments/assets/5f5390ba-db8a-44b9-8050-a72f5c840193" />

Pilihan 3
<img width="997" height="552" alt="image" src="https://github.com/user-attachments/assets/967f4ac1-eed5-4c63-89fa-423671311d36" />

Pilihan 4
<img width="649" height="331" alt="image" src="https://github.com/user-attachments/assets/0a27d252-75f6-47c1-9664-8d95b54c09fe" />

Pilihan 5
<img width="912" height="351" alt="image" src="https://github.com/user-attachments/assets/e13bb898-9d41-40a2-9c6c-e7e34d9ab9dc" />





