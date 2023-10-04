public class ContohVariabel21 {
    public static void main(String[] args)  {
        String hobi = "bermain petak umpet";
        boolean pandai = true;
        char jenisKelamin = 'L';
        byte umur = 20;
        double ipk = 3.24, tinggi = 1.78;
        
        System.out.println("Salah satu hobi saya adalah " + hobi);
        System.out.println("Apakah Pandai " + pandai);
        System.out.println("Jenis kelamin " + jenisKelamin);
        System.out.println("Umurku saat ini " + umur);
        System.out.println(String.format("Saya berIpk %s, dengan tinggi badan  %s", ipk, tinggi));
    }
}
