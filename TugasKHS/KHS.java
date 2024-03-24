public class KHS {
    private mahasiswa Mahasiswa;
    private matkul[] mataKuliah;

    public KHS(mahasiswa Mahasiswa,matkul[] mataKuliah){
        this.Mahasiswa = Mahasiswa;
        this.mataKuliah = mataKuliah;
    }

    public void cetak(){
        System.out.println(" ");
        System.out.println("========== Kartu Hasil Studi ==========");
        System.out.println("Data Mahasiswa : ");
        System.out.println("NIM : " + Mahasiswa.getNIM());
        System.out.println("Nama : " + Mahasiswa.getNama());
        System.out.println("| Kode     | Nama Mata Kuliah           | Nilai |");
        System.out.println("-------------------------------------------------");
        for(matkul Mk: mataKuliah){
            System.out.printf("|%-10s| %-26s| %-5s|%n", Mk.getKode(),Mk.getNama(), Mk.getNilaiHuruf());
        }
        System.out.println("-------------------------------------------------");
    }
}
