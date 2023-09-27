import java.util.Scanner;
public class PemilihanPercobaan121 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int angka = input21.nextInt();

        String hasil =(angka % 2 == 0 ) ? "genap" : "ganjil";
        System.out.println("Bilangan "+ angka+" adalah bilangan "+ hasil);
        input21.close();
    }
}
