package perhitungan;

public class Perhitungan {

    static int perkalian(int angka1, int angka2) {
        int hasil = angka1 * angka2;
        return hasil;
    }

    static int pengulangan(int angkaSatu, int angkaDua) {
        int hasil = 0;

        for (int count = 0; count < angkaDua; count++) {
            hasil += angkaSatu;
        }
        return hasil;
    }

    static void piramid() {
        int tinggi = 7;
        for (int i = 0; i < tinggi; i++) {
            for (int k = i; k < tinggi; k++) {

                System.out.print(" ");
            }
            for (int j = 1; j < (i * 2) - 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //bawah
        for (int a = 0; a<5;a++){
            for(int b =0; b<a;b++){
                System.out.print(" ");
            }
            for(int c=5; c>=a;c--){
                System.out.print("*");
            }
            for(int d = 4; d>=a;d--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Perhitungan pr = new Perhitungan();
        pr.piramid();
    }
}