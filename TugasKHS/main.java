import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukan NIM Mahasiswa : ");
        String nim = input.nextLine();
        System.out.println("Masukan Nama Mahasiswa : ");
        String nama = input.nextLine();
        
        mahasiswa Mahasiswa = new mahasiswa(nim, nama);
        
        System.out.println("Masukan Jumlah Mata Kuliah : ");
        int JumlahMataKuliah = input.nextInt();
        input.nextLine();
        
        matkul[] matakuliah = new matkul[JumlahMataKuliah];
        
        for (int i = 0 ; i< JumlahMataKuliah; i++){
            System.out.println("Mata Kuliah "+(i+1));
            System.out.print("Kode MK : ");
            String kode = input.nextLine();
            System.out.print("Nama MK : ");
            String namaMK = input.nextLine();
            System.out.print("Nilai Angka : ");
            int nilai = input.nextInt();
            input.nextLine();
            
            matakuliah[i] = new matkul(kode, namaMK, nilai);
            
        }
        KHS khs = new KHS(Mahasiswa, matakuliah);
        khs.cetak();
    }
}
