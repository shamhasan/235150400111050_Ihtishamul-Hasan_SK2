public class matkul {
    private String kode;
    private String nama;
    private double nilai;

    public matkul(String kode, String nama, double nilai) {
        this.nama = nama;
        this.kode = kode;
        this.nilai = nilai;
    }

    public double getNilai() {
        return nilai;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNilaiHuruf() {
        if (nilai >= 85) {
            return "A";
        } else if (nilai >= 80)
            return "A-";
        else if (nilai >= 75)
            return "B+";
        else if (nilai >= 70)
            return "B";
        else if (nilai >= 65)
            return "C+";
        else if (nilai >= 60)
            return "C";
        else if (nilai >= 55)
            return "D";
        else
            return "E";
    }

}
