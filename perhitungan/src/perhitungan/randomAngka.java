package perhitungan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class randomAngka {
    static void fungsiRandom(int panjangData) {
        int[] angka = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int count = 0; count < panjangData; count++) {
            System.out.print(angka[new Random().nextInt(angka.length)] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        randomAngka panggil = new randomAngka();
        Scanner s = new Scanner(System.in);
        int angkaMasuk;
        do {
            System.out.print("Masukkan panjang data: ");
            angkaMasuk = s.nextInt();
            Boolean ulangi = false;
            if (angkaMasuk > 10) {
                System.err.println("Maksimal panjang data adalah 10");
                ulangi = true;
            } else {
                panggil.fungsiRandom(angkaMasuk);
                break;
            }
        } while (true);        
    }
}
