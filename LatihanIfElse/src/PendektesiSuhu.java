import java.util.Scanner;

public class PendektesiSuhu {
    public static void main(String[] args) {

        int suhu;

        System.out.print("Masukkan suhu: ");

        Scanner temperatur = new Scanner(System.in);

        suhu = temperatur.nextInt();

        if (suhu < 20) {
            System.out.println("suhu " + suhu + " Celcius, Dingin.");
        } else if (suhu <= 292) {
            System.out.println("suhu " + suhu + " Celcius, Normal.");
        } else if (suhu == 31) {
            System.out.println("suhu " + suhu + " Celsius, Hangat.");
        } else if (suhu > 32 &&  suhu < 100){
            System.out.println("suhu " + suhu + " Celsius, Panas");
        } else {
            System.out.println("suhu " + suhu + " Celsius, Tidak terdeteksi");
        }
    }
}
