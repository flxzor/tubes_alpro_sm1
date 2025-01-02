import java.util.Scanner;

public class hotel {

    public static String[] menuJenisKamar() {
        String[] jenisKamar = { "Standard", "Deluxe", "Suite" };
        return jenisKamar;
    }

    public static int[] hargaKamar() {
        int[] hargaKamar = { 500000, 700000, 1000000 };
        return hargaKamar;
    }

    public static String pilihJenisKamar(int jenisKamar) {
        switch (jenisKamar) {
            case 1:
                return "Terimakasih telah memilih Kamar Standar\n";

            case 2:
                return "Terimakasih telah memilih Kamar Deluxe\n";

            case 3:
                return "WOOW!!!!, Terimakasih telah memilih Kamar Suite\n";

            default:
                return "Jenis kamar yang anda pilih tidak tersedia\n";

        }

    }

    public static int[] lantaiKamar() {
        int[] lantai = { 1, 2, 3, 4, 5 };
        return lantai;

    }

    public static String hargaLantaiKamar(int pilihLantai) {
        switch (pilihLantai) {
            case 1:
                return "Harga normal\n";
            case 2:
                return "Harga + Rp.20.000\n";
            case 3:
                return "Harga + Rp.40.000\n";
            case 4:
                return "Harga + Rp.60.000\n";
            case 5:
                return "Harga + Rp.80.000\n";
            default:
                return "Lantai tidak valid. Pilih antara 1-5.\n";
        }
    }

    public static String[] paketKhusus() {
        String[] paket = { "Weeding Rp. 20.000.000", "Pijat Refleksi Rp. 600.000", "Ulang Tahun Rp. 5.0000.000",
                "Skip paket" };
        return paket;

    }

    public static String pilihPaket(int pilihPaket) {

        switch (pilihPaket) {
            case 1:
                return "Selamat Menikah Bro, semoga lancar!!!\n";

            case 2:
                return "HAHAHA..... kamu cape yaa!!!\n";

            case 3:
                return "Selamat Ulang Tahun, semoga sukses!!!\n";

            case 4:
                return "Yahhh sayang banget.....\n";

            default:
                return "Maaf paket tidak tersedia\n";

        }

    }

    public static String perubahan(int perubahan) {

        switch (perubahan) {
            case 1:
                return "Jenis kamar apa yang ingin anda pilih???";

            case 2:
                return "Lantai berpa yang anda inginkan???";

            case 3:
                return "Paket mana yang ingin anda pilih???";

            default:
                return "hallo";
        }

    }

    public static int hitungHargaTotal(int pilihanKamar, int pilihanLantai, int pilihanPaket) {
        int[] hargaKamar = hargaKamar();
        int hargaKamarDipilih = hargaKamar[pilihanKamar - 1];

        int biayaTambahanLantai = 0;
        switch (pilihanLantai) {
            case 1:
                biayaTambahanLantai = 0;
                break;
            case 2:
                biayaTambahanLantai = 20000;
                break;
            case 3:
                biayaTambahanLantai = 40000;
                break;
            case 4:
                biayaTambahanLantai = 60000;
                break;
            case 5:
                biayaTambahanLantai = 80000;
                break;
            default:
                biayaTambahanLantai = 0;
                break;
        }

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
            case 4:
                biayaPaket = 0;
                break;
            default:
                biayaPaket = 0;
                break;
        }

        return hargaKamarDipilih + biayaTambahanLantai + biayaPaket;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("***************");
        System.out.println("RESERVASI HOTEL");
        System.out.println("---------------");
        System.out.println("Jenis Kamar");
        System.out.println("Lantai Kamar");
        System.out.println("Paket Khusus");
        System.out.println("***************\n");

        System.out.println("...................");
        System.out.println("Masukan nama anda :");
        String namaUser = in.next();
        System.out.println(".......................");
        System.out.println("Masukan nomor hp anda :");
        String nomorUser = in.next();
        System.out.println("........................");
        System.out.println("Masukan nomor KTP anda :");
        String ktpUser = in.next();
        System.out.println("........................\n");

        System.out.println("=======================================");
        System.out.println("Masukan 1 untuk melanjutkan reservasi: ");
        System.out.println("=======================================");
        int pilihan = in.nextInt();
        System.out.println("");

        if (pilihan == 1) {
            System.out.println("Jenis kamar yang tersedia:");
            String[] kamar = menuJenisKamar();
            int[] harga = hargaKamar();
            for (int i = 0; i < kamar.length; i++) {
                System.out.println((i + 1) + ". " + kamar[i] + " harga Rp." + harga[i] + "");
            }
        } else {
            System.out.println("Pilihan tidak valid atau fitur belum tersedia.");
        }

        System.out.println("-------------------");
        System.out.println("Pilih Jenis Kamar");
        System.out.println("-------------------");
        int pilihan1 = in.nextInt();
        System.out.println(pilihJenisKamar(pilihan1));

        System.out.println("=======================================");
        System.out.println("Masukan 1 untuk melanjutkan reservasi: ");
        System.out.println("=======================================");
        pilihan = in.nextInt();
        System.out.println("");

        if (pilihan == 1) {
            System.out.println("Pilihan lantai yang tersedia :");

            int[] lantai = lantaiKamar();
            for (int i = 0; i < lantai.length; i++) {
                System.out.println((i + 1) + ". Lantai " + lantai[i]);

            }
        } else {
            System.out.println("Maaf hotel kami hanya menyediakan lantai 1-5");
        }

        System.out.println("-------------------");
        System.out.println("Pilih Lantai Kamar");
        System.out.println("-------------------");

        int pilihan2 = in.nextInt();
        System.out.println(hargaLantaiKamar(pilihan2));

        System.out.println("=======================================");
        System.out.println("Masukan 1 untuk melanjutkan reservasi: ");
        System.out.println("=======================================");
        pilihan = in.nextInt();

        if (pilihan == 1) {
            System.out.println("Menu Paket Khusus");

            String[] paket = paketKhusus();
            for (int i = 0; i < paket.length; i++) {
                System.out.println((i + 1) + ". " + paket[i]);
            }
        } else {
            System.out.println("Error!!!");
        }

        System.out.println("Pilih paket Khusus");
        int pilihan3 = in.nextInt();
        System.out.println(pilihPaket(pilihan3));

        System.out.println("Apa ada yang ingin anda ubah[y/n]");

        String yOrn = in.next();

        if (yOrn.equalsIgnoreCase("y")) {
            System.out.println("!. Jenis Kamar");
            System.out.println("2. Lantai Kamar");
            System.out.println("3. Paket Khusus");
            int perubahan = in.nextInt();
            System.out.println(perubahan(perubahan));

        } else {
            System.out.println("--------------------------");
            System.out.println("------NOTA PEMESANAN------");
            System.out.println("Nama : " + namaUser);
            System.out.println("Nomor : " + nomorUser);
            System.out.println("KTP : " + ktpUser);
            System.out.println("Harga Total: Rp." + hitungHargaTotal(pilihan1, pilihan2, pilihan3));
            System.out.println("--------------------------");

        }

        in.close();
    }

}
