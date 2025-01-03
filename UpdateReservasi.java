import java.util.Scanner;

public class UpdateReservasi {
    public void updateReservasi(Scanner in) {
        Pilihan pilihan = new Pilihan();
        boolean selesai = false;
        if (Base.pilihan1 == 0) {
            System.out.println("Belum ada Reservasi, Tidak ada yang bisa di ubah :).");
        } else {
            while (!selesai) {
                System.out.println("Pilih bagian yang ingin diubah:");
                System.out.println("1. Identitas pemesan");
                System.out.println("2. Jenis Kamar");
                System.out.println("3. Lantai Kamar");
                System.out.println("4. Paket Khusus");
                System.out.println("5. Selesai");
                int perubahan = in.nextInt();

                switch (perubahan) {
                    case 1:
                        System.out.println("Masukan nama anda :");
                        in.nextLine();
                        Base.namaUser = in.nextLine();
                        System.out.println("Masukan nomor hp anda :");
                        Base.nomorUser = in.nextLine();
                        System.out.println("Masukan nomor KTP anda :");
                        Base.ktpUser = in.nextLine();
                        System.out.println("Identitas telah diperbarui.");
                        break;
                    case 2:
                        Base.pilihan1 = pilihan.pilihJenisKamar(in);
                        System.out.println("Jenis kamar telah diperbarui.");
                        break;
                    case 3:
                        Base.pilihan2 = pilihan.pilihLantai(in);
                        System.out.println("Lantai kamar telah diperbarui.");
                        break;
                    case 4:
                        Base.pilihan3 = pilihan.pilihPaket(in);
                        System.out.println("Paket khusus telah diperbarui.");
                        break;
                    case 5:
                        selesai = true;
                        System.out.println("Berikut adalah detail reservasi Anda:");
                        RincianPesanan pesanan = new RincianPesanan();
                        pesanan.lihatRincian(Base.namaUser, Base.nomorUser, Base.ktpUser, Base.pilihan1, Base.pilihan2, Base.pilihan3);
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            }
        }
    }
}