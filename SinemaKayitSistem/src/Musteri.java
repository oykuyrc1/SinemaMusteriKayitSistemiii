public class Musteri extends BaseEntity {
    private String email;

    // Constructor, id, name, ve email alır
    public Musteri(int id, String name, String email) {
        super(id, name);
        this.email = email;
    }

    // Getter ve Setter metodları
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Bilgi gösterimi
    @Override
    public void bilgiGoster() {
        System.out.println("Müşteri ID: " + getId() + ", İsim: " + getName() + ", Email: " + email);
    }

    @Override
    public String toString() {
        return getName() + " - " + email;
    }
}




