package Modul5;

public class IdentitasMahasiswa {
    String nama, jurusan, fakultas;
    int nim;
    double ipSemester, ipKumulatif;

    public IdentitasMahasiswa(String nama, int nim, String jurusan, String fakultas){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        System.out.println("Profile Mahasiswa");
    }
    public IdentitasMahasiswa(String nama, int nim, String jurusan, String fakultas, double ipSemester, double ipKumulatif){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        this.ipSemester = ipSemester;
        this.ipKumulatif = ipKumulatif;
    }

    public void tampilIdentitas(){
        System.out.println("Identitas Mahasiswa");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Fakultas: " + fakultas);
        System.out.println("IP Semester: " + ipSemester);
        System.out.println("IP Kumulatif: " + ipKumulatif);
    }

    public static void main(String[] args) {
        IdentitasMahasiswa mahasiswa1 = new IdentitasMahasiswa("Sulthan", 11241080, "Jurusan Teknik Elektro, Informatika, dan Bisnis", "Fakultas Sains dan Teknologi Informasi" );
        IdentitasMahasiswa mahasiswa2 = new IdentitasMahasiswa("Sulthan", 11241080, "Jurusan Teknik Elektro, Informatika, dan Bisnis", "Fakultas Sains dan Teknologi Informasi" );

        mahasiswa1.tampilIdentitas();
        mahasiswa2.tampilIdentitas();
    }
}
