public class LihatReservasi {
    public void lihatReservasi() {
        if (Base.pilihan1 == 0) {
            System.out.println("Anda belum memiliki reservasi.");
        } else {
            System.out.println("Berikut adalah detail reservasi Anda:");
            RincianPesanan pesanan = new RincianPesanan();
            pesanan.lihatRincian(Base.namaUser, Base.nomorUser, Base.ktpUser, Base.pilihan1, Base.pilihan2, Base.pilihan3);
        }
    }
}
