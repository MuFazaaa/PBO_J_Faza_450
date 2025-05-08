import java.util.Scanner;
class User {
    private String nama;
    private String nim;
    public User(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public boolean login(String inputNama, String inputNim) {
        return this.nama.equals(inputNama) && this.nim.equals(inputNim);
    }
    public void displayInfo() {
        System.out.println("Informasi User:");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}
class Admin extends User {
    private String username;
    private String password;
    public Admin(String nama, String nim, String username, String password) {
        super(nama, nim);
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public boolean login(String inputUsername, String inputPassword) {

        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }
    @Override
    public void displayInfo() {
        System.out.println("Login Admin berhasil!");
        System.out.println("Nama: " + getNama());
        System.out.println("NIM: " + getNim());
        System.out.println("Username: " + username);
    }
}
class Mahasiswa extends User {
    public Mahasiswa(String nama, String nim) {
        super(nama, nim); // Memanggil constructor superclass (User)
    }
    @Override
    public boolean login(String inputNama, String inputNim) {
        return getNama().equals(inputNama) && getNim().equals(inputNim);
    }
    @Override
    public void displayInfo() {
        System.out.println("Login Mahasiswa berhasil!");
        System.out.println("Nama: " + getNama());
        System.out.println("NIM: " + getNim());
    }
}
public class Tugas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin("Muhammad Fayyad Hudzaqi", "202410370110450", "Admin450", "Password450");
        Mahasiswa mahasiswa = new Mahasiswa("Muhammad Fayyad Hudzaqi", "202410370110450");
        System.out.println("===== SISTEM LOGIN =====");
        System.out.println("1. Login sebagai Admin");
        System.out.println("2. Login sebagai Mahasiswa");
        System.out.print("Masukkan pilihan (1/2): ");
        String pilihan = scanner.nextLine();
        if (pilihan.equals("1")) {
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();
            if (admin.login(username, password)) {
                admin.displayInfo();
            } else {
                System.out.println("Login Admin gagal! Username atau password salah.");
            }
        } else if (pilihan.equals("2")) {
            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            if (mahasiswa.login(nama, nim)) {
                mahasiswa.displayInfo();
            } else {
                System.out.println("Login Mahasiswa gagal! Nama atau NIM salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid!");
        }
        scanner.close();
    }
}