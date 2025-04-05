package Modul8;

class Arimatika{
    int pembilang, penyebut;

    public void bagi(int pembilang, int penyebut){
        this.pembilang = pembilang;
        this.penyebut = penyebut;

        try{
            int hasil = pembilang/penyebut;
            System.out.println("Hasil Pembagian : " + hasil);
        } catch (ArithmeticException error){
            System.out.println("Tidak bisa dibagi dengan angka 0");
        }
    }
}
public class Hitung {
    public static void main(String[] args) {
        Arimatika a = new Arimatika();
        a.bagi(10, 2);
        a.bagi(5,0);
    }
}
