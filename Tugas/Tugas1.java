import java.util.*;

public class Tugas1 {
    private static Scanner penginput = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Pilih Login:\n1. Admin\n2. Mahasiswa\nMasukkan Pilihan:");
            int pilihan = penginput.nextInt();
            penginput.nextLine();
            switch (pilihan) {
                case 1:
                    admin();
                    break;
                case 2:
                    mahasiswa();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }

    public static void admin() {
        System.out.print("\nMasukkan username: ");
        String usernameAdmin = penginput.nextLine();
        System.out.print("Masukkan Password: ");
        String passwordAdmin = penginput.nextLine();

        if (usernameAdmin.equals("admin450") && passwordAdmin.equals("password450")) {
            System.out.print("\nLogin Admin Berhasil!");
            penginput.nextLine();
        } else {
            System.out.print("\nLogin gagal! Username atau password salah.");
            penginput.nextLine();
        }
    }

    public static void mahasiswa() {
        System.out.print("\nMasukkan username: ");
        String usernamemahasiswa = penginput.nextLine();
        System.out.print("Masukkan NIM: ");
        String passwordmahasiswa = penginput.nextLine();

        if (usernamemahasiswa.equals("Muhammad Fayyad Hudzaqi") && passwordmahasiswa.equals("202410370110450")) {
            System.out.print("\nLogin Mahasiswa Berhasil!");
            System.out.print("\nNama : "+usernamemahasiswa);
            System.out.print("\nNIM : "+passwordmahasiswa);
            penginput.nextLine();
        } else {
            System.out.print("\nLogin gagal! Nama atau NIM salah.");
            penginput.nextLine();
        }
    }
}