package gun36._03_Interface;

public class GeometriMain {
    public static void main(String[] args) {
        Cember c=new Cember();
        c.ciz(); // çember çizildi
        Dikdortgen d=new Dikdortgen();
        d.ciz(); // dikdörtgen çizildi


        ICizdirir c2=new Cember();
        c2.ciz();  // çember çizildi
        ICizdirir d2=new Dikdortgen();
        d2.ciz();  // dikdörtgen çizildi
        // direkt olarak sadece Interface'deki
        // ismi verilmiş olanlar metodlara erişebilsin
        // INTERFACE'i de aynı polimorfizm için kullanabiliyoruz

        cizdirme(c);
        cizdirme(d);


    }
    public static void cizdirme (ICizdirir iciz){
        iciz.ciz();
    }
}
