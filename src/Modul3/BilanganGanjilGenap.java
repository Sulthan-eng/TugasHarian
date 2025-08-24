package Modul3;

class CariBilanganGanjilGenap{
    public void BilanganGanjilForLoop(){
        System.out.println("Bilangan Ganjil For Loop : ");
        for(int angka = 1; angka <= 1000; angka++){
            if(angka % 2 != 0){
                System.out.print(angka + " ");
            }
        }
        System.out.println();
    }
    public void BilanganGenapForLoop(){
        System.out.println("Bilangan Genap For Loop : ");
        for(int angka = 1; angka <= 1000; angka++){
            if(angka % 2 == 0){
                System.out.print(angka + " ");
            }
        }
        System.out.println();
    }
    public void BilanganGanjilWhileLoop(){
        System.out.println("Bilangan Ganjil While Loop : ");
        int angka = 1;

        while (angka <= 1000){
            if(angka % 2 != 0){
                System.out.print(angka + " ");
            }
            angka++;
        }
    }
    public void BilanganGenapWhileLoop(){
        System.out.println("\nBilangan Genap While Loop : ");
        int angka = 1;

        while (angka <= 1000){
            if(angka % 2 == 0){
                System.out.print(angka + " ");
            }
            angka++;
        }
    }
    public void BilanganGanjilDoWhileLoop(){
        System.out.println("\nBilangan Ganjil Do While Loop : ");
        int angka = 1;

        do{
            if(angka % 2 != 0){
                System.out.print(angka + " ");
            } angka++;
        } while(angka <= 1000);
    }
    public void BilanganGenapDoWhileLoop(){
        System.out.println("\nBilangan Genap Do While Loop : ");
        int angka = 1;

        do {
            if(angka % 2 == 0){
                System.out.print(angka + " ");
            } angka++;
        } while(angka <= 1000);
    }
}

public class BilanganGanjilGenap {
    public static void main(String[] args) {
        CariBilanganGanjilGenap ganjilGenap = new CariBilanganGanjilGenap();

        ganjilGenap.BilanganGanjilForLoop();
        ganjilGenap.BilanganGenapForLoop();
        ganjilGenap.BilanganGanjilWhileLoop();
        ganjilGenap.BilanganGenapWhileLoop();
        ganjilGenap.BilanganGanjilDoWhileLoop();
        ganjilGenap.BilanganGenapDoWhileLoop();
    }
}
