import java.util.Scanner;

public class RataRataNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = sc.nextInt();

        // Membuat array 2 dimensi untuk menyimpan nilai mahasiswa
        double[][] nilaiMahasiswa = new double[jumlahMahasiswa][jumlahMataKuliah];

        // Memasukkan nilai-nilai mahasiswa ke dalam array
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan nilai-nilai untuk Mahasiswa ke-" + (i + 1));
            for (int j = 0; j < jumlahMataKuliah; j++) {
                System.out.print("Nilai Mata Kuliah ke-" + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = sc.nextDouble();
            }
        }

        // Menghitung rata-rata nilai setiap mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            double totalNilai = 0;
            for (int j = 0; j < jumlahMataKuliah; j++) {
                totalNilai += nilaiMahasiswa[i][j];
            }
            double rataRata = totalNilai / jumlahMataKuliah;
            System.out.println("Rata-rata Nilai Mahasiswa ke-" + (i + 1) + ": " + rataRata);
        }
        sc.close();
    }
}
