import java.util.Scanner;

public class Lingkaran21 {
    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      int r;
      double phi = 3.14, keliling, luas;

      System.out.print("Masukkan jari-jari lingkaran : ");
      r = sc.nextInt();
      keliling = 2*phi*r;
      luas = phi*r*r;
      System.out.println("Maka Keliling lingkaran adalah " + keliling);
      System.out.println("Maka Luas lingkaran adalah " + luas);

      sc.close();
    }
}
