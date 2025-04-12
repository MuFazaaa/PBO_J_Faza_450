import java.util.Scanner;

class Tugas2 {
    public static void main(String[] a) {
        Scanner input = new Scanner(System.in);
        Mahasiswa mahasiswa = new Mahasiswa();
        Admin admin = new Admin();
        System.out.println("----------HALAMAN LOGIN----------");
        System.out.println("");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Login sebagai: ");
        int pilihan = input.nextInt();
        input.nextLine();

        switch(pilihan) {
            case 1: admin.mainA(); break;
            case 2: mahasiswa.mainM(); break;
            default: System.out.println("Pilihan tidak valid."); break;
        }
        input.close();
    }
}

class Admin {
    private String username;
    private String password;

    public Admin() {
        // Data admin yang telah ditentukan
        this.username = "faza450";
        this.password = "password450";
    }

    public void mainA() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan username: ");
        String username = input.nextLine();
        System.out.print("Masukan password: ");
        String password = input.nextLine();
        System.out.println("");
        System.out.println("");

        if(username.equals(this.username) && password.equals(this.password)) {
            login();
        } else {
            System.out.println("Username atau Password salah");
        }
    }

    void login() {
        System.out.println("Login sebagai Admin berhasil");
    }
}

class Mahasiswa {
    private String username;
    private String nim;

    public Mahasiswa() {
        // Data mahasiswa yang telah ditentukan
        this.username = "muhammad fayyad";
        this.nim = "202410370110450";
    }

    public void mainM() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan username: ");
        String username = input.nextLine();
        System.out.print("Masukan nim: ");
        String nim = input.nextLine();
        System.out.println("");
        System.out.println("");

        if(username.equals(this.username) && nim.equals(this.nim)) {
            login();
            DisplayInfo(username, nim);
        } else {
            System.out.println("Username atau password salah");
        }
    }

    void login() {
        System.out.println("Login sebagai Mahasiswa berhasil\n");
    }

    void DisplayInfo(String username, String nim) {
        System.out.println("Nama Mahasiswa: " + username);
        System.out.println("Nim nya adalah: " + nim);
    }
}