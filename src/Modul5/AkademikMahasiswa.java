package Modul5;

public class AkademikMahasiswa {
    String nama, jurusan, fakultas;
    int nim;
    double ipSemester, ipKumulatif;
    String riwayatBeasiswa[];

    void tampilData(String nama, int nim, String jurusan, String fakultas){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        System.out.println("Data Mahasiswa");
        System.out.println("Nama: " + nama + "\nNIM: " + nim + "\nJurusan: " + jurusan + "\nFakultas: " + fakultas);
    }
    void tampilData(String nama, int nim, double ipSemester, double ipKumulatif){
        this.nama = nama;
        this.nim = nim;
        this.ipSemester = ipSemester;
        this.ipKumulatif = ipKumulatif;
        System.out.println("Prestasi Akademik");
        System.out.println("Nama: " + nama + "\nNIM: " + nim + "\nIP Semester: " + ipSemester + "\nIP Kumulatif: " + ipKumulatif);
    }
    void tampilData(String nama, int nim, String jurusan, String fakultas, double ipSemester, double ipKumulatif, String riwayatBeasiswa[]){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        this.ipSemester = ipSemester;
        this.ipKumulatif = ipKumulatif;
        this.riwayatBeasiswa = riwayatBeasiswa;
        System.out.println("Data Lengkap Mahasiswa");
        System.out.println("Nama: " + nama + "\nNIM: " + nim + "\nJurusan: " + jurusan + "\nFakultas: " + fakultas + "\nIP Semester: " + ipSemester + "\nIP Kumulatif: " + ipKumulatif + "\nRiwayatBeasiswa: ");
        if(riwayatBeasiswa != null){
            for(String beasiswa : riwayatBeasiswa){
                System.out.println("- " + beasiswa);
            }
        } else{
            System.out.println("Tidak ada riwayat beasiswa");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AkademikMahasiswa mahasiswa = new AkademikMahasiswa();
        mahasiswa.tampilData("Sulthan", 11241080, "Jurusan Teknik Elektro, Informatika, dan Bisnis", "Fakultas Sains dan Teknologi Informasi");
        mahasiswa.tampilData("Sulthan", 11241080,3.8, 3.97);
        mahasiswa.tampilData("Sulthan Farizan Fawwaz", 11241080, "Jurusan Teknik Elektro, Informatika, dan Bisnis",  "Fakultas Sains dan Teknologi Informasi", 3.78, 3.97,
                new String[]{"KIP", "Kaltim"});
    }
}
