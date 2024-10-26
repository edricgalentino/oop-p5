package tugas;

public class Mahasiswa extends Person {
    private String major;
    private int nim;
    private int dateOfBirth;

    public Mahasiswa(String name, int id, String jurusan, int nim, int dateOfBirth) {
        super(name, id);
        this.major = jurusan;
        this.nim = nim;
        this.dateOfBirth = dateOfBirth;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
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

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
