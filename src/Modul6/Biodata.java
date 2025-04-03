package Modul6;

public class Biodata {
    private String nama;
    private int nim;
    private String jurusan;
    private String fakultas;
    private String universitas;
    private String alamat;
    private String email;
    private String pekerjaan;
    private String hobi;
    private String keahlian;
    private String karya;

    public Biodata(String nama, int nim, String jurusan, String fakultas, String universitas,
    String alamat, String email, String pekerjaan, String hobi, String keahlian, String karya) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        this.universitas = universitas;
        this.alamat = alamat;
        this.email = email;
        this.pekerjaan = pekerjaan;
        this.hobi = hobi;
        this.keahlian = keahlian;
        this.karya = karya;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getNim() {
        return nim;
    }
    public void setNim(int nim) {
        this.nim = nim;
    }
    public String getJurusan() {
        return jurusan;
    }
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    public String getFakultas() {
        return fakultas;
    }
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
    public String getUniversitas() {
        return universitas;
    }
    public void setUniversitas(String universitas) {
        this.universitas = universitas;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPekerjaan() {
        return pekerjaan;
    }
    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }
    public String getHobi() {
        return hobi;
    }
    public void setHobi(String hobi) {
        this.hobi = hobi;
    }
    public String getKeahlian() {
        return keahlian;
    }
    public void setKeahlian(String keahlian) {
        this.keahlian = keahlian;
    }
    public String getKarya() {
        return karya;
    }
    public void setKarya(String karya) {
        this.karya = karya;
    }
    //konstruktor default
    public Biodata() {
    }

    public void tampilBiodata(){
        System.out.println("Biodata Saya");
        System.out.println(
                "Nama: " + nama +
                "\nNIM: " + nim +
                "\nJurusan: " + jurusan +
                "\nFakultas: " + fakultas +
                "\nUniversitas: " + universitas +
                "\nAlamat: " + alamat +
                "\nEmail: " + email +
                "\nPekerjaan: " + pekerjaan +
                "\nHobi: " + hobi +
                "\nKeahlian: " + keahlian +
                "\nKarya: " + karya);
    }
    public static void main(String[] args) {
        Biodata person = new Biodata();
        person.setNama("Sulthan");
        person.setNim(11241080);
        person.setJurusan("Jurusan Teknik Elektro, Informatika, dan Bisnis");
        person.setFakultas("Fakultas Sains dan Teknologi Informasi");
        person.setUniversitas("Institut Teknologi Kalimantan");
        person.setAlamat("Balikpapan");
        person.setEmail("11241080@student.itk.ac.id");
        person.setPekerjaan("Mahasiswa");
        person.setHobi("Futsal");
        person.setKeahlian("Atur strategi");
        person.setKarya("Gambar");

        person.tampilBiodata();
    }
}
