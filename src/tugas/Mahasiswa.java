package tugas;

public class Mahasiswa extends Person {
    public String major;
    public int nim;

    public Mahasiswa(String name, int id, String jurusan, int nim) {
        super(name, id);
        this.major = jurusan;
        this.nim = nim;
    }

    public String getMajor() {
        return major;
    }

    public int getNim() {
        return nim;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }
}
