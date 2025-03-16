package Modul1;

public class Tabung {
    public static void main(String[] args) {
        LuasIsi Tabung = new LuasIsi(10, 7);
        double LuasIsi = Tabung.HitungLuas();
        System.out.println("Luas Isi Tabung : " + LuasIsi);

        Volume Tabunng = new Volume(12, 7);
        double Volume = Tabunng.HitungVolume();
        System.out.println("Volume Tabung : " + Volume);
    }
}
class LuasIsi {
    double PI = Math.PI;
    double tinggi;
    double jarijari;

    public LuasIsi(double tinggi, double jarijari) {
        this.tinggi = tinggi;
        this.jarijari = jarijari;
    }

    double gettinggi() {
        return tinggi;
    }
    double getjarijari() {
        return jarijari;
    }

    double HitungLuas(){
        return 2*PI*jarijari*(jarijari+tinggi);
    }

}

class Volume{
    double PI = Math.PI;
    double tinggi;
    double jarijari;

    public Volume(double tinggi, double jarijari) {
        this.tinggi = tinggi;
        this.jarijari = jarijari;
    }
    double gettinggi() {
        return tinggi;
    }
    double getjarijari() {
        return jarijari;
    }
    double HitungVolume(){
        return PI*jarijari*jarijari*tinggi;
    }
}
