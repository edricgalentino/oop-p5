package tugas;

public class Dosen extends Person {
    private String subject;

    public Dosen(String name, int id, String major) {
        super(name, id);
        this.subject = major;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
