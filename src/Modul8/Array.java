package Modul8;

class ArrayHandler{
    int[] isi = {2,4,6,8,10};

    public void tampilkanIsi(int indeks){
        try{
            System.out.println("Data di indeks " + indeks + ": " + isi[indeks] );
        } catch (Exception e){
            System.out.println("Kesalahan pada indeks ke " + indeks + " di luar batas array.");
        }
    }
}
public class Array {
    public static void main(String[] args) {
        ArrayHandler arrayHandler = new ArrayHandler();
        arrayHandler.tampilkanIsi(1);
        arrayHandler.tampilkanIsi(10);
    }
}
