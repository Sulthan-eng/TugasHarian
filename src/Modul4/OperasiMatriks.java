package Modul4;
import java.util.Scanner;

class Matriks {
    int[][] nilai = new int[2][2];

    //konstruktor untuk inisialisasi matriks
    Matriks(int [][] nilai) {
        this.nilai = nilai;
    }

    //Method untuk mengurangi matriks
    Matriks subtract(Matriks lain){
        int [][] hasil = new int[2][2];
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                hasil[i][j] = this.nilai[i][j] - lain.nilai[i][j];
            }
        }
        return new Matriks(hasil);
    }

    //Method untuk mengali matriks
    Matriks multiply(Matriks lain){
        int [][] hasil = new int[2][2];
        for(int i = 0; i <  2; i++){
            for(int j = 0; j < 2; j++){
                hasil[i][j] = this.nilai[i][0] * lain.nilai[0][j] + this.nilai[i][1] * lain.nilai[1][j];
            }
        }
        return new Matriks(hasil);
    }

    //Method menampilkan matriks
    void display(){
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(this.nilai[i][j]+" ");
            }
            System.out.println();
        }
    }
}

public class OperasiMatriks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] xMatriks = new int[2][2];
        int[][] yMatriks = new int[2][2];

        //input nilai ke matriks x
        System.out.println("Masukkan elemen matriks X orde (2*2) : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                xMatriks[i][j] = input.nextInt();
            }
        }

        //input nilai ke matriks y
        System.out.println("Masukkan elemen matriks Y orde (2*2) : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                yMatriks[i][j] = input.nextInt();
            }
        }

        //membuat objek X dan Y berdasarkan input user
        Matriks X = new Matriks(xMatriks);
        Matriks Y = new Matriks(yMatriks);

        //pilihan operasi
        System.out.println("Silahkan pilih operasi: \n1. Pengurangan\n2. Perkalian");

        int pilih = input.nextInt();
        switch (pilih) {
            case 1:
                System.out.println("Hasil Matriks X - Matriks Y : ");
                Matriks hasilPengurangan = X.subtract(Y);
                hasilPengurangan.display();
                break;
            case 2:
                System.out.println("Hasil Matriks X * Matriks Y : ");
                Matriks hasilPerkalian = X.multiply(Y);
                hasilPerkalian.display();
                break;
            default:
                System.out.println("Silahkan pilih operasi sesuai yang tertera : ");
        }
        input.close();
    }
}
