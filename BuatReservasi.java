import java.util.Scanner;
public class BuatReservasi {
    public void buatReservasi(Scanner in) {
        if (Base.pilihan1 == 0) {
            System.out.println("Masukan nama anda :");
            in.nextLine();
            Base.namaUser = in.nextLine();
            System.out.println("Masukan nomor hp anda :");
            Base.nomorUser = in.nextLine();
            System.out.println("Masukan nomor KTP anda :");
            Base.ktpUser = in.nextLine();
    
            Pilihan pilihan = new Pilihan();
            Base.pilihan1 = pilihan.pilihJenisKamar(in);
            Base.pilihan2 = pilihan.pilihLantai(in);
            Base.pilihan3 = pilihan.pilihPaket(in);
    
            System.out.println("Apa ada yang ingin anda ubah[y/n]?");
            char yOrn = in.next().charAt(0);
    
            if (yOrn == 'y') {
                UpdateReservasi update = new UpdateReservasi();
                update.updateReservasi(in);
            }
    
            RincianPesanan pesanan = new RincianPesanan();
            pesanan.lihatRincian(Base.namaUser, Base.nomorUser, Base.ktpUser, Base.pilihan1, Base.pilihan2, Base.pilihan3);
        } else {
            System.out.println("Anda sudah memiliki reservasi sebelumnya.");
        }
    }
}