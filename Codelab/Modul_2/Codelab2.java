public class Codelab2 {
    public static void main(String[] args) {

        RekeningBank rekening1 = new RekeningBank("202410370110450", "Muhammad Fayyad Hudzaqi", 500000.0);

        RekeningBank rekening2 = new RekeningBank("202310370110466", "I An H Kurnia", 1000000.0);

        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        System.out.println("\nMaharani menyetor Rp200000.0. Saldo sekarang: Rp" + rekening1.setorUang(200000.0));
        System.out.println("Amelia menyetor Rp500000.0. Saldo sekarang: Rp" + rekening2.setorUang(500000.0));

        System.out.println("\nMaharani menarik Rp800000.0. " + rekening1.tarikUang(800000.0));
        System.out.println("Amelia menarik Rp300000.0. " + rekening2.tarikUang(300000.0));

        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        System.out.println("Process finished with exit code 0");
    }
}

class RekeningBank {
    String nomorRekening;
    String namaPemilik;
    double saldo;

    public RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    void tampilkanInfo() {
        System.out.println("\nNomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp" + saldo);
    }

    double setorUang(double jumlah) {
        saldo += jumlah;
        return saldo;
    }

    String tarikUang(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            return "(\nBerhasil) Saldo sekarang: Rp" + saldo;
        } else {
            return "(Gagal, Saldo tidak mencukupi) Saldo saat ini: Rp" + saldo;
        }
    }
}
