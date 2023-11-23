
public class tugasno2_21 {
    public static void main(String[] args) {
        String[] namaMhswa = {"Sari", "Rina", "Yani", "Dwi", "Lusi" };
        double[][] nilaiMhswa ={
                {20, 19, 25, 20, 10, 0, 10},
                {30, 30, 40, 10, 15, 20, 25},
                {5, 0 , 20, 25, 10, 5, 45},
                {50, 0, 7, 8, 0, 30, 60},
                {15, 10, 16, 15, 10, 10, 5}
        };
        
        System.out.println("Nilai Mahasiswa Minggu ke-1 hingga ke-7");
        for(int i=0; i < 5; i++){
            System.out.println("Mahasiswa atas nama " + namaMhswa[i]);
            for(int j=0; j < 7; j++){
                System.out.println("Minggu ke-" + (j + 1) + " : " + nilaiMhswa[i][j]);
            }
        }
    }
}
