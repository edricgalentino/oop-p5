package tugas;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("John Doe", 12345, "Teknik Informatika");
        Mahasiswa mhs2 = new Mahasiswa("Jane Doe", 54321, "Sistem Informasi");
        Mahasiswa mhs3 = new Mahasiswa("John Smith", 67890, "Teknik Informatika");
        Dosen dosen = new Dosen("Jane Doe", 54321, "Pemrograman");
        MataKuliah matkul = new MataKuliah("IF1234", "Pemrograman", dosen);

        matkul.addMahasiswa(mhs1);
        matkul.addMahasiswa(mhs2);
        matkul.addMahasiswa(mhs3);

        matkul.printInfo();
    }
}
