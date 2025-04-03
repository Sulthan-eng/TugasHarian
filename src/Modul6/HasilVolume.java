package Modul6;

abstract class Volume {
    abstract double hitungVolume();
}

class Balok extends Volume {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    @Override
    double hitungVolume() {
        return panjang * lebar * tinggi;
    }
}

class Bola extends Volume {
    private double jariJari;

    public Bola(double jariJari){
        this.jariJari = jariJari;
    }
    @Override
    double hitungVolume() {
        return 4.0/3.0 * Math.PI * jariJari * jariJari * jariJari;
    }
}

public class HasilVolume{
    public static void main(String[] args) {
        Balok volumeBalok = new Balok(9,8,3);
        Bola volumeBola = new Bola(14);

        System.out.println("Volume Balok : "+ volumeBalok.hitungVolume());
        System.out.println("Volume Bola : "+ volumeBola.hitungVolume());
    }
}
