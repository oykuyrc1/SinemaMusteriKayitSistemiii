public class BaseEntity {
    private final int id;
    private final String name;

    public BaseEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter metodları
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void bilgiGoster() {
        System.out.println("ID: " + id + ", İsim: " + name);
    }
}

