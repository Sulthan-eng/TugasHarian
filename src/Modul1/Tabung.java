package Modul1;

public class Tabung {
    public static void main(String[] args) {
        LuasIsi tabung = new LuasIsi(10, 7);
        double LuasIsi = tabung.hitungLuas();
        System.out.println("Luas Isi Tabung : " + LuasIsi);
    }
}
class LuasIsi {
    double PI = Math .PI;
    double tinggi;
    double jarijari;

    public LuasIsi(double tinggi, double jarijari) {
        this.tinggi = tinggi;
        this.jarijari = jarijari;
    }

    double hitungLuas(){
        return 2*PI*jarijari*(jarijari+tinggi);
    }

}