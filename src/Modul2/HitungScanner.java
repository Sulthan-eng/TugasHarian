package Modul2;
import java.util.Scanner;

class HitungKelilingLingkaran {
    double jariJari;
    double PI = Math.PI;
    public HitungKelilingLingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    double hitungKeliling(){
        return 2*PI*jariJari;
    }
}
class HitungLuasTrapesium {
    double sisiAtas;
    double sisiBawah;
    double tinggi;

    public HitungLuasTrapesium(double sisiAtas, double sisiBawah, double tinggi) {
        this.sisiAtas = sisiAtas;
        this.sisiBawah = sisiBawah;
        this.tinggi = tinggi;
    }

    double hitungLuas(){
        return 0.5 * (sisiAtas + sisiBawah) * tinggi;
    }
}
class HitungLuasPrismaSegitiga{
    double alas;
    double tinggiSegitiga ;
    double tinggiPrisma;

    public HitungLuasPrismaSegitiga(double alas, double tinggiSegitiga, double tinggiPrisma) {
        this.alas = alas;
        this.tinggiSegitiga = tinggiSegitiga;
        this.tinggiPrisma = tinggiPrisma;
    }

    private double HitungLuasALas(){ //membungkus program agar tidak dapat sembarang diakses dari luar/hanya HitungLuasAlas yg bisa akses method ini
        return 0.5 * alas * tinggiSegitiga;
    }

    private double HitungKelilingAlas(){  //keliling segitiga, cari sisi miring dulu
        double sisiMiring = Math.sqrt((alas * alas) + (tinggiSegitiga * tinggiSegitiga));
        return alas + tinggiSegitiga + sisiMiring;
    }

    private double HitungLuasSelimut(){
        return HitungKelilingAlas() * tinggiPrisma;
    }

    public double hitungLuasPrisma(){
        double luasAlas = HitungLuasALas();
        double kelilingAlas = HitungKelilingAlas();
        double luasSelimut = HitungLuasSelimut();
        return (2 * luasAlas) + luasSelimut;
    }

}

public class HitungScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menghitung Keliling Lingkaran");
        System.out.print("Masukkan jari-jari : ");
        double jarijari = input.nextDouble();

        HitungKelilingLingkaran lingkaran = new HitungKelilingLingkaran(jarijari);
        double keliling = lingkaran.hitungKeliling(); //memanggil method hitungKeliling() pada objek lingkaran dan menyimpan hasil perhitungan hitungKeliling() ke dalam variabel keliling
        System.out.println("Keliling Lingkaran : " + keliling);


        System.out.println("Menghitung Luas Trapesium");
        System.out.print("Masukkan panjang sisi atas : ");
        double sisiatas = input.nextDouble();
        System.out.print("Masukkan panjang sisi bawah : ");
        double sisibawah = input.nextDouble();
        System.out.print("Masukkan tinggi : ");
        double tinggi = input.nextDouble();

        HitungLuasTrapesium trapesium = new HitungLuasTrapesium(sisiatas, sisibawah, tinggi);
        double luas = trapesium.hitungLuas();
        System.out.println("Luas Trapesium : " + luas);

        System.out.println("Menghitung Luas Prisma Segitiga");
        System.out.println("Masukkan alas : ");
        double alas = input.nextDouble();
        System.out.println("Masukkan tinggi segitiga : ");
        double tinggiSegitiga = input.nextDouble();
        System.out.println("Masukkan tinggi prisma : ");
        double tinggiPrisma = input.nextDouble();

        HitungLuasPrismaSegitiga prismaSegitiga = new HitungLuasPrismaSegitiga(alas, tinggiSegitiga, tinggiPrisma);
        double luasPrisma = prismaSegitiga.hitungLuasPrisma();
        System.out.println("Luas Prisma Segitiga : " + luasPrisma);

        input.close();
    }
}