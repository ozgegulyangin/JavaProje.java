package gun34._04_Protected.Paket1;

public class P1Main {
    public static void main(String[] args) {

        P1Hayvan p1H=new P1Hayvan();
        p1H.ad="Selami";  // public erişildi
        p1H.yas=2;  // default ,kendi paketi olduğu için erişildi
        p1H.cinsi="Tekir";  // protected erişildi
        // p1H.renk erişilmiyor çünkü PRIVATE


    }
}
