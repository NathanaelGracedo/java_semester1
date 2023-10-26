import java.util.Scanner;

public class LinearSearch21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arrayInt;
        int key = 0;
        int hasil = 0;

        System.out.print("Masukkan jumlah elemen array : ");
        int n = input.nextInt();
        arrayInt = new int[n];

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan nilai elemen array ke-" + i + " : ");
            arrayInt[i] = input.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari :");
        key = input.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }
        if (hasil != 0) {
            System.out.println("Key ada dalam array pada posisi indeks ke-" + hasil);
        } else {
            System.out.println("Key tidak ditemukan");
        }
        input.close();
    }
}
