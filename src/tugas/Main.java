package tugas;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("John Doe", 12345, "Teknik Informatika", 32141232);
        Mahasiswa mhs2 = new Mahasiswa("Jane Doe", 54321, "Sistem Informasi", 32141232);
        Mahasiswa mhs3 = new Mahasiswa("John Smith", 67890, "Teknik Informatika", 32141232);
        Dosen dosen = new Dosen("Jane Doe", 54321, "Pemrograman");
        MataKuliah matkul = new MataKuliah("IF1234", "Pemrograman", dosen);

        matkul.addMahasiswa(mhs1);
        matkul.addMahasiswa(mhs2);
        matkul.addMahasiswa(mhs3);

        matkul.printInfo();
    }
}
