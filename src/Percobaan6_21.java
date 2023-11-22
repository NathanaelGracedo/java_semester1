import java.util.Scanner;
public class Percobaan6_21 {
    static int hitungLuas (int pjg, int lb){
        int Luas = pjg * lb;
        return Luas;
    }
    static int hitungVol (int tinggi, int a, int b) {
        int vol = hitungLuas(a,b) * tinggi;
        return vol;
    }
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        
        int p, l, t, L, vol;

        System.out.print("Masukkan panjang : ");
        p = input.nextInt();
        System.out.print("Masukkan lebar : ");
        l = input.nextInt();
        System.out.print("Masukkan tinggi : ");
        t = input.nextInt();

        L=p*l;
        System.out.println("Luas persegi panjang adalah : " + L);

        vol=p*l*t;
        System.out.println("Volume balok adalah : " + vol);
        input.close();
    }
}
