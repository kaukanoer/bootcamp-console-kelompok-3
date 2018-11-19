package perhitungan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Kalkulasi {
    
    static void randomAngka(int panjangData) {
        ArrayList<Integer> angka = new ArrayList<>();
        for (int element = 0; element <= 9; element++) {
            angka.add(element);
        }
        Collections.shuffle(angka);
        int count;
        for (count = 0; count < panjangData; count++) {
            System.out.print(angka.get(count));            
        }
        System.out.println("");
    }
    //Optimalisasi metod untuk menghitung pecahan, menggunakan array
    static void hitungPecahan(int inputUang) {
        int[] uangPecahan = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 100, 50};
        int[] counterUangPecahan = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (int i = 0; i < uangPecahan.length; i++) {
            while (inputUang >= uangPecahan[i]) {
                inputUang -= uangPecahan[i];
                counterUangPecahan[i]++;
            }
        }
        for (int i = 0; i < uangPecahan.length; i++) {
            if (counterUangPecahan[i] != 0) {
                System.out.println(uangPecahan[i] + ": " + counterUangPecahan[i]);
            }
        }
    }
    
    public static void main(String[] args) {
        Kalkulasi panggil = new Kalkulasi();
//        Boolean ulangi = false;
//        do {
//            
//            int masukAngka = s.nextInt();
//            if (masukAngka >= 11) {
//                System.err.println("Angka maksimal adalah 10");
//                ulangi = true;
//            } else {
//                panggil.randomAngka(masukAngka);
//
//            }
//        } while (ulangi = true);

//        System.out.print("Masukkan sejumlah uang: ");
//        panggil.hitungUang(s.nextInt());
        Scanner s = new Scanner(System.in);  
        System.out.print("Masukkan sejumlah uang: ");
        panggil.hitungPecahan(s.nextInt());
    }
}