package gun28._04_Constructor;

public class Banka {

    String adi;
    int subeSayisi;
    int kurulusYili;

    public Banka() {
    }

    public Banka(String adi, int subeSayisi, int kurulusYili) {
        this.adi = adi;
        this.subeSayisi = subeSayisi;
        this.kurulusYili = kurulusYili;
    }

    public Banka(String adi, int subeSayisi) {
        this.adi = adi;
        this.subeSayisi = subeSayisi;
    }

    @Override
    public String toString() {
        return "Banka{" +
                "adı='" + adi + '\'' +
                ", Şube Sayısı=" + subeSayisi +
                ", Kuruluş Yılı=" + kurulusYili +
                '}';
    }
}
