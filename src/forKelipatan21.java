import java.util.Scanner;
public class forKelipatan21 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int kelipatan, jumlah = 0, counter= 0;

        System.out.print("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = scan.nextInt();

        scan.close();

        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
        }
        double ratarata;

        if (counter != 0) {
            ratarata = (double) jumlah / counter;
        } else {
            ratarata = 0;
        }
        scan.close();
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        System.out.printf("Rata-rata bilangan kelipatan %d dari 1-50 adalah %2f\n", kelipatan, ratarata);
    }
}
