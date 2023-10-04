import java.util.Scanner;
public class hargaBayar21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mrkBuku;
        int harga, jmlhBarang, hlmnBuku;
        double dskn, total, bayar, jmlhDiskon;
        
        System.out.println("============================================================================");
        System.out.print("Masukkan Merk Buku yang anda beli \t\t\t: ");
        mrkBuku = sc.nextLine();
        System.out.print("Masukkan jumlah halaman buku yang anda beli \t\t: ");
        hlmnBuku = sc.nextInt();
        System.out.print("Masukkan harga barang yang dibeli /Lusin \t\t: ");
        harga = sc.nextInt();
        System.out.print("Masukkan Jumlah jumlah barang yang dibeli /Lusin \t: ");
        jmlhBarang = sc.nextInt();
        System.out.print("Masukkan diskon yang anda dapatkan \t\t\t: ");
        dskn = sc.nextDouble();
        System.out.println("============================================================================");

        total = harga*jmlhBarang;
        jmlhDiskon = total*dskn;
        bayar = total - jmlhDiskon;

        System.out.println("Terimakasih karena telah membeli buku "+ mrkBuku +" dengan jumlah halaman " + hlmnBuku);
        System.out.println("Diskon yang anda dapatkan adalah " + jmlhDiskon);
        System.out.println("Total harga yang harus anda bayar adalah " + bayar);

    sc.close();
    }
}
