package Modul2;
import javax.swing.JOptionPane;

class HitungKelilingLingkaranJoption {
    double jariJari;
    double PI = Math.PI;

    public HitungKelilingLingkaranJoption(double jariJari) {
        this.jariJari = jariJari;
    }
    double hitungKeliling(){
        return 2 * PI * jariJari;
    }
}

class HitungLuasTrapesiumJoption {
    double sisiAtas;
    double sisiBawah;
    double tinggi;

    public HitungLuasTrapesiumJoption(double sisiAtas, double sisiBawah, double tinggi) {
        this.sisiAtas = sisiAtas;
        this.sisiBawah = sisiBawah;
        this.tinggi = tinggi;
    }

    public double hitungLuas() {
        return 0.5 * (sisiAtas + sisiBawah) * tinggi;
    }
}

class HitungLuasPrismaSegitigaJoption {
    double alas;
    double tinggiSegitiga ;
    double tinggiPrisma;

    public HitungLuasPrismaSegitigaJoption(double alas, double tinggiSegitiga, double tinggiPrisma) {
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

public class HitungJoptionPane {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Menghitung Keliling Lingkaran");
        double jariJari = Double.parseDouble(JOptionPane.showInputDialog("Masukkan jari-jari : "));
        HitungKelilingLingkaranJoption lingkaran = new HitungKelilingLingkaranJoption(jariJari);
        JOptionPane.showMessageDialog(null, "Keliling lingkaran : " + lingkaran.hitungKeliling());

        JOptionPane.showMessageDialog(null,"Menghitung Luas Trapesium");
        double sisiAtas = Double.parseDouble(JOptionPane.showInputDialog("Masukkan sisi atas : "));
        double sisiBawah = Double.parseDouble(JOptionPane.showInputDialog("Masukkan sisi bawah : "));
        double tinggi = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi : "));
        HitungLuasTrapesiumJoption trapesium = new HitungLuasTrapesiumJoption(sisiAtas, sisiBawah, tinggi);
        JOptionPane.showMessageDialog(null, "Luas Trapesium : " + trapesium.hitungLuas());

        JOptionPane.showMessageDialog(null,"Menghitung Luas Prisma segitiga");
        double alas = Double.parseDouble(JOptionPane.showInputDialog("Masukkan alas : "));
        double tinggiSegitiga = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi Segitiga : "));
        double tinggiPrisma = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi Prisma: "));
        HitungLuasPrismaSegitigaJoption prismaSegitiga = new HitungLuasPrismaSegitigaJoption(alas, tinggiSegitiga, tinggiPrisma);
        JOptionPane.showMessageDialog(null, "Luas Prisma Segitiga : " + prismaSegitiga.hitungLuasPrisma());
    }
}

