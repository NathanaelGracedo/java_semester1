import java.util.Scanner;

public class konversiMataUang {
    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);

        // Nilai tukar mata uang terhadap Rupiah
        double poundkeRupiah = 19490.0; // 1 Pound ke Rupiah
        double franckeRupiah = 11230.0; // 1 Franc ke Rupiah
        double markkeRupiah = 16180.0; // 1 Mark ke Rupiah
        double lirakeRupiah = 1580.0;  // 1 Lira ke Rupiah

        // Meminta pengguna memasukkan jumlah mata uang yang akan dikonversi
        System.out.print("Masukkan jumlah Pound: ");
        double poundKonversi = masukkan.nextDouble();

        System.out.print("Masukkan jumlah Franc: ");
        double francKonversi = masukkan.nextDouble();

        System.out.print("Masukkan jumlah Mark: ");
        double markKonversi = masukkan.nextDouble();

        System.out.print("Masukkan jumlah Lira: ");
        double liraKonversi = masukkan.nextDouble();

        masukkan.close();

        // Menghitung jumlah Rupiah setelah konversi
        double rupiahPound = poundKonversi * poundkeRupiah;
        double rupiahFranc = francKonversi * franckeRupiah;
        double rupiahMark = markKonversi * markkeRupiah;
        double rupiahLira = liraKonversi * lirakeRupiah;

        // Mencetak tabel konversi mata uang ke Rupiah
        System.out.println("Mata Uang\tJumlah\t\tTukar ke Rupiah");
        System.out.println("-----------------------------------------");
        System.out.println("Pound\t\t" + poundKonversi + "\t\t" + rupiahPound);
        System.out.println("Franc\t\t" + francKonversi + "\t\t" + rupiahFranc);
        System.out.println("Mark\t\t" + markKonversi + "\t\t" + rupiahMark);
        System.out.println("Lira\t\t" + liraKonversi + "\t\t" + rupiahLira);
    }
}
