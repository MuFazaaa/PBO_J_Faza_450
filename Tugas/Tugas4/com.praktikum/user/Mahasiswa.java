package com.praktikum.user;

import com.praktikum.actions.MahasiswaActions;
import java.util.Scanner;

public class Mahasiswa extends User implements MahasiswaActions {

    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public boolean login() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Mahasiswa: ");
        String namaInput = input.nextLine();
        System.out.print("Masukkan NIM Mahasiswa: ");
        String nimInput = input.nextLine();
        return namaInput.equals(getNama()) && nimInput.equals(getNim());
    }

    @Override
    public void displayAppMenu() {
        Scanner input = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("\n=== Menu Mahasiswa ===");
            System.out.println("1. Laporkan Barang Temuan/Hilang");
            System.out.println("2. Lihat Daftar Laporan");
            System.out.println("0. Logout");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // clear newline
            switch (pilihan) {
                case 1 -> reportItem();
                case 2 -> viewReportedItems();
                case 0 -> System.out.println("Logout...");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }

    @Override
    public void reportItem() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama Barang: ");
        String nama = input.nextLine();
        System.out.print("Deskripsi Barang: ");
        String deskripsi = input.nextLine();
        System.out.print("Lokasi Terakhir/Ditemukan: ");
        String lokasi = input.nextLine();
        System.out.println(">> Laporan berhasil dikirim!");
    }

    @Override
    public void viewReportedItems() {
        System.out.println(">> Fitur Lihat Laporan Belum Tersedia <<");
    }
}