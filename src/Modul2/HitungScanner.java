package Modul2;
import java.util.Scanner;

class HitungKelilingLingkaran {
    double jarijari;
    double PI = Math.PI;
    public HitungKelilingLingkaran(double jarijari) {
        this.jarijari = jarijari;
    }

    double hitungKeliling(){
        return 2*PI*jarijari;
    }
}


public class HitungScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menghitung Keliling Lingkaran");

        System.out.print("Masukkan jari-jari : ");
        double jarijari = input.nextDouble();

        HitungKelilingLingkaran Lingkaran = new HitungKelilingLingkaran(jarijari);
        double HitungKelilingLingkaran = Lingkaran.hitungKeliling();
        System.out.println("Keliling Lingkaran : " + HitungKelilingLingkaran);
        input.close();
    }
}