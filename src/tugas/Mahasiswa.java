package tugas;

public class Mahasiswa extends Person {
    private String major;

    public Mahasiswa(String name, int id, String jurusan) {
        super(name, id);
        this.major = jurusan;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
