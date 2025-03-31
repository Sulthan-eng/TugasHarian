package Modul3;

class CariBilanganPrima {
     public void BilanganPrimaForLoop(){
         System.out.println("Bilangan Prima 1 sampai 1000 dengan For-Loop : ");
         for(int angka = 2; angka <= 1000; angka++){  //selama kurang dari sama dengan 1000 angka akan terus bertambah (post statement)
             boolean prima = true;
             for(int i = 2; i <= Math.sqrt(angka); i++){ //cek angka habis dibagi i
                 if (angka % i == 0 ){
                     prima = false;
                     break;
                 }
             }
             if(prima){
                 System.out.print(angka + " "); //cetak bilangan prima
             }
         }
         System.out.println();
     }

     public void BilanganPrimaWhileLoop(){
         System.out.println("Bilangan Prima 1 sampai 1000 dengan While-Loop : ");
         int angka = 2;

         while(angka <= 1000){
             boolean prima = true;
             int i = 2;
             while (i <= Math.sqrt(angka)){
                 if (angka % i == 0 ){
                     prima = false;
                     break;
                 }
                 i++;
             }
             if(prima){
                 System.out.print(angka + " ");   //cetak bilangan prima
             }
             angka++;
         }
         System.out.println();
     }

     public void BilanganPrimaDoWhileLoop(){
         System.out.println("Bilangan Prima 1 sampai 1000 dengan Do-While-Loop : ");
         int angka = 2;

         do {
             boolean prima = true;
             int i = 2;

             while (i <= Math.sqrt(angka)){
                 if (angka % i == 0 ){
                     prima = false;
                     break;
                 }
                 i++;
             }
             if(prima){
                 System.out.print(angka + " ");
             }
             angka++;
         } while(angka <= 1000);
     }
}

public class BilanganPrima {
    public static void main(String[] args) {
        CariBilanganPrima prima = new CariBilanganPrima();

        prima.BilanganPrimaForLoop();
        prima.BilanganPrimaWhileLoop();
        prima.BilanganPrimaDoWhileLoop();
    }
}
