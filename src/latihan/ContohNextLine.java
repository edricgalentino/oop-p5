package latihan;

import java.util.Scanner;

public class ContohNextLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kalimat apapun: ");
        String kalimat = scanner.nextLine();

        String[] kataKata = kalimat.split(" ");

        System.out.println("Jumlah kata: " + kataKata.length);
        System.out.println("Kata-kata yang dimasukkan:");
        for (String k : kataKata) {
            System.out.println(k);
        }

        scanner.close();
    }
}
