package com.praktikum.Main;

import com.praktikum.user.Admin;
import com.praktikum.user.Mahasiswa;
import com.praktikum.user.User;

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Admin admin = new Admin("Muhammad Fayyad Hudzaqi", "202410370110450", "Admin450", "Password450");
        Mahasiswa mhs = new Mahasiswa("Muhammad Fayyad Hudzaqi", "202410370110450");

        System.out.println("=== SISTEM LOGIN ===");
        System.out.println("1. Login Admin");
        System.out.println("2. Login Mahasiswa");
        System.out.print("Pilih menu (1/2): ");
        int pilihan = input.nextInt();
        input.nextLine();

        User user = null;

        if (pilihan == 1 && admin.login()) {
            admin.displayInfo();
            user = admin;
        } else if (pilihan == 2 && mhs.login()) {
            mhs.displayInfo();
            user = mhs;
        } else {
            System.out.println("Login gagal atau pilihan tidak valid.");
            return;
        }

        // Polymorphic call
        user.displayAppMenu();
    }
}