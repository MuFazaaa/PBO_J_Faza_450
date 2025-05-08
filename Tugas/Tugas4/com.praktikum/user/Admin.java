package com.praktikum.user;

import com.praktikum.actions.AdminActions;
import java.util.Scanner;

public class Admin extends User implements AdminActions {
    private String username;
    private String password;

    public Admin(String nama, String nim, String username, String password) {
        super(nama, nim);
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Username Admin: ");
        String userInput = input.nextLine();
        System.out.print("Masukkan Password Admin: ");
        String passInput = input.nextLine();
        return userInput.equals(username) && passInput.equals(password);
    }

    @Override
    public void displayAppMenu() {
        Scanner input = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("\n=== Menu Admin ===");
            System.out.println("1. Kelola Laporan Barang");
            System.out.println("2. Kelola Data Mahasiswa");
            System.out.println("0. Logout");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1 -> manageItems();
                case 2 -> manageUsers();
                case 0 -> System.out.println("Logout...");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }

    @Override
    public void manageItems() {
        System.out.println(">> Fitur Kelola Barang Belum Tersedia <<");
    }

    @Override
    public void manageUsers() {
        System.out.println(">> Fitur Kelola Mahasiswa Belum Tersedia <<");
    }
}
