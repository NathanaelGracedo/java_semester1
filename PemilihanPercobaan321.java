import java.util.Scanner;
public class PemilihanPercobaan321 {
    public static void main(String[] args) {
        double angka1, angka2, hasil;
        char operator;

        Scanner input21 = new Scanner(System.in);
        System.out.print("Masukkan Angka Pertama \t\t: ");
        angka1 = input21.nextDouble();
        System.out.print("Masukkan Angka Kedua \t\t: ");
        angka2 = input21.nextDouble();
        System.out.print("Masukkan Operator (+ - * /) \t: ");
        operator = input21.next().charAt(0);

        switch(operator){
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " + " + angka2 + " = " + hasil);
                
            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + " - " + angka2 + " = " + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + " * " + angka2 + " = " + hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println(angka1 + " / " + angka2 + " = " + hasil);
                break;
            default:
                System.out.println("Operator yang dimasukkan tidak valid");
            input21.close();
        }
    }
}
