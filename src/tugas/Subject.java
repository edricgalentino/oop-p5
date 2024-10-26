package tugas;

public class Subject {
    private String id;
    private String name;
    private int sks;

    public Subject(String id, String name, int sks) {
        this.id = id;
        this.name = name;
        this.sks = sks;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }
}
