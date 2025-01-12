import java.util.ArrayList;
import java.util.List;

public class Salon extends BaseEntity {
    private final List<Integer> filmIds; // Gösterilen filmlerin ID'leri
    private final List<Integer> musteriIds; // Kayıtlı müşterilerin ID'leri

    public Salon(int id, String name) {
        super(id, name);
        this.filmIds = new ArrayList<>();
        this.musteriIds = new ArrayList<>();
    }

    public List<Integer> getFilmIds() {
        return filmIds;
    }

    public void addFilm(int filmId) {
        filmIds.add(filmId);
    }

    public List<Integer> getMusteriIds() {
        return musteriIds;
    }

    public void addMusteri(int musteriId) {
        musteriIds.add(musteriId);
    }

    @Override
    public void bilgiGoster() {
        System.out.println("Salon ID: " + getId() + ", Adı: " + getName());
    }
}


