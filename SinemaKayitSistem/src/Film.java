public class Film extends BaseEntity {
    private String tur;  // Film türü

    public Film(int id, String name, String tur) {
        super(id, name);
        this.tur = tur;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    @Override
    public void bilgiGoster() {
        System.out.println("Film ID: " + getId() + ", İsim: " + getName() + ", Tür: " + tur);
    }
    
    @Override
    public String toString() {
        return "Film: " + getName() + ", Tür: " + tur;
    }
}
