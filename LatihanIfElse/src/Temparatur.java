import java.util.Scanner;

public class Temparatur {
    public static void main(String[] args) {

        int suhu;

        System.out.println("Masukkan suhu: ");

        Scanner temperatur = new Scanner(System.in);

        suhu = temperatur.nextInt();

        if (suhu == 30) {
            System.out.println("suhu " + suhu + " Celcius, normal.");
        } else if (suhu > 40) {
            System.out.println("suhu " + suhu + " Celcius, Panas.");
        } else if (suhu < 30) {
            System.out.println("suhu " + suhu + " Celsius, Dingin.");
        } else {
            System.out.println("suhu " + suhu + " Celsius, terlalu tinggi");
        }
    }
}
