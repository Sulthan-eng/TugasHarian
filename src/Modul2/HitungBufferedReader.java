package Modul2;
import java.io.*;

class HitungKelilingLingkaranBuffered {
    double jariJari;
    double PI = Math.PI;

    public HitungKelilingLingkaranBuffered(double jariJari) {
        this.jariJari = jariJari;
    }
    double hitungKeliling(){
        return 2 * PI * jariJari;
    }
}

class HitungLuasTrapesiumBuffered {
    double sisiAtas;
    double sisiBawah;
    double tinggi;

    public HitungLuasTrapesiumBuffered(double sisiAtas, double sisiBawah, double tinggi) {
        this.sisiAtas = sisiAtas;
        this.sisiBawah = sisiBawah;
        this.tinggi = tinggi;
    }

    public double hitungLuas() {
        return 0.5 * (sisiAtas + sisiBawah) * tinggi;
    }
}
class HitungLuasPrismaSegitigaBuffered {
    double alas;
    double tinggiSegitiga ;
    double tinggiPrisma;

    public HitungLuasPrismaSegitigaBuffered(double alas, double tinggiSegitiga, double tinggiPrisma) {
        this.alas = alas;
        this.tinggiSegitiga = tinggiSegitiga;
        this.tinggiPrisma = tinggiPrisma;
    }
    private double hitungLuasAlas(){
        return 0.5 * alas * tinggiSegitiga;
    }
    private double kelilingAlas(){
        double sisiMiring = Math.sqrt((alas * alas) + (tinggiSegitiga * tinggiSegitiga));
        return alas + tinggiSegitiga + sisiMiring;
    }
    private double luasSelimut(){
        return kelilingAlas() * tinggiPrisma;
    }
    public double hitungLuasPrisma(){
        double luasAlas = hitungLuasAlas();
        double luasSelimut = luasSelimut();
        return (2 * luasAlas) + luasSelimut;
    }
}

public class HitungBufferedReader {
    public static void main(String[] args) throws IOException {   // throws IOException digunakan untuk mendeklarasikan bahwa suatu metode bisa melempar IOException, sehingga pemanggil kode harus meneruskan exception
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Menghitung Keliling Lingkaran");
        System.out.println("Masukkan jari-jari : ");
        double jariJari = Double.parseDouble(br.readLine()); //mengambil input user, mengonversi ke tipe data double, lalu menyimpan ke variabel jarijari

        HitungKelilingLingkaranBuffered lingkaran = new HitungKelilingLingkaranBuffered(jariJari); //buat objek "lingkaran" dari class HitungKelilingLingkaranBuffered dan memanggil konstruktor yang menginisialisasi variabel jarijari
        double keliling = lingkaran.hitungKeliling();
        System.out.println("Keliling Lingkaran : " + keliling);

        System.out.println("Menghitung Luas Trapesium : ");
        System.out.println("Masukkan sisi atas : ");
        double sisiAtas = Double.parseDouble(br.readLine());
        System.out.println("Masukkan sisi bawah : ");
        double sisiBawah = Double.parseDouble(br.readLine());
        System.out.println("Masukkan tinggi : ");
        double tinggi = Double.parseDouble(br.readLine());

        HitungLuasTrapesiumBuffered trapesium = new HitungLuasTrapesiumBuffered(sisiAtas, sisiBawah, tinggi);
        double luas = trapesium.hitungLuas();
        System.out.println("Luas Trapesium : " + luas);

        System.out.println("Menghitung Luas Prisma Segitiga : ");
        System.out.println("Masukkan alas : ");
        double alas = Double.parseDouble(br.readLine());
        System.out.println("Masukkan tinggi segitia : ");
        double tinggiSegitiga = Double.parseDouble(br.readLine());
        System.out.println("Masukkan tinggi prisma : ");
        double tinggiPrisma = Double.parseDouble(br.readLine());

        HitungLuasPrismaSegitigaBuffered prismaSegitiga = new HitungLuasPrismaSegitigaBuffered(alas, tinggiSegitiga, tinggiPrisma);
        double luasPrisma = prismaSegitiga.hitungLuasPrisma();
        System.out.println("Luas Prisma Segitiga : " + luasPrisma);
    }
}