import java.util.Scanner;

public class whileKelipatan21{
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);

        int kelipatan, jumlah = 0, counter = 0;

        System.out.print("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = input21.nextInt();
        input21.close();

        int i = 1;
        while (i <=50) {
            if (i % kelipatan == 0){
                jumlah += i;
                counter++;
            }
            i++;
        }
        double ratarata;
        if (counter != 0) {
            ratarata = (double) jumlah / counter;
        } else {
            ratarata = 0;
        }
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1-50 adalah %d\n", kelipatan, jumlah);
        System.out.printf("Rata-rata dari bilangan kelipatan %d dari 1-50 adalah %2f\n", kelipatan, ratarata);
    }
}