import java.util.*;

class Main {

    static Scanner scanner = new Scanner(System.in);
    static List<Musteri> musteriler = new ArrayList<>();
    static List<Film> filmler = new ArrayList<>();
    static List<Salon> salonlar = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Sinema Müşteri Kayıt Sistemine Hoş Geldiniz!");
            System.out.println("Menü:");
            System.out.println("1. Yeni Müşteri Ekle");
            System.out.println("2. Yeni Film Ekle");
            System.out.println("3. Yeni Salon Ekle");
            System.out.println("4. Filmleri Listele");
            System.out.println("5. Salondaki Müşterileri Listele");
            System.out.println("6. Çıkış");
            System.out.print("Seçiminiz: ");
            int secim = scanner.nextInt();
            scanner.nextLine();  // Konsoldaki boşluğu temizle

            switch (secim) {
                case 1 -> yeniMusteriEkle();
                case 2 -> yeniFilmEkle();
                case 3 -> yeniSalonEkle();
                case 4 -> filmleriListele();
                case 5 -> salondakiMusterileriListele();
                case 6 -> {
                    System.out.println("Çıkılıyor...");
                    return;
                }
                default -> System.out.println("Geçersiz seçenek. Tekrar deneyin.");
            }
        }
    }

    // Yeni Müşteri Ekleme
    public static void yeniMusteriEkle() {
        System.out.print("Müşteri adı: ");
        String ad = scanner.nextLine();
        System.out.print("Müşteri soyadı: ");
        String soyad = scanner.nextLine();
        System.out.print("Müşteri email: ");
        String email = scanner.nextLine();
        Musteri musteri = new Musteri(musteriler.size() + 1, ad + " " + soyad, email); // id'yi arttırarak veriyoruz
        musteriler.add(musteri);
        System.out.println("Müşteri başarıyla eklendi.");
    }

    // Yeni Film Ekleme
    public static void yeniFilmEkle() {
        System.out.print("Film adı: ");
        String ad = scanner.nextLine();
        System.out.print("Film süresi (dakika): ");
        scanner.nextLine();  // Konsoldaki boşluğu temizle
        System.out.print("Film türü: ");
        String tur = scanner.nextLine();
        Film film = new Film(filmler.size() + 1, ad, tur); // id'yi arttırarak veriyoruz
        filmler.add(film);
        System.out.println("Film başarıyla eklendi.");
    }

    // Yeni Salon Ekleme
    public static void yeniSalonEkle() {
        System.out.print("Salon adı: ");
        String ad = scanner.nextLine();
        Salon salon = new Salon(salonlar.size() + 1, ad); // id'yi arttırarak veriyoruz
        salonlar.add(salon);
        System.out.println("Salon başarıyla eklendi.");
    }

    // Filmleri Listeleme
    public static void filmleriListele() {
        if (filmler.isEmpty()) {
            System.out.println("Listelenecek film yok.");
            return;
        }
        System.out.println("Filmler:");
        for (Film film : filmler) {
            System.out.println(film);
        }
    }

    // Salondaki Müşterileri Listeleme
    public static void salondakiMusterileriListele() {
        System.out.print("Salon adını girin: ");
        String salonAdi = scanner.nextLine();
        boolean salonBulundu = false;
        for (Salon salon : salonlar) {
            if (salon.getName().equalsIgnoreCase(salonAdi)) {
                salonBulundu = true;
                System.out.println("Bu salonda kayıtlı müşteriler:");
                for (Musteri musteri : musteriler) {
                    System.out.println(musteri);
                }
                break;
            }
        }
        if (!salonBulundu) {
            System.out.println("Belirtilen salona ait müşteri bulunamadı.");
        }
    }

    public static List<Musteri> getMusteriler() {
        return musteriler;
    }
}

