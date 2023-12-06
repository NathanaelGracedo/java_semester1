import java.util.Scanner;
public class doWhileCuti21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String Konfirmasi;

        System.out.print("Jatah Cuti: ");
        jatahCuti = sc.nextInt();

        do{
            System.out.print("Apakah anda ingin mengambil cuti (y/t)? ");
            Konfirmasi = sc.next();

            if (Konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah Hari: ");
                jumlahHari = sc.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti );
                } else {
                    System.out.println("Sisa jatah cuti anda tidak mencukupi,\napakah anda ingin mengisi ulang (y/n)? ");
                    Konfirmasi = sc.next();
                    if (!Konfirmasi.equalsIgnoreCase("y"))
                    break;
                }
            } else {
                break;
            }
        } while (jatahCuti > 0 );

        sc.close();
    }
}



















































