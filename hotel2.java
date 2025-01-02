import java.util.Scanner;

public class hotel2 {

    static String[] jenisKamar = { "Standard", "Deluxe", "Suite" };
    static int[] hargaKamar = { 500000, 700000, 1000000 };
    static int[] lantai = { 1, 2, 3, 4, 5 };
    static String[] paket = { "Weeding Rp. 20.000.000", "Pijat Refleksi Rp. 600.000", "Ulang Tahun Rp. 5.000.000", "Skip paket" };

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("***************");
            System.out.println("RESERVASI HOTEL");
            System.out.println("***************\n");

            System.out.println("Masukan nama anda :");
            String namaUser = in.next();
            System.out.println("Masukan nomor hp anda :");
            String nomorUser = in.next();
            System.out.println("Masukan nomor KTP anda :");
            String ktpUser = in.next();

            int pilihan1 = pilihJenisKamar(in);
            int pilihan2 = pilihLantai(in);
            int pilihan3 = pilihPaket(in);

            System.out.println("Apa ada yang ingin anda ubah[y/n]");
            String yOrn = in.next();

            if (yOrn.equalsIgnoreCase("y")) {
                int[] hasilUpdate = updateReservasi(in, pilihan1, pilihan2, pilihan3);
                pilihan1 = hasilUpdate[0];
                pilihan2 = hasilUpdate[1];
                pilihan3 = hasilUpdate[2];
            }
            cetakNota(namaUser, nomorUser, ktpUser, pilihan1, pilihan2, pilihan3);

            System.out.println("Apakah Anda ingin melakukan reservasi lagi? (y/n)");
            String lanjut = in.next();
            if (lanjut.equalsIgnoreCase("n")) {
                System.out.println("Terima kasih telah menggunakan layanan kami!");
                break;
            }
        }

    }

    static int pilihJenisKamar(Scanner in) {
        System.out.println("Jenis kamar yang tersedia:");
        for (int i = 0; i < jenisKamar.length; i++) {
            System.out.println((i + 1) + ". " + jenisKamar[i] + " harga Rp." + hargaKamar[i]);
        }
        System.out.println("Pilih Jenis Kamar:");
        return in.nextInt();
    }

    static int pilihLantai(Scanner in) {
        System.out.println("Pilihan lantai yang tersedia:");
        for (int i = 0; i < lantai.length; i++) {
            System.out.println((i + 1) + ". Lantai " + lantai[i]);
        }
        System.out.println("Pilih Lantai Kamar:");
        return in.nextInt();
    }

    static int pilihPaket(Scanner in) {
        System.out.println("Menu Paket Khusus:");
        for (int i = 0; i < paket.length; i++) {
            System.out.println((i + 1) + ". " + paket[i]);
        }
        System.out.println("Pilih paket Khusus:");
        return in.nextInt();
    }

    static int[] updateReservasi(Scanner in, int pilihan1, int pilihan2, int pilihan3) {
        System.out.println("1. Jenis Kamar");
        System.out.println("2. Lantai Kamar");
        System.out.println("3. Paket Khusus");
        int perubahan = in.nextInt();

        switch (perubahan) {
            case 1:
                pilihan1 = pilihJenisKamar(in);
                break;
            case 2:
                pilihan2 = pilihLantai(in);
                break;
            case 3:
                pilihan3 = pilihPaket(in);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
        return new int[] { pilihan1, pilihan2, pilihan3 };
    }

    static void cetakNota(String nama, String nomor, String ktp, int pilihanKamar, int pilihanLantai, int pilihanPaket) {
        int totalHarga = hitungHargaTotal(pilihanKamar, pilihanLantai, pilihanPaket);
        System.out.println("--------------------------");
        System.out.println("------NOTA PEMESANAN------");
        System.out.println("Nama : " + nama);
        System.out.println("Nomor : " + nomor);
        System.out.println("KTP : " + ktp);
        System.out.println("Jenis Kamar : " + jenisKamar[pilihanKamar - 1]);
        System.out.println("Lantai : " + lantai[pilihanLantai - 1]);
        System.out.println("Paket : " + paket[pilihanPaket - 1]);
        System.out.println("Harga Total: Rp." + totalHarga);
        System.out.println("--------------------------");
    }

    static int hitungHargaTotal(int pilihanKamar, int pilihanLantai, int pilihanPaket) {
        int hargaKamarDipilih = hargaKamar[pilihanKamar - 1];
        int biayaTambahanLantai = (pilihanLantai - 1) * 20000;
        int biayaPaket = 0;

        switch (pilihanPaket) {
            case 1:
                biayaPaket = 20000000;
                break;
            case 2:
                biayaPaket = 600000;
                break;
            case 3:
                biayaPaket = 5000000;
                break;
            default:
                break;
        }
        return hargaKamarDipilih + biayaTambahanLantai + biayaPaket;
    }
}
