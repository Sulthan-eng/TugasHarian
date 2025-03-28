package Modul1;

//berisi class luas isi dan volume tabung dengan menerapkan method dan object
public class Tabung {
    public static void main(String[] args) {
        LuasIsi tabung1 = new LuasIsi(10, 7);
        double LuasIsi = tabung1.hitungLuas();
        System.out.println("Luas Isi Tabung : " + LuasIsi);

        Volume tabung2 = new Volume(12, 7);
        double Volume = tabung2.hitungVolume();
        System.out.println("Volume Tabung : " + Volume);
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

class Volume{
    double PI = Math.PI;
    double tinggi;
    double jarijari;

    public Volume(double tinggi, double jarijari) {
        this.tinggi = tinggi;
        this.jarijari = jarijari;
    }

    double hitungVolume(){
        return PI*jarijari*jarijari*tinggi;
    }
}
