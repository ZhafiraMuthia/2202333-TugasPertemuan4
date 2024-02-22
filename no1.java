package java_percabangan;

import java.util.Scanner;

public class no1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan ril: ");
        double bilanganRil = userInput.nextDouble();

        int angkaDepanKoma = (int) bilanganRil;

        int angkaBelakangKoma = (int) ((bilanganRil - angkaDepanKoma) * 100);

        if (angkaDepanKoma % 3 == 0 && angkaBelakangKoma % 3 == 0) {
            System.out.println("Angka di depan dan di belakang koma adalah kelipatan 3.");
        } else {
            System.out.println("Angka di depan dan di belakang koma bukan kelipatan 3.");
        }
        
        userInput.close();
    }
}
