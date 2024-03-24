public class mahasiswa{
    private String NIM;
    private String nama;

    public mahasiswa(String nama, String NIM){
        this.nama = nama;
        this.NIM = NIM;
    }


    public String getNIM() {
        return NIM;
    }
    public void setNIM(String NIM) {
        NIM = NIM;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        nama = nama;
    }
    
}