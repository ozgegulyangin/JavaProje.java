package gun29._01_ClassErisimleri.PaketIki;

import gun29._01_ClassErisimleri.PaketBir.PublicErisim;

public class DigerPaketMain {
    public static void main(String[] args) {

        PublicErisim pe = new PublicErisim();
        // DefaultErisim de=new DefaultErisim(); --> farklı pakette olduğu
        // için burada buna erişemiyoruz
        // Diğer paketlerden default belirtecli class a
        //erişilemez, yalnızca kendi paketindekilere erişebilir.

    }
}
