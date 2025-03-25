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
class HitungLuasTrapesium {
    double sisiatas;
    double sisibawah;
    double tinggi;

    public HitungLuasTrapesium(double sisiatas, double sisibawah, double tinggi) {
        this.sisiatas = sisiatas;
        this.sisibawah = sisibawah;
        this.tinggi = tinggi;
    }

    double hitungLuas(){
        return 0.5 * (sisiatas + sisibawah) * tinggi;
    }
}
class HitungLuasPrismaSegitiga{
    double alas;
    double tinggiSegitiga ;
    double tinggiPrisma;
    double sisi1;
    double sisi2;
    double sisi3;

}


public class HitungScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menghitung Keliling Lingkaran");
        System.out.print("Masukkan jari-jari : ");
        double jarijari = input.nextDouble();

        HitungKelilingLingkaran Lingkaran = new HitungKelilingLingkaran(jarijari);
        double keliling = Lingkaran.hitungKeliling();
        System.out.println("Keliling Lingkaran : " + keliling);


        System.out.println("Menghitung Luas Trapesium");
        System.out.print("Masukkan panjang sisi atas : ");
        double sisiatas = input.nextDouble();
        System.out.print("Masukkan panjang sisi bawah : ");
        double sisibawah = input.nextDouble();
        System.out.print("Masukkan tinggi : ");
        double tinggi = input.nextDouble();

        HitungLuasTrapesium Trapesium = new HitungLuasTrapesium(sisiatas, sisibawah, tinggi);
        double luas = Trapesium.hitungLuas();
        System.out.println("Luas Trapesium : " + luas);




        input.close();
    }
}