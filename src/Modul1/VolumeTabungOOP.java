package Modul1;

public class VolumeTabungOOP {
    public static void main(String[] args) {
        Volume tabung = new Volume(12, 14   );
        double volume = tabung.hitungVolume();
        System.out.println("Volume Tabung : " + Volume);
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
