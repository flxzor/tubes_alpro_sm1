import java.util.Scanner;
public class HapusReservasi {
    public void hapusReservasi(Scanner in) {
        if (Base.pilihan1 == 0) {
            System.out.println("Tidak ada reservasi yang dapat dihapus.");
        } else {
            System.out.println("Apakah Anda ingin menghapus reservasi Anda? (y/n)");
            String konfirmasi = in.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                Base.namaUser = null;
                Base.nomorUser = null;
                Base.ktpUser = null;
                Base.pilihan1 = 0;
                Base.pilihan2 = 0;
                Base.pilihan3 = 0;

                System.out.println("Reservasi Anda telah berhasil dihapus.");
            } else {
                System.out.println("Penghapusan reservasi dibatalkan.");
            }
        }
    }
}