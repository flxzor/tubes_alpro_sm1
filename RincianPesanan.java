public class RincianPesanan {
    public void lihatRincian(String nama, String nomor, String ktp, int pilihanKamar, int pilihanLantai, int pilihanPaket) {
        int totalHarga = Base.hargaKamar[pilihanKamar - 1] + ((pilihanLantai - 1) * 20000);
        System.out.println("--------------------------");
        System.out.println("------Rincian Pemesanan------");
        System.out.println("Nama : " + nama);
        System.out.println("Nomor : " + nomor);
        System.out.println("KTP : " + ktp);
        System.out.println("Jenis Kamar : " + Base.jenisKamar[pilihanKamar - 1]);
        System.out.println("Lantai : " + Base.lantai[pilihanLantai - 1]);
        System.out.println("Paket : " + Base.paket[pilihanPaket - 1]);
        System.out.println("Harga Total: Rp." + totalHarga);
        System.out.println("--------------------------");
    }
}