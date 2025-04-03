package Modul5;

public class AkademikMahasiswa {
    String nama, jurusan, fakultas, riwayatBeasiswa;
    int nim;
    double ipSemester, ipKumulatif;

    void tampilData(String nama, int nim, String jurusan, String fakultas){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        System.out.println("Nama: " + nama + "\nNIM: " + nim + "\nJurusan: " + jurusan + "\nFakultas: " + fakultas);
    }
    void tampilData(String nama, int nim, double ipSemester, double ipKumulatif){
        this.nama = nama;
        this.nim = nim;
        this.ipSemester = ipSemester;
        this.ipKumulatif = ipKumulatif;
        System.out.println("Nama: " + nama + "\nNIm: " + nim + "\nIP Semester: " + ipSemester + "\nIP Kumulatif: " + ipKumulatif);
    }
    void tampilData(String nama, int nim, String jurusan, String fakultas, double ipSemester, double ipKumulatif, String riwayatBeasiswa){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        this.ipSemester = ipSemester;
        this.ipKumulatif = ipKumulatif;
        this.riwayatBeasiswa = riwayatBeasiswa;
        System.out.println("Nama" + nama + "\nNIm: " + nim + "\nJurusan: " + jurusan + "\nFakultas: " + fakultas + "\nIP Semester: " + ipSemester + "\nIP Kumulatif: " + ipKumulatif + "\nRiwayatBeasiswa: " + riwayatBeasiswa);
    }

    public static void main(String[] args) {
        AkademikMahasiswa sulthan = new AkademikMahasiswa();
        sulthan.tampilData("Sulthan", 11241080, "Jurusan Teknik Elektro, Informatika, dan Bisnis", "Fakultas Sains dan Teknologi Informasi");
        sulthan.tampilData("Sulthan", 11241080,3.78, 3.97);
        sulthan.tampilData("Sulthan F. F.", 11241080, "Jurusan Teknik Elektro, Informatika, dan Bisnis",  "Fakultas Sains dan Teknologi Informasi", 3.78, 3.97, "KIP");

    }
}
