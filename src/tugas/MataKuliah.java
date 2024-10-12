package tugas;

import java.util.ArrayList;

public class MataKuliah {
    private String kode;
    private String nama;
    private Dosen dosen;
    private ArrayList<Mahasiswa> mahasiswaList;

    public MataKuliah(String kode, String nama, Dosen dosen) {
        this.kode = kode;
        this.nama = nama;
        this.dosen = dosen;
        this.mahasiswaList = new ArrayList<>();
    }

    public void addMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswaList.add(mahasiswa);
    }

    public void removeMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswaList.remove(mahasiswa);
    }


    public ArrayList<Mahasiswa> getMahasiswaList() {
        return mahasiswaList;
    }

    public void printInfo() {
        System.out.println("Mata Kuliah: " + this.nama + " (" + this.kode + ")");
        System.out.println("Dosen: " + this.dosen.getName() + " (" + this.dosen.getId() + ")");
        System.out.println("Mahasiswa:");
        for (Mahasiswa mahasiswa : this.mahasiswaList) {
            System.out.println("-" + mahasiswa.getName() + " (" + mahasiswa.getId() + ") - " + mahasiswa.getMajor());
        }
    }
}
