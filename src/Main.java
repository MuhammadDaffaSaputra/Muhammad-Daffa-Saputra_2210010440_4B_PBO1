
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        // List untuk menyimpan data pegawai
        ArrayList<PegawaiClass> daftarPegawai = new ArrayList<>();

        // Loop utama program
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
            scanner.nextLine(); // Membuang newline character

            switch (pilihan) {
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
                case 3:
                    // Keluar dari program
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, atau 3.");
                    break;
            }

        } while (pilihan != 3);

        // Menutup scanner
        scanner.close();
    }
}