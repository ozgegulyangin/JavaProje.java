package gun34._04_Protected.Paket2;

import gun34._04_Protected.Paket1.P1Hayvan;

public class P2Main {
    public static void main(String[] args) {
        P1Hayvan p1h=new P1Hayvan();
        p1h.ad="kopek";
        //p1h.yas ve p1h.renk 'e erişilemiyor.
        //
        P2Kedi kedi=new P2Kedi("Hilmi","İran");

    }
}
