import java.util.Scanner;

public class kereta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean pesanLagi = true;
        int totalHarga = 0; // Menyimpan total harga selama loop berjalan

        System.out.println("Selamat datang di Sistem Pemesanan Tiket Kereta Api");

        while (pesanLagi) {
            System.out.println("\nSilakan pilih jurusan:");
            System.out.println("1. Cikampek-Tuparev [Business : Rp.20.000 | Executive : Rp. 30.000]");
            System.out.println("2. Johar-Bypass     [Business : Rp.10.000 | Executive : Rp. 20.000]");
            System.out.println("3. Klari-Badami     [Business : Rp.15.000 | Executive : Rp. 25.000]");

            System.out.print("Pilihan jurusan (1/2/3): ");
            int pilihanJurusan = scanner.nextInt();

            System.out.println("Silakan pilih kelas tiket:");
            System.out.println("1. Business");
            System.out.println("2. Executive");

            System.out.print("Pilihan kelas tiket (1/2): ");
            int pilihanKelas = scanner.nextInt();

            

            int hargaTiket = 0;
            String jurusan = "";

            switch (pilihanJurusan) {
                case 1:
                    jurusan = "Cikampek-Tuparev";
                    if (pilihanKelas == 1) {
                        hargaTiket = 20000;
                    } else if (pilihanKelas == 2) {
                        hargaTiket = 30000;
                    }
                    break;
                case 2:
                    jurusan = "Johar-Bypass";
                    if (pilihanKelas == 1) {
                        hargaTiket = 10000;
                    } else if (pilihanKelas == 2) {
                        hargaTiket = 20000;
                    }
                    break;
                case 3:
                    jurusan = "Klari-Badami";
                    if (pilihanKelas == 1) {
                        hargaTiket = 15000;
                    } else if (pilihanKelas == 2) {
                        hargaTiket = 25000;
                    }
                    break;
                default:
                    System.out.println("Pilihan jurusan tidak valid.");
                    return;
            }

            // Menambahkan harga tiket ke total harga
            totalHarga += hargaTiket;

            System.out.println("\n=== Tiket Kereta Api ===");
            System.out.println("Jurusan: " + jurusan);
            System.out.println("Kelas: " + (pilihanKelas == 1 ? "Business" : "Executive"));
            System.out.println("Harga Tiket: Rp " + hargaTiket);

            System.out.print("\nApakah Anda ingin memesan tiket lagi? (y/n): ");
            String jawaban = scanner.next();

            pesanLagi = jawaban.equalsIgnoreCase("y");
        }


        System.out.println("\nTotal Harga Tiket: Rp " + totalHarga);
        System.out.println("Terima kasih telah menggunakan layanan kami.");

        scanner.close();
    }
}
