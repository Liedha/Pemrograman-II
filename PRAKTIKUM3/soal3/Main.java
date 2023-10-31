package soal3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> daftarMHS = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa");
            System.out.println("3. Cari Mahasiswa");
            System.out.println("4. Tampilkan seluruh data Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 -> {
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String nim = scanner.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nama, nim);
                    daftarMHS.add(mhs);
                    System.out.println("Mahasiswa " + nama + " ditambahkan");
                }
                case 2 -> {
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String nim = scanner.nextLine();
                    Mahasiswa mhsDihapus = null;
                    for (Mahasiswa mhs : daftarMHS) {
                        if (mhs.getNim().equals(nim)) {
                            mhsDihapus = mhs;
                            break;
                        }
                    }
                    if (mhsDihapus != null) {
                        daftarMHS.remove(mhsDihapus);
                        System.out.println("Mahasiswa dengan NIM " + nim + " dihapus.");
                    }
                }
                case 3 -> {
                    System.out.print("Masukkan NIM Mahasiswa yang akan dicari: ");
                    String nimCari = scanner.nextLine();
                    for (Mahasiswa mhs : daftarMHS) {
                        if (mhs.getNim().equals(nimCari)) {
                            System.out.println("Data Mahasiswa ditemukan:");
                            System.out.println(mhs);
                            break;
                        }
                    }
                    System.out.println("Mahasiswa dengan NIM " + nimCari + " tidak ditemukan.");
                }
                case 4 -> {
                    if (daftarMHS.isEmpty()) {
                        System.out.println("Tidak ada data Mahasiswa.");
                    } else {
                        System.out.println("Daftar Mahasiswa:");
                        for (Mahasiswa mhs : daftarMHS) {
                            System.out.println(mhs);
                        }
                    }
                }
                case 0 -> {
                    System.out.println("Terima kasih!");
                    daftarMHS.clear();
                    System.exit(0);
                }
            }
        }
    }
}


