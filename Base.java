import java.util.Scanner;

public class Base {
    public static String[] jenisKamar = {"Standard","Deluxe","Suite"};
    public static int[] hargaKamar = {500000,700000,1000000};
    public static int[] lantai = {1,2,3,4,5};
    public static String[] paket = {"Weeding Rp. 20.000.000","Pijat Refleksi Rp. 600.000","Ulang Tahun Rp. 5.000.000","Skip paket" };
    public static int[] hargaPaket = {20000000,600000,5000000, 0};
    public static String namaUser, nomorUser, ktpUser;
    public static int pilihan1 = 0, pilihan2 = 0, pilihan3 = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("*=====================*");
            System.out.println("RESERVASI HOTEL");
            System.out.println("*=====================*");
            System.out.println("Selamat datang di Menu Reservasi Hotel");
            System.out.println("1. Buat Reservasi");
            System.out.println("2. Lihat Reservasi");
            System.out.println("3. Update Reservasi");
            System.out.println("4. Hapus Reservasi");
            System.out.println("5. Keluar");
            System.out.println("*=====================*");
            System.out.print("Pilih menu: ");
            int menu = in.nextInt();

            switch (menu) {
                case 1:
                    BuatReservasi reservasi = new BuatReservasi();
                    reservasi.buatReservasi(in);
                    break;
                case 2:
                    LihatReservasi lihat = new LihatReservasi();
                    lihat.lihatReservasi();
                    break;
                case 3:
                    UpdateReservasi update = new UpdateReservasi();
                    update.updateReservasi(in);
                    break;
                case 4:
                    HapusReservasi hapus = new HapusReservasi();
                    hapus.hapusReservasi(in);
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan layanan kami!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}