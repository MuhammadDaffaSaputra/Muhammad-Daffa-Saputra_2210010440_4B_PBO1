# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data pegawai menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama umur dan jabatan, dan memberikan output berupa informasi detail dari pegawai tersebut seperti umur dan jabatan.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `PegawaiClass`, `Main`adalah contoh dari class.

```bash
public class PegawaiClass {
    ...
}

public class Main {
    ...
}



2. **Object** adalah instance dari class. Pada kode ini, `mhs[i] = new MahasiswaDetail(nama, npm);` adalah contoh pembuatan object.

```bash
daftarPegawai.add(new PegawaiClass(nama, umur, jabatan));
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `umur` adalah contoh atribut.

```bash
private String nama;
private int umur;
private String jabatan;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Mahasiswa` dan `MahasiswaDetail`.

```bash
public Pegawai(String nama, int umur, String jabatan) {
    this.nama = nama;
    this.umur = umur;
    this.jabatan = jabatan;
}


```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setNpm` adalah contoh method mutator.

```bash

```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getNpm`, `getTahunMasuk`, `getFakultas`, `getProdi`, dan `getNoRegistrasi` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `npm` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private int umur;
private String jabatan;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `MahasiswaDetail` mewarisi `Mahasiswa` dengan sintaks `extends`.

```bash
public class MahasiswaDetail extends Mahasiswa {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Mahasiswa` merupakan overloading method `displayInfo` dan `displayInfo` di `MahasiswaDetail` merupakan override dari method `displayInfo` di `Mahasiswa`.

```bash
public String displayInfo(String kelas) {
    return displayInfo() + "\nKelas: " + kelas;
}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getFakultas` dan seleksi `switch` dalam method `getProdi`.

```bash
pswitch (pilihan) {
                case 1:
                    // Input data pegawai
                    System.out.print("Nama: ");
                    String namaPegawai = scanner.nextLine();
                    System.out.print("Umur: ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Umur tidak valid. Masukkan umur yang benar: ");
                        scanner.next();
                    }
                    int umurPegawai = scanner.nextInt();
                    scanner.nextLine(); // Membuang newline character
                    System.out.print("Jabatan: ");
                    String jabatanPegawai = scanner.nextLine();

                    // Membuat objek Pegawai baru dan menyimpan ke list
                    daftarPegawai.add(new Pegawai(namaPegawai, umurPegawai, jabatanPegawai));
                    System.out.println("Data pegawai berhasil disimpan!");
                    break;
                case 2:
                    // Input data manajer
                    System.out.print("Nama: ");
                    String namaManajer = scanner.nextLine();
                    System.out.print("Umur: ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Umur tidak valid. Masukkan umur yang benar: ");
                        scanner.next();
                    }
                    int umurManajer = scanner.nextInt();
                    scanner.nextLine(); // Membuang newline character
                    System.out.print("Jabatan: ");
                    String jabatanManajer = scanner.nextLine();
                    System.out.print("Departemen: ");
                    String departemenManajer = scanner.nextLine();

                    // Membuat objek Manajer baru dan menyimpan ke list
                    daftarPegawai.add(new Manajer(namaManajer, umurManajer, jabatanManajer, departemenManajer));
                    System.out.println("Data manajer berhasil disimpan!");
                    break;
                case 3:
                    // Menampilkan data pegawai yang sudah dimasukkan
                    System.out.println("\nData Pegawai:");
                    if (daftarPegawai.isEmpty()) {
                        System.out.println("Belum ada data pegawai yang dimasukkan.");
                    } else {
                        for (int i = 0; i < daftarPegawai.size(); i++) {
                            System.out.println("Pegawai ke-" + (i + 1));
                            daftarPegawai.get(i).tampilkanData(); // Memanggil method tampilkanData()
                        }
                    }
                    break;
                case 4:
                    // Keluar dari program
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, 3, atau 4.");
                    break;
            }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
do {
            // Menampilkan menu
            System.out.println("\nMenu:");
            System.out.println("1. Input Pegawai");
            System.out.println("2. Tampilkan Data Pegawai");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1/2/3): ");
            while (!scanner.hasNextInt()) {
                System.out.print("Pilihan tidak valid. Silakan pilih 1, 2, atau 3: ");
                scanner.next();
            }
            pilihan = scanner.nextInt();
            scanner.nextLine();
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
case 1:
                    // Input data pegawai
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Umur: ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Umur tidak valid. Masukkan umur yang benar: ");
                        scanner.next();
                    }
                    int umur = scanner.nextInt();
                    scanner.nextLine(); // Membuang newline character
                    System.out.print("Jabatan: ");
                    String jabatan = scanner.nextLine();

                    // Membuat objek Pegawai baru dan menyimpan ke list
                    daftarPegawai.add(new PegawaiClass(nama, umur, jabatan));
                    System.out.println("Data pegawai berhasil disimpan!");
                    break;
                case 2:
                    // Menampilkan data pegawai yang sudah dimasukkan
                    System.out.println("\nData Pegawai:");
                    if (daftarPegawai.isEmpty()) {
                        System.out.println("Belum ada data pegawai yang dimasukkan.");
                    } else {
                        for (int i = 0; i < daftarPegawai.size(); i++) {
                            System.out.println("Pegawai ke-" + (i + 1));
                            daftarPegawai.get(i).tampilkanData(); // Memanggil method tampilkanData()
                        }
                    }
                    break;
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `MahasiswaDetail[] mahasiswas = new MahasiswaDetail[2];` adalah contoh penggunaan array.

```bash
ArrayList<PegawaiClass> daftarPegawai = new ArrayList<>();
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
while (!scanner.hasNextInt()) {
                System.out.print("Pilihan tidak valid. Silakan pilih 1, 2, atau 3: ");
                scanner.next();
            }

while (!scanner.hasNextInt()) {
                        System.out.print("Umur tidak valid. Masukkan umur yang benar: ");
                        scanner.next();
                    }

default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, atau 3.");
                    break;
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    0    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    0    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **90** |

## Pembuat

Nama: Muhammad Daffa Saputra
NPM: 2210010440
