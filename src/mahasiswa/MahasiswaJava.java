/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswa;

/**
 *
 * @author user
 * Nama   : Farchatul Hudayah
 * Nim    : 22205071
 * Prodi  : Teknik Informasi
 *
 */
class Mahasiswa {

    
    private String nama;
    private int umur;

    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }    

    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);        
    }
}

class MahasiswaBaru extends Mahasiswa {

    private int nim;

    public MahasiswaBaru(String nama, int umur, int nim) {
        super(nama, umur);
        this.nim = nim;
    }
    
    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }
    
@Override
    public void displayInfo() {
//        System.out.println("Nama: " + nama);
//        System.out.println("Umur: " + umur);
        super.displayInfo();
        System.out.println("NIM: " + nim);
    }
}

class MahasiswaLama extends Mahasiswa {

    private int angkatan;

    public MahasiswaLama(String nama, int umur, int angkatan) {
        super(nama, umur);
        this.angkatan = angkatan;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }
@Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Angkatan: " + angkatan);
    }
}

public class MahasiswaJava{

    public static void main(String[] args) {
        Mahasiswa baru = new MahasiswaBaru("Farchatul", 19, 22205071);
        baru.displayInfo();

        Mahasiswa lama = new MahasiswaLama("Hudayah", 19, 22205071);
        lama.displayInfo();
    }
}
