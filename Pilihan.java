import java.util.Scanner;
public class Pilihan {
    public int pilihJenisKamar(Scanner in) {
        int pilihan;
        while (true) {
            System.out.println("Jenis kamar yang tersedia:");
            for (int i = 0; i < Base.jenisKamar.length; i++) {
                System.out.println((i + 1) + ". " + Base.jenisKamar[i] + " harga Rp." + Base.hargaKamar[i]);
            }
            System.out.println("Pilih Jenis Kamar:");
            pilihan = in.nextInt();
            if (pilihan >= 1 && pilihan <= Base.jenisKamar.length) {
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih angka antara 1 dan " + Base.jenisKamar.length);
            }
        }
        return pilihan;
    }

    public int pilihLantai(Scanner in) {
        int pilihan;
        while (true) {
            System.out.println("Pilihan lantai yang tersedia:");
            for (int i = 0; i < Base.lantai.length; i++) {
                System.out.println((i + 1) + ". Lantai " + Base.lantai[i]);
            }
            System.out.println("Pilih Lantai Kamar:");
            pilihan = in.nextInt();
            if (pilihan >= 1 && pilihan <= Base.lantai.length) {
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih angka antara 1 dan " + Base.lantai.length);
            }
        }
        return pilihan;
    }

    public int pilihPaket(Scanner in) {
        int pilihan;
        while (true) {
            System.out.println("Menu Paket Khusus:");
            for (int i = 0; i < Base.paket.length; i++) {
                System.out.println((i + 1) + ". " + Base.paket[i]);
            }
            System.out.println("Pilih paket Khusus:");
            pilihan = in.nextInt();
            if (pilihan >= 1 && pilihan <= Base.paket.length) {
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih angka antara 1 dan " + Base.paket.length);
            }
        }
        return pilihan;
    }
}