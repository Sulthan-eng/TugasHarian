package Modul2;
import java.io.*;

class HitungKelilingLingkaranBuffered {
    double jarijari;
    double PI = Math.PI;

    public HitungKelilingLingkaranBuffered(double jarijari) {
        this.jarijari = jarijari;
    }
    double hitungKeliling(){
        return 2 * PI * jarijari;
    }
}
public class HitungBufferedReader {
    public static void main(String[] args) throws IOException {   // throws IOException digunakan untuk mendeklarasikan bahwa suatu metode bisa melempar IOException, sehingga pemanggil kode harus meneruskan exception
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Menghitung Keliling Lingkaran");
        System.out.println("Masukkan jari-jari : ");
        double jarijari = Double.parseDouble(br.readLine()); //mengambil input user, mengonversi ke tipe data double, lalu menyimpan ke variabel jarijari

        HitungKelilingLingkaranBuffered lingkaran = new HitungKelilingLingkaranBuffered(jarijari);
        double keliling = lingkaran.hitungKeliling();
        System.out.println("Keliling Lingkaran : " + keliling);
    }
}