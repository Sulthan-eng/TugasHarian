package Modul3;

class CariBilanganPrima {
     public void BilanganPrimaForLoop(){
         System.out.println("Bilangan Prima For-Loop : ");
         for(int angka = 2; angka <= 1000; angka++){  //selama kurang dari sama dengan 1000 angka akan terus bertambah (init statement)
             boolean Prima = true;
             for(int i = 2; i <= Math.sqrt(angka); i++){ //cek angka habis dibagi i
                 if (angka % i == 0 ){
                     Prima = false;
                     break;
                 }
             }
             if(Prima){
                 System.out.print(angka + " "); //cetak bilangan prima
             }
         }
         System.out.println();
     }

     public void BilanganPrimaWhileLoop(){
         System.out.println("Bilangan Prima While-Loop : ");
         int angka = 2;

         while(angka <= 1000){
             boolean Prima = true;
             int i = 2;
             while (i <= Math.sqrt(angka)){
                 if (angka % i == 0 ){
                     Prima = false;
                     break;
                 }
                 i++;
             }
             if(Prima){
                 System.out.print(angka + " ");   //cetak bilangan prima
             }
             angka++;
         }
         System.out.println();
     }

     public void BilanganPrimaDoWhileLoop(){
         System.out.println("Bilangan Prima Do-While-Loop : ");
         int angka = 2;

         do {
             boolean Prima = true;
             int i = 2;

             while (i <= Math.sqrt(angka)){
                 if (angka % i == 0 ){
                     Prima = false;
                     break;
                 }
                 i++;
             }
             if(Prima){
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
