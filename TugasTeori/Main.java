package TugasTeori;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<DataMahasiswa> mahasiswa = new ArrayList<>();

        Scanner sham = new Scanner(System.in);
        boolean next = true;

        while (next) {
            DataMahasiswa mhs = new DataMahasiswa();

            System.out.print("masukkan nim : ");
            String nim = sham.nextLine();
            mhs.setNim(nim);

            System.out.print("masukkan nama : ");
            String nama = sham.nextLine();
            mhs.setNama(nama);

            System.out.print("masukkan alamat: ");
            String alamat = sham.nextLine();
            mhs.setAlamat(alamat);

            mahasiswa.add(mhs);
            System.out.print("tambah lagi? ");
            String tambah = sham.nextLine();

            if (tambah.equals("t")) {
                next = false;
            }
        }

        System.out.println("==================================");
        for(DataMahasiswa a : mahasiswa){
            System.out.println((a.getNim() + " | " + a.getNama() + " | " + a.getAlamat()));
        }
    }

}
