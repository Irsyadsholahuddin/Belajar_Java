import java.util.Scanner;

public class JuraganAngkot {

    private static String angkot;

    public static void main(String[] args) {

        Scanner Pajak = new Scanner(System.in);
        int angkot = 1;
        while (angkot <= 10){

            if (angkot == 8) {
                System.out.println("Genap : " + angkot);
            } else {
                System.out.println("ganjil : " + angkot);
            }
            angkot++;
        }

    }
    }