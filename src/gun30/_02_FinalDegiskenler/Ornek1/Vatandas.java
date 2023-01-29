package gun30._02_FinalDegiskenler.Ornek1;

public class Vatandas {
    String isim;
    final int tcNo; //"final" değiştirilemez
    // yani sadece 1 kez veri atama şansı var.

    static int tcNoSayac=1; // tc no'yu 1 arttırıyor


    public Vatandas(String isim) {
        this.isim = isim;
        this.tcNo = tcNoSayac++;
    }
    @Override
    public String toString() {
        return "Vatandas{" +
                "isim='" + isim + '\'' +
                ", tcNo=" + tcNo +
                '}';
    }

}
