package Modul1;

public class VolumeTabungProsedural {
    public static void main(String[] args) {
        System.out.println("Menghitung Volume Tabung");

        double jarijari = 7;
        double tinggi = 10;
        double PI = Math.PI;

        double volume = PI * Math.pow(jarijari,2) * tinggi;
        System.out.println("Volume tabung yaitu : " + volume);
    }
}
