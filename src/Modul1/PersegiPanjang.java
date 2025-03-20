package Modul1;

public class PersegiPanjang {
    public static void main(String[] args) {
        Luas PersegiPanjang = new Luas(9, 5);
        double luas = PersegiPanjang.hitungLuas();
        System.out.println("Luas Persegi Panjang : " +  luas);
    }
}

class Luas{
    double panjang;
    double lebar;

    public Luas(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    double hitungLuas(){
        return panjang*lebar;
    }
}
