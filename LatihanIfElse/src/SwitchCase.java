import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        int suhu;

        System.out.print("Masukkan suhu: ");

        Scanner temperatur = new Scanner(System.in);

        suhu = temperatur.nextInt();

        switch (suhu) {
            case 20:
                System.out.println("Dingin"); break;
            case 29:
                System.out.println("Normal"); break;
            case 31:
                System.out.println("Hangat"); break;
            case 32:
                System.out.println("Panas"); break;
            default :
                System.out.println("Suhu tidak terdeteksi");
        }
    }
}
