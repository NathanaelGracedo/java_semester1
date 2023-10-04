import java.util.Scanner;
public class Pemilihan2Percobaan121 {
    public static void main(String[] args) throws Exception {
       Scanner input21 = new Scanner(System.in);
       int tahun;
       
       //input
       System.out.print("Masukkan Tahun : ");
       tahun= input21.nextInt();

       //condition
       if((tahun % 4) == 0){
        if ((tahun % 100) != 0){
            System.out.println("Tahun "+ tahun +" adalah tahun kabisat");
        }
        else{
            System.out.println("Tahun "+ tahun +" bukan tahun kabisat");
        }
    }else{
        System.out.println("Tahun "+ tahun +" adalah tahun kabisat");
    }

    input21.close();
    }
}
