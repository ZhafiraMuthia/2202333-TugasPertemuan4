package java_percabangan;

import java.util.Scanner;

public class no2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int bil1, bil2;
        char operator;
        
        System.out.print("Masukkan bilangan pertama                     : ");
        bil1 = userInput.nextInt();
        System.out.print("Masukkan bilangan kedua                       : ");
        bil2 = userInput.nextInt();
        System.out.print("Masukkan operator aritmatika (+, -, *, /, %)  : ");
        operator = userInput.next().charAt(0);

        if (operator == '+') {
            System.out.println("Hasil penjumlahan " + bil1 + " dan " + bil2 + " adalah " + (bil1 + bil2));
        } else if (operator == '-') {
            System.out.println("Hasil pengurangan " + bil1 + " dan " + bil2 + " adalah " + (bil1 - bil2));
        } else if (operator == '*') {
            System.out.println("Hasil perkalian "   + bil1 + " dan " + bil2 + " adalah " + (bil1 * bil2));
        } else if (operator == '/') {
            if (bil2 != 0) {
                System.out.println("Hasil pembagian " + bil1 + " dan " + bil2 + " adalah " + ((double)bil1 / bil2));
            } else {
                System.out.println("Tak Terdefinisi");
                return;
            }
        } else if (operator == '%') {
            if (bil2 != 0) {
                System.out.println("Hasil modulus "   + bil1 + " dan " + bil2 + " adalah " + (bil1 % bil2));
            } else {
                System.out.println("Tak Terdefinisi");
                return;
            }
        } else {
            System.out.println("Operator tidak valid.");
            return;
        }

        userInput.close();
    }
}
