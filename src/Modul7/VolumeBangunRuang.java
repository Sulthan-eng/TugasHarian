package Modul7;

class BangunRuang{
    double hitungVolume(){
        return 0;
    }
    void tampilkanHasil(){
        System.out.println("Volume Bangun Ruang : " + hitungVolume());
    }
}

class Kubus extends BangunRuang{
    double sisi;

    double hitungVolume(){
        return sisi * sisi * sisi;
    }
    void tampilkanHasil(){
        System.out.println("Volume Kubus : " + hitungVolume());
    }
}

class Balok extends BangunRuang{
    double panjang, lebar, tinggi;

    double hitungVolume(){
        return panjang * lebar * tinggi;
    }
    void tampilkanHasil(){
        System.out.println("Volume Balok : " + hitungVolume());
    }
}

class Tabung extends BangunRuang{
    double tinggi, jariJari;

    double hitungVolume(){
        return Math.PI * jariJari * jariJari * tinggi;
    }
    void tampilkanHasil(){
        System.out.println("Volume Tabung : " + hitungVolume());
    }
}

class Kerucut extends BangunRuang{
    double jariJari, tinggi;

    double hitungVolume(){
        return 1.0/3.0 * Math.PI * jariJari * jariJari * tinggi;
    }
    void tampilkanHasil(){
        System.out.println("Volume Kerucut : " + hitungVolume());
    }
}

class LimasSegitiga extends BangunRuang{
    double alas, tinggiSegitiga, tinggiLimas;

    double hitungLuasAlas(){
        return 0.5 * alas * tinggiSegitiga;
    }
    double hitungVolume(){
        return 1.0/3.0 * hitungLuasAlas() * tinggiLimas;
    }
    void tampilkanHasil(){
        System.out.println("Volume LimasSegitiga : " + hitungVolume());
    }
}

class PrismaSegitiga extends BangunRuang{
    double alas, tinggiSegitiga, tinggiPrisma;

    private double hitungLuasAlas(){
        return 0.5 * alas * tinggiSegitiga;
    }
    double hitungVolume(){
        return hitungLuasAlas() * tinggiPrisma;
    }
    void tampilkanHasil(){
        System.out.println("Volume PrismaSegitiga : " + hitungVolume());
    }
}

class Bola extends BangunRuang{
    double jariJari;

    double hitungVolume(){
        return 4.0/3.0 * Math.PI * jariJari * jariJari * jariJari;
    }
    void tampilkanHasil(){
        System.out.println("Volume Bola : " + hitungVolume());
    }
}
public class VolumeBangunRuang {
    public static void main(String[] args) {
        Kubus kubus = new Kubus();
        kubus.sisi = 5;
        kubus.tampilkanHasil();

        Balok balok = new Balok();
        balok.panjang = 6;
        balok.lebar = 4;
        balok.tinggi = 5;
        balok.tampilkanHasil();

        Tabung tabung = new Tabung();
        tabung.tinggi = 5;
        tabung.jariJari = 7;
        tabung.tampilkanHasil();

        Kerucut kerucut = new Kerucut();
        kerucut.jariJari = 14;
        kerucut.tinggi = 6;
        kerucut.tampilkanHasil();

        LimasSegitiga limasSegitiga = new LimasSegitiga();
        limasSegitiga.alas = 3;
        limasSegitiga.tinggiSegitiga = 4;
        limasSegitiga.tinggiLimas = 5;
        limasSegitiga.tampilkanHasil();

        PrismaSegitiga prismaSegitiga = new PrismaSegitiga();
        prismaSegitiga.alas = 6;
        prismaSegitiga.tinggiSegitiga = 10;
        prismaSegitiga.tinggiPrisma = 8;
        prismaSegitiga.tampilkanHasil();

        Bola bola = new Bola();
        bola.jariJari = 21;
        bola.tampilkanHasil();
    }
}
