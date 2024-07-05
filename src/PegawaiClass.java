import java.util.ArrayList;
import java.util.Scanner;

// Class untuk representasi pegawai
class PegawaiClass {
    private String nama;
    private int umur;
    private String jabatan;

    // Constructor untuk inisialisasi data pegawai
    public PegawaiClass(String nama, int umur, String jabatan) {
        this.nama = nama;
        this.umur = umur;
        this.jabatan = jabatan;
    }

    // Method untuk menampilkan data pegawai
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur); // Menampilkan umur
        System.out.println("Jabatan: " + jabatan); // Menampilkan jabatan
        System.out.println("--------------------");
    }

    // Getter untuk nama pegawai
    public String getNama() {
        return nama;
    }
}