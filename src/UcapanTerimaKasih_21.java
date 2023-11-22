import java.util.Scanner;
public class UcapanTerimaKasih_21 {
    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuliskan NAMA orang yang ingin anda beri ucapan : ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }
    public static void UcapanTerimakasih(){
        String nama = PenerimaUcapan();
        String tambahan = UcapanTambahan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n"+
        "You inspired in me a love for learning and made me feel like i could ask you anithing.\n"+ tambahan);
    }
    public static String UcapanTambahan(){
        String tambahan = "Wish all the best for you.";
        return tambahan;
    }
    public static void main(String[] args) {
        UcapanTerimakasih();
    }
}
