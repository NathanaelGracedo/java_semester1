import java.util.Scanner;

public class Gaji21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlhMasuk, jmlhTdkMasuk, totGaji;
        int gaji, potGaji;

        System.out.print("Masukkan Jumlah gaji/1 Hari Masuk \t\t: ");
        gaji = sc.nextInt();
        System.out.print("Masukkan Potongan gaji/1 Hari Tidak Masuk \t: ");
        potGaji = sc.nextInt();
        System.out.print("Masukkan Jumlah Hari Masuk Kerja anda \t\t: ");
        jmlhMasuk = sc.nextInt();
        System.out.print("Masukkan Jumlah Hari Tidak Masuk Kerja anda \t: ");
        jmlhTdkMasuk = sc.nextInt();

        totGaji = (jmlhMasuk * gaji) - (jmlhTdkMasuk * potGaji);
        System.out.println("Gaji yang anda terima adalah " + totGaji);
        
        sc.close();
    }
}
